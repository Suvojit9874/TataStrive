package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
		public static void main(String[] args) throws IOException{
			FileInputStream fis =new FileInputStream("D:\\name.txt");
//			System.out.println("Available data " + fis.available());
//			fis.available();
//			fis.read();
//			fis.read();
//			fis.read();
//			System.out.println("Available data " + fis.available());
			int i=fis.read();
			while(i !=-1) {
				System.out.print((char)i);
				i=fis.read();
			}
			fis.close();
		}
}
