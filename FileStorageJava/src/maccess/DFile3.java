package maccess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DFile3 {

	public static void main(String[] args) {
		try {
			//Creates File Instance of provided source file path
			File file = new File("C:\\Users\\samaddi\\OneDrive - Capgemini\\Pictures\\Screenshots\\Screenshot (49).png");
			
			//To Open the file we use FileInputStream class
			FileInputStream fis = new FileInputStream(file);
			
			//To create an empty file of provided destination file path
			FileOutputStream fos = new FileOutputStream("C:\\Users\\samaddi\\OneDrive - Capgemini\\Desktop\\Tax\\Sample.png");
			
			//Used to get how many bytes are available to be read
			int size = fis.available();
			
			System.out.println(size);
			
			//To read 8 KB at a time 1024 Bytes ---> 1KB
			byte[] bytes = new byte[8192];
			
			int k;
			//To read bytes from file 8KB at a time, when there are no bytes to be read it will be -1 (like end of file)
			while ((k = fis.read(bytes)) != -1) {
				//To write the read bytes in destination file path
				fos.write(bytes);
				System.out.println(fis.available());
			}
			fos.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
