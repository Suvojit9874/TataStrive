package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
		public static void main(String[] args) throws FileNotFoundException{
			File f1 =new File("D:date.txt");
			Scanner dataReader =new Scanner(f1);
			while(dataReader.hasNextLine()) {
				String filedata =dataReader.nextLine();
				System.out.println(filedata);
				
			}
			dataReader.close();
		}
}
