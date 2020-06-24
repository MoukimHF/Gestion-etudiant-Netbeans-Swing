/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahmed
 */
public class Cnx {

   public Connection con;
     
    public Cnx(){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionEtudiant?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Cnx.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cnx.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    

}
