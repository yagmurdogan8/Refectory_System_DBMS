import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//written by Yağmur Doğan on April '21

public class DbHelper {

    private String username = "root";
    private String password = "1234";
    private String dbUrl = "jdbc:mysql://localhost:3306/rsys";

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl, username, password);

    }
    public void showError(SQLException ex){
        System.out.println("Error: " + ex.getMessage() + " & Error Code: " +
                ex.getErrorCode());
    }

}
