package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class AccessingGlobal
{

	@Test
	public  void Data() throws IOException
	
	{
		
		Properties pros= new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\latha\\Desktop\\Selenium Projects\\GlobalVariable\\src\\Properties\\GlobalData.Properties");
		pros.load(fis);
		System.out.println(pros.getProperty("URL"));
		System.out.println(pros.getProperty("Password"));
	    pros.setProperty("URL","IE");
	    System.out.println(pros.getProperty("URL"));
	    FileOutputStream fos = new FileOutputStream("C:\\Users\\latha\\Desktop\\Selenium Projects\\GlobalVariable\\src\\Properties\\GlobalData.Properties");
	    pros.store(fos, null);

	}
	
}
