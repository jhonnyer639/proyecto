package persistence;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
      private static Connection con;

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "kakarotto639";
    private static final String pass = "kakarotto639";
    private static final String url = "jdbc:mysql://localhost:3306/prueva";

    public void conector() {
        con = null;
        try {
            Class.forName(driver);

            con = DriverManager.getConnection(url, user, pass);
            if (con != null) {
                JOptionPane.showMessageDialog(null, "Conexion establecida");
            } else {
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex);
        }
        
    }   
    public void desconectar(){
        
          try {
              con.close();
          } catch (SQLException ex) {
              Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
          }   
    }
    
}