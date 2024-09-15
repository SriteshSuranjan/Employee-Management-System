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
public class ViewService {
    
    public static ResultSet viewUser(){
        try{
            Connection cn = repository.DbConfig.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from emp");
            return rs;
        }catch(Exception ee){
            ee.printStackTrace();
        }
        return null;
    }
    
}
