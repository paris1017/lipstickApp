
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
public class ReadRecord {
    
      private Connection conn;
    private ResultSet results;
    
    private Lipsticks lipstick = new Lipsticks();
    private int itemID;
    
    
    
   public ReadRecord (int itemID){

        
             Properties props = new Properties();
             InputStream instr = getClass().getResourceAsStream("dbConn.properties");
         try{
             props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        
        this.itemID = itemID;
   
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    

   }
   
   
   
    public void doRead(){
        
        try {
             String query = "Select * FROM lipstick WHERE itemID=? ";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, itemID);
            
            this.results = ps.executeQuery();
            
            this.results.next();
            

             lipstick.setItemID(this.results.getInt("itemID"));
                lipstick.setProductName(this.results.getString("productName"));
                lipstick.setBrand(this.results.getString("brand"));
                lipstick.setColor(this.results.getString("color"));
                lipstick.setPrice(this.results.getInt("price"));
                
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public Lipsticks getLipstick(){
        
        return this.lipstick;
        
    }
   
   
   
}
