package FileHandling;

import java.io.File;

public class FileInfo {
		public static void main(String[] args) {
			File fo =new File("D:date.txt");
			if(fo.exists()) {
				System.out.println("File name : "+fo.getName());
				System.out.println("File path : "+fo.getAbsolutePath());
				System.out.println("Is file readable : "+fo.canRead());
				System.out.println("Is File Writable : "+fo.canWrite());
				System.out.println("Size of the file in Bytes : "+fo.length());
			}else {
				System.out.println("File does not exists ");
			}
		}
}
