package assignmentdataDrivenfm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyfileread {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./Data/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty("Browser");
		System.out.println(data);


	}

}

