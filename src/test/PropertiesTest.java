package test;

import utils.SqlHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ProjectName: javaSe_review
 * @ClassName: PropertiesTest
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-20 12:29
 */
public class PropertiesTest {
    
    public static void main(String[] args) {
        Properties properties= new Properties();
        String path = "/db.properties";
        InputStream inputStream =new PropertiesTest().getClass().getResourceAsStream(path);
        System.out.println(inputStream);
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            System.out.println("抛出异常");
        }
        System.out.println(properties.getProperty("jdbc.url"));
    }
}
