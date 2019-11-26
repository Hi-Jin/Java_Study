package lab13.fileWriterTest;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample2 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("./src/lab13/fileWriterTest/test2.txt");
		char[] data = "홍길동".toCharArray();
		writer.write(data);
		
		writer.flush();
		writer.close();
	}
}
