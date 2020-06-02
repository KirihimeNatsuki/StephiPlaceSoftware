package java_uf_application;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Timestamp;

/**
 *
 * @author enzol
 */
public class BIENS {
    
    BDD_Connexion bdd_connexion = new BDD_Connexion();
    
    //Remplissage du tableau affichant les différents biens
    public void fillBiensJTable(JTable table){
        
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `biens`";
        
        try {    
            
            ps = bdd_connexion.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[16];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getDouble(8);
                row[8] = rs.getDouble(9);
                row[9] = rs.getInt(10);
                row[10] = rs.getBoolean(11);
                row[11] = rs.getBoolean(12);
                row[12] = rs.getBoolean(13);
                row[13] = rs.getBoolean(14);
                row[14] = rs.getBoolean(17);
                row[15] = rs.getBoolean(18);

                tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BIENS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Fonction pour ajouter un biens
    public boolean addBiens(int id_bien, int id_vendeur, int id_agent, String nom, String lieu, String type, String description, double prix, double superficie, int pieces, boolean jardin, boolean cave, boolean garage, boolean piscine, boolean vendu, boolean annonce, Timestamp created_at, Timestamp updated_at){
        PreparedStatement st;
        ResultSet rs;
        String addQuery = "INSERT INTO `biens` (`id_bien`, `id_vendeur`, `id_agent`, `nom`, `lieu`, `type`, `description`, `prix`, `surface`, `pieces`, `jardin`, `cave`, `garage`, `piscine`, `vendu`, `affiche`, `created_at`, `updated_at`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            st = bdd_connexion.createConnection().prepareStatement(addQuery);
        
            st.setInt(1, id_bien);
            st.setInt(2, id_vendeur);
            st.setInt(3, id_agent);
            st.setString(4, nom);
            st.setString(5, lieu);
            st.setString(6, type);
            st.setString(7, description);
            st.setDouble(8, prix);
            st.setDouble(9, superficie);
            st.setInt(10, pieces);
            st.setBoolean(11, jardin);
            st.setBoolean(12, cave);
            st.setBoolean(13, garage);
            st.setBoolean(14, piscine);
            st.setBoolean(15, vendu);
            st.setBoolean(16, annonce);
            st.setTimestamp(17, java.sql.Timestamp.from(java.time.Instant.now()));
            st.setTimestamp(18, java.sql.Timestamp.from(java.time.Instant.now()));

            
            return(st.executeUpdate() > 0);
            
        }  catch (SQLException ex) {
            Logger.getLogger(BIENS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Fonction pour modifier les infos d'un bien
    public boolean modifierBiens(int id_bien, int id_vendeur, int id_agent, String nom, String lieu, String type, String description, double prix, double superficie, int pieces, boolean jardin, boolean cave, boolean garage, boolean piscine, boolean vendu, boolean annonce, Timestamp updated_at){
        PreparedStatement st;
        ResultSet rs;
        String editQuery = "UPDATE `biens` SET `id_vendeur`=?,`id_agent`=?,`nom`=?,`lieu`=?,`type`=?,`description`=?,`prix`=?,`surface`=?,`pieces`=?,`jardin`=?,`cave`=?,`garage`=?,`piscine`=?,`vendu`=?,`affiche`=?,`updated_at`=? WHERE `id_bien`=?";
        
        try {
            st = bdd_connexion.createConnection().prepareStatement(editQuery);
            
            st.setInt(1, id_vendeur);
            st.setInt(2, id_agent);
            st.setString(3, nom);
            st.setString(4, lieu);
            st.setString(5, type);
            st.setString(6, description);
            st.setDouble(7, prix);
            st.setDouble(8, superficie);
            st.setInt(9, pieces);
            st.setBoolean(10, jardin);
            st.setBoolean(11, cave);
            st.setBoolean(12, garage);
            st.setBoolean(13, piscine);
            st.setBoolean(14, vendu);
            st.setBoolean(15, annonce);
            st.setTimestamp(16, new java.sql.Timestamp(new java.util.Date().getTime()));
            st.setInt(17, id_bien);

            
            return(st.executeUpdate() > 0);
            
        }  catch (SQLException ex) {
            Logger.getLogger(BIENS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Fonction pour supprimer un bien
    public boolean supprimerBiens(int id_bien){
        PreparedStatement st;
        String deleteQuery = "DELETE FROM `biens` WHERE `id_bien`=?";
        
        try {
            st = bdd_connexion.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, id_bien);
            
            return(st.executeUpdate() > 0);
            
        }  catch (SQLException ex) {
            Logger.getLogger(BIENS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}    
