package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
		public static void main(String[] args) throws IOException {
			FileOutputStream fo =new FileOutputStream("D:\\name.txt");
			String str ="File handling concept";
			byte b[]=str.getBytes();
			fo.write(b);
			fo.close();
			System.out.println("Write successful....");
		}
}
