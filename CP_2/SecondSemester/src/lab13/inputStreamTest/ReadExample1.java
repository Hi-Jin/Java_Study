package lab13.inputStreamTest;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("./src/lab13/inputStreamTest/test.txt");
		int readByte;
		while((readByte = is.read()) != -1) {
			System.out.println((char) readByte);
		}
		is.close();
	}
}
