package RequestUtility;

import java.io.*;
import java.util.Properties;

public class peopertyUtil 
{
	public static Properties pro;
    private File file;
    private FileInputStream fis;
    
    
	public peopertyUtil(String 	FilePath)
	{
		
		if(FilePath==null)
		{
		try 
		{
			throw new exceptionException("File does not exist");
		} 
		catch (exceptionException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		file = new File(FilePath);
		try {
			fis = new FileInputStream(file);
			pro= new Properties();
			pro.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String readURI()
	{
		return pro.getProperty("uri");
	}
	
	public static String readFirstEmail()
	{
		return pro.getProperty("email1");
	}
	
	public static String readFirstName()
	{
		return pro.getProperty("first_name1");
	}
	
	public static String readLastName()
	{
		return pro.getProperty("last_name1");
	}
}
