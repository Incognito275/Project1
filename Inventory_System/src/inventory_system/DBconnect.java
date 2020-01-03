/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_system;

import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DBconnect {
    Connection conn = null;
        Statement stmt = null;
        public DBconnect() {
    }
        public void open(){
            try { 
            String userName = "root";
            String password = "1234";
            String url = "jdbc:mysql://localhost:3306/inventory";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password); 
            stmt = conn.createStatement();
    } catch (Exception e){ 
          //  System.err.println("Cannot connect to database server");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        }
        public void close(){
            conn=null; stmt=null;
            System.gc();
        }
    public static void main(String[] args){
        
               }
    
            }
        

