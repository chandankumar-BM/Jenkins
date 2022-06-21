package classicselenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WorkingwithProperrtyFile {
public static String Value(String value) throws IOException{
	FileInputStream fis=new FileInputStream("./test/config.properties");
	Properties property=new Properties();
	property.load(fis);
	return property.getProperty(value);
}
}
