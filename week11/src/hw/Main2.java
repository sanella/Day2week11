package hw;

import java.io.*;

public class Main2 {

	private static void cleanBuffer(byte[] buffer, int numRead) {
		for (int i = 0; i < numRead; i++) {
			buffer[i] = 0;
		}
	}

	public static void main(String[] args) {
		byte[] inputBuffer = new byte[10];

		FileInputStream fs = null;
		InputStream is ;
		OutputStream os;
		FileOutputStream ofs;

		
		// za prosircanje stringa
		StringBuilder sb = new StringBuilder();

		try {
		

			fs = new FileInputStream("./Files/sanela.txt");
			is = new DataInputStream(fs);
			
			BufferedInputStream bs = new BufferedInputStream(is);
			ofs = new FileOutputStream("./Files/UpisiSanela.txt");
			os = new DataOutputStream(ofs);
			
			int numread = 0;
			
			while ((numread = is.read(inputBuffer)) >= 0) {
				sb.append(new String(inputBuffer));
				os.write(inputBuffer);
				cleanBuffer(inputBuffer, numread);

			}
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