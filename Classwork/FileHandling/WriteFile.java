package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
		public static void main(String[] args) throws IOException{
			FileWriter fw =new FileWriter("D:date.txt");
			fw.write("Hello world \n hnvghhoi \n skjflsdj;sjgjljslhiow;jhsdfjhsdfhklfvdfjkl");
			fw.close();
			System.out.println("Write successful.....");
		}
}
