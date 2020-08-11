
package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class Dbconnect {
   public static Connection c; 
   public static Statement st;
   static{
       try{
       c=DriverManager.getConnection( "jdbc:mysql://localhost:3306/spendingtracker"+"?openSSL=false", "root","sumit@123");
         st=c.createStatement();
   }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
}
   }
}