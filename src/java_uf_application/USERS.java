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
public class USERS {
    BDD_Connexion bdd_connexion = new BDD_Connexion();
    
    //Fonction d'ajout d'un utilisateur
    public boolean addUser(String prenom, String nom, String tel, String email, String password, int role, Timestamp created_at, Timestamp updated_at){
        PreparedStatement st;
        ResultSet rs;
        String addQuery = "INSERT INTO `users` (`prenom`, `nom`, `telephone`, `email`, `password`, `role`, `created_at`, `updated_at`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            st = bdd_connexion.createConnection().prepareStatement(addQuery);
            MessageDigest digest = null;
            try {
                digest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(USERS.class.getName()).log(Level.SEVERE, null, ex);
            }
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
        
            // Convert byte array into signum representation  
            BigInteger number = new BigInteger(1, hash);  
  
            // Convertis le message digest en valeur hexadécimale   
            StringBuilder hexString = new StringBuilder(number.toString(16));  
  
            // Pad with leading zeros 
            while (hexString.length() < 32)  
            {  
                hexString.insert(0, '0');  
            }
        
            String passwordHashed = hexString.toString();
        
            st.setString(1, prenom);
            st.setString(2, nom);
            st.setString(3, tel);
            st.setString(4, email);
            st.setString(5, passwordHashed);
            st.setInt(6, role);
            st.setTimestamp(7, java.sql.Timestamp.from(java.time.Instant.now()));
            st.setTimestamp(8, java.sql.Timestamp.from(java.time.Instant.now()));
            
            
            return(st.executeUpdate() > 0);
            
        }  catch (SQLException ex) {
            Logger.getLogger(USERS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
       
    
    //Fonction pour modifier les infos d'un utilisateur
    public boolean modifierUser(int id, String prenom, String nom, String tel, String email, int role, Timestamp updated_at){
        PreparedStatement st;
        ResultSet rs;
        String editQuery = "UPDATE `users` SET `prenom`=?, `nom`=?, `telephone`=?, `email`=?, `role`=?, `updated_at`=? WHERE `id_user`=?";
        
        try {
            st = bdd_connexion.createConnection().prepareStatement(editQuery);
            
            
            st.setString(1, prenom);
            st.setString(2, nom);
            st.setString(3, tel);
            st.setString(4, email);
            st.setInt(5, role);
            st.setTimestamp(6, java.sql.Timestamp.from(java.time.Instant.now()));
            st.setInt(7, id);
            
            return(st.executeUpdate() > 0);
            
        }  catch (SQLException ex) {
            Logger.getLogger(USERS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    //Fonction pour supprimer un utilisateur
    public boolean supprimerUser(int id){
        PreparedStatement st;
        String deleteQuery = "DELETE FROM `users` WHERE `id_user`=?";
        
        try {
            st = bdd_connexion.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, id);
            
            return(st.executeUpdate() > 0);
            
        }  catch (SQLException ex) {
            Logger.getLogger(USERS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean mdpUser(int id, String password, Timestamp updated_at){
        PreparedStatement st;
        String mdpQuery = "UPDATE `users` SET `password`=?, `updated_at`=? WHERE `id_user`=?";
        
        try {
            st = bdd_connexion.createConnection().prepareStatement(mdpQuery);
            MessageDigest digest = null;
            try {
                digest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(USERS.class.getName()).log(Level.SEVERE, null, ex);
            }
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
        
            // Convert byte array into signum representation  
            BigInteger number = new BigInteger(1, hash);  
  
            // Convertis le message digest en valeur hexadécimale  
            StringBuilder hexString = new StringBuilder(number.toString(16));  
  
            // Pad with leading zeros 
            while (hexString.length() < 32)  
            {  
                hexString.insert(0, '0');  
            }
        
            String passwordHashed = hexString.toString();
        
            st.setString(1, passwordHashed);
            st.setTimestamp(2, java.sql.Timestamp.from(java.time.Instant.now()));
            st.setInt(3, id);
            
            return(st.executeUpdate() > 0);
            
        }  catch (SQLException ex) {
            Logger.getLogger(USERS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    //Fonction qui affiche la liste de tous les clients et agents de la BDD
    public void fillUsersJTable(JTable table){
        
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `users` WHERE `role`<3";
        
        try {    
            
            ps = bdd_connexion.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[6];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getInt(8);
                
                tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(USERS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
