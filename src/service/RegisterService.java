/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;  
//import java.util.UUID;
/**
 *
 * @author srite
 */
public class RegisterService {
    public static boolean addUser(String username, String email, String password, String address, String phone){
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        //String ID = UUID.randomUUID().toString();
        try{    
            cn = repository.DbConfig.getConnection();
            st = cn.createStatement();
            
            st.executeUpdate("insert into emp values( '"+username+"' , '"+email+"' , '"+password+"' , '"+address+"' , '"+phone+"')");
                return true;
        }
        catch(Exception e){
                    e.printStackTrace();
                    }
            return false;
    }
 
}
