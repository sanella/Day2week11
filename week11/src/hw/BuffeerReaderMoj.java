package hw;

import java.io.*;

public class BuffeerReaderMoj {
	private static void cleanBuffer(byte[] buffer, int numRead) {
		for (int i = 0; i < numRead; i++) {
			buffer[i] = 0;
		}
	}

	public static void main(String[] args) {
		byte[] inputBuffer = new byte[10];

		FileInputStream fs = null;
		InputStreamReader is ;
		OutputStream os;
		FileOutputStream ofs;
		BufferedReader br;

		
		// za prosircanje stringa
		StringBuilder sb = new StringBuilder();

		try {
		

			fs = new FileInputStream("./Files/sanela.txt");
			is = new InputStreamReader(fs);
			br = new BufferedReader(is);
			ofs = new FileOutputStream("./Files/sanela.txt", true);
			os = new DataOutputStream(ofs);
			
			int numread = 0;
			String lineString = "";
			while( (lineString = br.readLine()) != null ){
				sb.append(lineString).append("\n");
			
				
			}
			os.write(sb.toString().getBytes());
			
			
			
			System.out.println("Citanje zavrseno");
			//String outputString = sb.toString();
			//os.write(outputString.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e1) {

			e1.printStackTrace();
		} finally {
			System.out.println("\ngotovo");
		}

	}

}
