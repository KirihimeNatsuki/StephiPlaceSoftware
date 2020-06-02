package java_uf_application;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enzol
 */
public class AGENCES {
    BDD_Connexion bdd_connexion = new BDD_Connexion();
    
    //Fonction d'ajout d'une agence
    public boolean addAgence(String lieu, Timestamp created_at, Timestamp updated_at){
        PreparedStatement st;
        ResultSet rs;
        String addQuery = "INSERT INTO `agences` (`lieu`, `created_at`, `updated_at` ) VALUES (?, ?, ?)";
        
        try {
            st = bdd_connexion.createConnection().prepareStatement(addQuery);
        
            st.setString(1, lieu);
            st.setTimestamp(2, java.sql.Timestamp.from(java.time.Instant.now()));
            st.setTimestamp(3, java.sql.Timestamp.from(java.time.Instant.now()));
            
            
            return(st.executeUpdate() > 0);
            
        }  catch (SQLException ex) {
            Logger.getLogger(AGENCES.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
       
    
    //Fonction pour modifier les infos d'une agence
    public boolean modifierAgence(int id_agence, String lieu,  Timestamp updated_at){
        PreparedStatement st;
        ResultSet rs;
        String editQuery = "UPDATE `agences` SET `lieu`=?, `updated_at` WHERE `id_agence`=?";
        
        try {
            st = bdd_connexion.createConnection().prepareStatement(editQuery);
            
            
            st.setString(1, lieu);
            st.setTimestamp(2, java.sql.Timestamp.from(java.time.Instant.now()));
            st.setInt(3, id_agence);
            
            return(st.executeUpdate() > 0);
            
        }  catch (SQLException ex) {
            Logger.getLogger(AGENCES.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    //Fonction pour supprimer un client
    public boolean supprimerAgence(int id_agence){
        PreparedStatement st;
        String deleteQuery = "DELETE FROM `agences` WHERE `id_agence`=?";
        
        try {
            st = bdd_connexion.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, id_agence);
            
            return(st.executeUpdate() > 0);
            
        }  catch (SQLException ex) {
            Logger.getLogger(AGENCES.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    //Fonction qui affiche la liste de tous les clients et agents de la BDD
    public void fillAgencesJTable(JTable table){
        
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `agences`";
        
        try {    
            
            ps = bdd_connexion.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[4];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getTimestamp(3);
                row[3] = rs.getTimestamp(4);
                
                tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AGENCES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
