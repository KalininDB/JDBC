package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	 private static Properties configFile;
     static {
         try {
        
         FileInputStream fileInputStream = new FileInputStream("configuration.properties");
        
         configFile = new Properties();
       
         configFile.load(fileInputStream);
             
             fileInputStream.close();
         } catch (IOException e) {
            
         }
     }
     
     public static String getProperty(String key) {
         return configFile.getProperty(key);
     }
     
 
     
     public static void main(String[] args) {
		String url = getProperty("JDBC_URL");
		String password = getProperty("JDBC_PassWord");
		String username = getProperty("JDBC_UserName");
		
		System.out.println(url+"\n"+password+"\n"+username);
		
	}
     
}