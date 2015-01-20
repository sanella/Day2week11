package Day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class FileWork {

	
	
	public static void main(String[] args) {
		
		String str = "/Users/sanelagrcic/Desktop/sanela.txt";
		
		
		File folder = new File(str);

		if(folder.exists()){
		  System.out.println("postoji");
		} else {
			System.out.println("ne valja putanja");
//			return;
		}
		if(folder.isFile()){
			System.out.println("ovo je file");
//			return;
		}
		
	
		String data = "";

		Scanner reader = null;
		
		try {
			
			reader = new Scanner(new File(str));//!!!!!!!!!!!!!
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		data = reader.nextLine();
	  System.out.println(data);
	
			reader.close();
	   
		
	}
}
