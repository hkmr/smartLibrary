
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class JavaConnect {
     public static Connection connectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/smartLibrary","root","");
            return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
