package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args)  {
		File fo = new File("D:date.txt");
		try {
			if (fo.createNewFile()) {
				System.out.println("File "+fo.getName()+" is created successfully");
			}else {
				System.out.println("File is already exists ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
