package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExe {
	public static void main(String[]args) throws IOException{
	try {
		File f=new File("C:\\Users\\Asus\\OneDrive\\Desktop\\Dem.txt");
	FileReader fr=new FileReader(f);
	int temp=0;
	while((temp=fr.read())!=-1) {
		System.out.print((char)(temp));
	}
	}
	catch(FileNotFoundException f){
		System.out.println("File not Found");
	}
	}

}
