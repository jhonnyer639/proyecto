package persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    private static Connection con;

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "kakarotto639";
    private static final String pass = "K@k@rotto639";
    private static final String url = "jdbc:mysql://https://databases-auth.000webhost.com/id21226515_mineria";

    public Connection conector() throws FileNotFoundException {
        FileInputStream serviceAccount
                = new FileInputStream("path/to/serviceAccountKey.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://mineria-dcfb9-default-rtdb.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);
        return con;
    }

    public void desconectar() {

        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
