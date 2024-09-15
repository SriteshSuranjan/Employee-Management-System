/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;

/**
 *
 * @author srite
 */
public class LoginService {
    public static boolean validUser(String username, String password){
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            cn = repository.DbConfig.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery("select * from emp where username = '"+username+"' and password = '"+password+"'");
            while(rs.next()){
                return true;
            }
        }
        catch(Exception ee){
                    ee.printStackTrace();
                    }
            return false;
    }
}
