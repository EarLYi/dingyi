import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 
public class ReadProperties {
 
    public static void main(String[] args) throws IOException {
        InputStream is = ReadProperties.class.getResourceAsStream("/config.properties");
         
        Properties properties = new Properties();
         
        properties.load(is);
         
        is.close();
        String driverURL = properties.getProperty("driverURL");
         
       
        System.out.println(driverURL);
    }
}