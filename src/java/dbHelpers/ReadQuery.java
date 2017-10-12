/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Lipsticks;

/**
 *
 * @author guohuinan
 */
public class ReadQuery {
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery(){   //constructor
   
   

        
             Properties props = new Properties();
             InputStream instr = getClass().getResourceAsStream("dbConn.properties");
         try{
             props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public void doRead(){
        
        try {
            String query = "Select * FROM lipstick ORDER BY itemID ASC";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public String getHTMLTable(){
        
        String table = "";
        table += "<table>";
        
        
                table += "<th>";
                table += "ItemID";
                table += "</th>";
                
                table += "<th>";
                table += "ProductName";
                table += "</th>";
                
                table += "<th>";
                table += "Brand";
                table += "</th>";
                
                table += "<th>";
                table += "Color";
                table += "</th>";
                
                table += "<th>";
                table += "Price";
                table += "</th>";
                
          
        
        try {
            while(this.results.next()){
                
                Lipsticks lipstick = new Lipsticks();
                lipstick.setItemID(this.results.getInt("itemID"));
                lipstick.setProductName(this.results.getString("productName"));
                lipstick.setBrand(this.results.getString("brand"));
                lipstick.setColor(this.results.getString("color"));
                lipstick.setPrice(this.results.getInt("price"));
                
                table += "<tr>";

                table += "<td>";
                table += lipstick.getItemID();
                table += "</td>";
                
                table += "<td>";
                table += lipstick.getProductName();
                table += "</td>";
                
                table += "<td>";
                table += lipstick.getBrand();
                table += "</td>";
                
                table += "<td>";
                table += lipstick.getColor();
                table += "</td>";
                
                table += "<td>";
                table += lipstick.getPrice();
                table += "</td>";
                
               table += "<td>";
               table += "<a href=delete?itemID=" + lipstick.getItemID() + "> Delete </a>";
               table +="</td>";
               
               
               
            table += "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        table += "</table>";
                
                return table;
    }
    
    
    
    
    
}
