/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author srite
 */
import java.sql.*;
public class DbConfig {
    
    public static Connection getConnection(){
        Connection cn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/empmng", "root", "situl07");
        }
        catch(Exception ee){
            ee.printStackTrace();
        }
        finally{
            return cn;
        }
    }
    
}
