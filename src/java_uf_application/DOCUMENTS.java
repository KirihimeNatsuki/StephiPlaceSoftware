package java_uf_application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enzol
 */
public class DOCUMENTS {
  
    BDD_Connexion bdd_connexion = new BDD_Connexion();
    //Remplissage du tableau affichant les différents documents de chaques biens
    public void fillDocsJTable(JTable table){
        
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `biens`";
        
        try {    
            
            ps = bdd_connexion.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
                    
            Object[] row;
            
            while(rs.next()){
                row = new Object[6];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getBinaryStream(15);
                row[4] = rs.getBinaryStream(19);
                row[5] = rs.getBinaryStream(20);
                
                tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DOCUMENTS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Fonction pour ajouter un document de bien
    public boolean addDocs(int id_bien, String image_path, String mandat_path, String contrat_path, Timestamp updated_at){
        PreparedStatement st;
        ResultSet rs;
        String addQuery = "UPDATE `biens` SET `image`=?, `mandat`=?, `contrat`=?, `updated_at`=? WHERE `id_bien`=?";
        
        try {
            try {
            FileInputStream image = new FileInputStream(new File(image_path));
            FileInputStream mandat = new FileInputStream(new File(mandat_path));
            FileInputStream contrat = new FileInputStream(new File(contrat_path));
            st = bdd_connexion.createConnection().prepareStatement(addQuery);
            
            st.setBinaryStream(1, image);
            st.setBinaryStream(2, mandat);
            st.setBinaryStream(3, contrat);
            st.setTimestamp(4, new java.sql.Timestamp(new java.util.Date().getTime()));
            st.setInt(5, id_bien);
            
            return(st.executeUpdate() > 0);
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(DOCUMENTS.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }  catch (SQLException ex) {
            Logger.getLogger(DOCUMENTS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Fonction pour modifier les infos des documents d'un bien
    public boolean modifierDocs(int id_bien, String image_path, String mandat_path, String contrat_path, Timestamp updated_at){
        PreparedStatement st;
        ResultSet rs;
        String editQuery = "UPDATE `biens` SET `image`=?, `mandat`=?, `contrat`=?, `updated_at`=? WHERE `id_bien`=?";
        
        try {
            try {
            FileInputStream image = new FileInputStream(new File(image_path));
            FileInputStream mandat = new FileInputStream(new File(mandat_path));
            FileInputStream contrat = new FileInputStream(new File(contrat_path));
            st = bdd_connexion.createConnection().prepareStatement(editQuery);
            
            st.setBinaryStream(1, image);
            st.setBinaryStream(2, mandat);
            st.setBinaryStream(3, contrat);
            st.setTimestamp(4, new java.sql.Timestamp(new java.util.Date().getTime()));
            st.setInt(5, id_bien);
            
            return(st.executeUpdate() > 0);
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(DOCUMENTS.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }  catch (SQLException ex) {
            Logger.getLogger(DOCUMENTS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Fonction pour supprimer les documents d'un bien
    public boolean supprimerDocs(int id_bien, String image_path, String mandat_path, String contrat_path, Timestamp updated_at){
        PreparedStatement st;
        String deleteQuery = "UPDATE `biens` SET `image`=?, `mandat`=?, `contrat`=?, `updated_at`=? WHERE `id_bien`=?";
        
        try {
            st = bdd_connexion.createConnection().prepareStatement(deleteQuery);
            
            st.setBinaryStream(1, null);
            st.setBinaryStream(2, null);
            st.setBinaryStream(3, null);
            st.setTimestamp(4, new java.sql.Timestamp(new java.util.Date().getTime()));
            st.setInt(5, id_bien);
            
            return(st.executeUpdate() > 0);
            
        }  catch (SQLException ex) {
            Logger.getLogger(BIENS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
