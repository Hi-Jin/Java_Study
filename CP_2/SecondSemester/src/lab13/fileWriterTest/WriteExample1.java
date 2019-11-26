package lab13.fileWriterTest;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("./src/lab13/fileWriterTest/test1.txt");
		char[] data = "홍길동".toCharArray();
		for(int i = 0; i < data.length; i++) {
			writer.write(data);
		}
		writer.flush();
		writer.close();
	}
}
