package java_uf_application;

import java.sql.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author enzol
 */
public class BDD_Connexion {
    
    // Cette class va permettre la connection avec la base de données MySQL
    
    public Connection createConnection()
    {
        Connection connection = null;
        
        MysqlDataSource mds = new MysqlDataSource();
        
        mds.setServerName("localhost");
        mds.setPort(3306);
        mds.setUser("root");
        mds.setPassword("");
        mds.setDatabaseName("uf_b2_bdd");
        
        try {
            connection = mds.getConnection();
        }  catch (SQLException ex) {
            Logger.getLogger(BDD_Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
        
    }
    
    
}
