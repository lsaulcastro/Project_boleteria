package Modelo;

/**
 *
 * @author sauld
 */
import java.sql.*;

public class ModeloDatos {

    private Connection conn;
    private String hostname = null;
    private String portnumber = null;
    private String database = null;
    private String username = null;
    private String password = null;
    private String url = null;
    private static ModeloDatos modelo;

    private ModeloDatos() {
        hostname = "localhost";
        portnumber = "3306";
        database = "db_boleteriaevento";
        username = "root";
        password = "";
        url = "jdbc:mysql://" + hostname +/*":"+portnumber+*/ "/" + database + "?user=" + username + "&password=" + password;
    }

    public static ModeloDatos getInstance() {
        if (modelo == null) {
            modelo = new ModeloDatos();
        }
        return modelo;
    }

    private void loadDriver() {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.out.println("error en la carga de driver");
        }
    }

    public void connectar() {
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.out.println("No se conecto " + ex.getMessage());
        }
    }

    public void desconnectar() {
        if (getConn() != null) {
            try {
                getConn().close();
            } catch (SQLException e) {

            }
        }
    }

    public Connection getConn() {
        return conn;
    }

}
