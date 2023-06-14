import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    String url = "jdbc:mysql://localhost:3306/mydb ";
    String uname = "root";
    String password = "#the01scouple";
    Connection con;
    protected Connection setCon() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url,uname,password);
            return con;


    }

}
