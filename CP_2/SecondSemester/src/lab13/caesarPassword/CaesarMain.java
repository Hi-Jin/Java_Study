package lab13.caesarPassword;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CaesarMain {

	static final String FILEPATH = "./src/lab13/caesarPassword/";
	static final String ORIGINAL_FILE_NAME = "original.txt";
	static final String CIPHERTEXT_FILE_NAME = "caesar.txt";
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader(FILEPATH + ORIGINAL_FILE_NAME);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(FILEPATH + CIPHERTEXT_FILE_NAME);
			bw = new BufferedWriter(fw);

			String result = "";
			int readInt;
			while((readInt = br.read()) != -1) {
				result += (char) readInt;
				readInt = Character.toUpperCase(readInt);
				if(!('A' <= readInt && readInt <= 'Z')) {
					bw.write(readInt);
				} else
					bw.write(((readInt += 3) <= 'Z') ? readInt : readInt - ('Z' - 'A' + 1));
			}
			System.out.println(result);
			
			bw.flush();
			bw.close();
			fw.close();
			
			
			fr = new FileReader(FILEPATH + CIPHERTEXT_FILE_NAME);
			br = new BufferedReader(fr);
			result = "";
			while((readInt = br.read()) != -1) {
				result += (char) readInt;
			}
			System.out.println("\n" + result);
			
			br.close();
			fr.close();
		} catch(IOException e) {
			System.out.println(FILEPATH + "에 " + ORIGINAL_FILE_NAME + "가 존재하지 않습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("기타 오류가 발생했습니다.");
			e.printStackTrace();
		}
	}
}
