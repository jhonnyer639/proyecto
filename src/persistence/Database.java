package persistence;

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
    private static final String user = "sql10644645";
    private static final String pass = "WlbT5fbkFD";
    private static final String url = "jdbc:mysql://sql10.freemysqlhosting.net/sql10644645";

    public Connection conector() {
        boolean conexion=false;
        con = null;
        try {
            Class.forName(driver);

            con = DriverManager.getConnection(url,user, pass);
            if (con != null) {
                //JOptionPane.showMessageDialog(null, "Conexion establecida");
                conexion= true;
            } else {
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex);
        }
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
