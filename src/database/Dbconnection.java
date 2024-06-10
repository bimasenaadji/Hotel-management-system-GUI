/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Dbconnection {
    Connection conn;
    
    public Dbconnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management","root","Bima1203");
    }catch(Exception error){
        JOptionPane.showMessageDialog(null, error);
    }
    
    }
    
    public Connection getConnection(){
        return conn;
    }
}
