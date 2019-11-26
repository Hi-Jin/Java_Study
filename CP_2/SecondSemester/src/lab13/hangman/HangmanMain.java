package lab13.hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HangmanMain {

	static final String FILEPATH = "./src/lab13/hangman/";
	static final String SAMPLE_NAME = "sample.txt";
	static char[] problem;
	static char[] userAnswer;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		getProblem();
		
		int trialLimit = problem.length * 2;
		userAnswer = new char[problem.length];
		for(int i = 0; i < problem.length; i++) {
			userAnswer[i] = '_';
		}
		System.out.println("행맨 게임!\n(제한 횟수는 " + trialLimit + "번입니다.)");
		
		String strUserInput;
		char userInput;
		int count = 0;
		int correctCount = 0;
		while(correctCount < problem.length && count++ < trialLimit) {
			System.out.println("현재 상태 :" + getCurrentStatus());
			System.out.print("문자를 입력해주세요(한글자): ");
			strUserInput = sc.next();
			
			if(strUserInput.length() != 1) {
				System.out.println("한글자만 입력가능합니다.");
				count--;
				continue;
			}
			userInput = strUserInput.charAt(0);
			for(int i = 0; i < problem.length; i++) {
				if(userAnswer[i] != problem[i] && Character.toLowerCase(problem[i]) == Character.toLowerCase(userInput)) {
					userAnswer[i] = problem[i];
					correctCount++;
					break;
				}
			}
		}
		if(correctCount == problem.length) {
			System.out.println("현재 상태 :" + getCurrentStatus());
			System.out.println("정답을 맞췄습니다.");
		}else {
			System.out.println("정답을 맞추지 못했습니다.");
			System.out.println("정답: " + problem.toString());
		}
		
		sc.close();
	}
	
	public static String getCurrentStatus() {
		String currentStatus = "";
		for(int i = 0; i < userAnswer.length; i++) {
			currentStatus += " " + userAnswer[i];
		}
		return currentStatus;
	}
	
	public static void getProblem() {
		FileReader fr = null;
		BufferedReader br = null;
		Scanner sc = null;
		
		try {
			fr = new FileReader(FILEPATH + SAMPLE_NAME);
			br = new BufferedReader(fr);
			sc = new Scanner(br);
			
			int sampleCount = 0;
			while(sc.hasNextLine()) {
				sc.nextLine();
				sampleCount++;
			}
			sc.close();
			br.close();
			fr.close();
			
			fr = new FileReader(FILEPATH + SAMPLE_NAME);
			br = new BufferedReader(fr);
			sc = new Scanner(br);
			int problemNum = (int) (Math.random() * sampleCount);
			for(int i = 0; i < problemNum - 1; i++)
				sc.nextLine();
			String strProblem = sc.nextLine();
			problem = strProblem.toCharArray().clone();
			
			sc.close();
			br.close();
			fr.close();
		} catch(IOException e) {
			System.out.println(FILEPATH + "에 " + SAMPLE_NAME + "가 없습니다.");
		} catch(Exception e) {
			System.out.println("기타 오류가 발생했습니다.");
		}
	}
}
