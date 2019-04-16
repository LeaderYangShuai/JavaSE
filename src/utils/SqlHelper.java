package utils;

import java.io.IOException;
import java.io.InputStream;
import java.security.PublicKey;
import java.sql.*;
import java.util.Properties;

/**
 * @ProjectName: javaSe_review
 * @ClassName: SqlHelper
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-20 11:40
 */
public class SqlHelper {

    static Connection connection;
    static PreparedStatement preparedStatement;
    static ResultSet resultSet;

    static Properties properties= new Properties();
    static {

        String path = "dbImage.properties";
        InputStream inputStream =SqlHelper.class.getClassLoader().getResourceAsStream(path);

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

         try {
             Class.forName(properties.getProperty("jdbc.driver"));
             connection = DriverManager.getConnection(properties.getProperty("jdbc.url"),
                     properties.getProperty("jdbc.username"),properties.getProperty("jdbc.password"));
         } catch (ClassNotFoundException e1) {
             e1.printStackTrace();
         } catch (SQLException e1) {
             e1.printStackTrace();
         }
     }

    public static void insert(String sql){
        try {
            preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
             if (preparedStatement.executeUpdate()==1){
                 System.out.println("添加成功");
             }else{
                 System.out.println("添加失败");
                 System.out.println(sql);
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
    }
    public static void delete(String sql){
        try {
            preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (preparedStatement.executeUpdate()==1){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
                System.out.println(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int countSum(String sql){
        int count =0;
        try {
            preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return count;
    }

    public static int endMax(String sql){
        int endMax = 0;
        try {
            preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                endMax= resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return endMax;
    }


    public static void insertImage(String sql){
        try {
            preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (preparedStatement.executeUpdate()==1){
                System.out.println("添加图片成功");
            }else{
                System.out.println("添加图片失败");
                System.out.println(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
