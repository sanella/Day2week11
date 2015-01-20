package hw;

import java.io.*;

import javax.swing.JFileChooser;

public class BufferRiderMojNapredni {

	public static void main(String[] args) {

		JFileChooser filePicker = new JFileChooser();
		System.out.println();
		filePicker.setCurrentDirectory(new File(System.getProperty("user.home")
				+ "/Documents/workspace"));

		int open = -1;
		while(open !=  filePicker.APPROVE_OPTION){
			open = filePicker.showOpenDialog(filePicker);

		}
//		if (open != filePicker.APPROVE_OPTION) {
//			System.exit(-1);
//		}
		String pickedFile = filePicker.getSelectedFile().getAbsolutePath();

		
		//---------------------------------------------
		
		/*JFileChooser filePicker2 = new JFileChooser();
		System.out.println();
		filePicker.setCurrentDirectory(new File(System.getProperty("user.home")
				+ "/Documents"));*/
		open = -1;
		while(open !=  filePicker.APPROVE_OPTION){
			open = filePicker.showSaveDialog(filePicker);
		}
	
		String pickedFile2 = filePicker.getSelectedFile().getAbsolutePath();
		
		FileInputStream fs = null;
		InputStreamReader is;
		OutputStream os;
		FileOutputStream ofs;
		BufferedReader br;

		// za prosircanje stringa
		StringBuilder sb = new StringBuilder();

		try {

			fs = new FileInputStream(pickedFile);
			is = new InputStreamReader(fs);
			br = new BufferedReader(is);
			ofs = new FileOutputStream(pickedFile2);
			os = new DataOutputStream(ofs);

			int numread = 0;
			String lineString = "";
			while ((lineString = br.readLine()) != null) {
				sb.append(lineString).append("\n");

			}
			os.write(sb.toString().getBytes());

			System.out.println("Citanje zavrseno");

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e1) {

			e1.printStackTrace();
		} finally {
			System.out.println("\ngotovo");
		}

	}

}