package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	

	public static String getproperty(String key) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String val=null;
		try {
			FileInputStream fis = new FileInputStream(path + "\\src\\test\\resources\\objectRepository.properties");
			Properties p = new Properties();
			p.load(fis);
			val = p.getProperty(key);
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

			e.printStackTrace();
		}
		return val;

	}
	
	public static String[] getLocator(String key) throws IOException {
		String path=System.getProperty("user.dir");
		String[] val=null;
		FileInputStream fis=new FileInputStream(path+"\\src\\test\\resources\\objectRepository.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String value=pro.getProperty(key);
		val=value.split("##");
		
		return null;
		
	}

}
