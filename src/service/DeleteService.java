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
public class DeleteService {
    public static boolean deleteUser(String username){
         try{
            Connection cn = repository.DbConfig.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from emp where username = '"+username+"'");
             while(rs.next()){
                 st.executeUpdate("delete from emp where username='"+username+"'");
                 return true;
             }
        }catch(Exception ee){
            ee.printStackTrace();
        }
        return false;
    }
    
}
