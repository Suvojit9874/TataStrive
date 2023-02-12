package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
	public static void main(String[] args) {
		FileInputStream fs=null;
		FileOutputStream os=null;
		try {
		fs=new FileInputStream("D:\\test.txt");
		os= new FileOutputStream("D:\\copy.txt");
		int i=fs.read();
		while(i!=-1)
		{
			os.write(i);
			i=fs.read();
		}
		System.out.println("Successfully copied");
		}catch(Exception e)
		{
			System.out.println("an unexpected exception occur");
		}finally {
			try {
			if(fs!=null)
				fs.close();
			if(os!=null)
				os.close();
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}
