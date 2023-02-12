package FileHandling;

import java.io.File;

public class FileDelete {
		public static void main(String[] args) {
			File fo = new File("D:date.txt");
			if(fo.delete()) {
				System.out.println(fo.getName()+"is deleted successfully");
			}else {
				System.out.println("Error found");
			}
		}
}
