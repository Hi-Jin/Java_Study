package lab13.fileReaderTest;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("./src/lab13/fileReaderTest/test.txt");
		int readData;
		while((readData = reader.read()) != -1) {
			System.out.print((char) readData);
		}
		reader.close();
	}
}
