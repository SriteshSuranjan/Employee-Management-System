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
public class UpdateService {
     public static boolean updateUser(String username, String email,String password,String phone,String address){
//        Connection cn = null;
//        Statement st = null;
//        ResultSet rs = null;
         try{
            Connection cn = repository.DbConfig.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from emp where username = '"+username+"'");
             while(rs.next()){
                 st.executeUpdate("update emp set email='"+email+"', password='"+password+"',phone='"+phone+"' ,address='"+address+"' where username='"+username+"'");
                 return true;
             }
        }catch(Exception ee){
            ee.printStackTrace();
        }
        return false;
    }
}
