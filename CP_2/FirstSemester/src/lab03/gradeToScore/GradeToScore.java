package lab03.gradeToScore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeToScore {

	private static ArrayList<String> gradeList = new ArrayList<>();
	
	private static Map<String, Double> scoreMap = new HashMap<>();
	
	public static void setScoreMap() {
		scoreMap.put("A", 4.0);
		scoreMap.put("B", 3.0);
		scoreMap.put("C", 2.0);
		scoreMap.put("D", 1.0);
		scoreMap.put("F", 0.0);
	}
	
	public static void printScore() {
		setScoreMap();
		
		for(String grade : gradeList) {
			System.out.println("저장된 학점: " + grade + " 변환한 점수: " + scoreMap.get(grade));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input;
		
		while(true) {
			System.out.print("학점을 입력하세요(A, B, C, D, F): ");
			input = sc.nextLine().toUpperCase();
			if(input.equals("")) {
				System.out.println("------------------------------");
				break;
			}
			if(!(input.equals("A") || 
					input.equals("B") || 
					input.equals("C") || 
					input.equals("D") || 
					input.equals("F"))
			) {
				System.out.println("잘못된 학점 입력입니다.");
				continue;
			}
			gradeList.add(input);
		}
		
		printScore();
		
		sc.close();
	}
}
