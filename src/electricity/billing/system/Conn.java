
package electricity.billing.system;
import java.sql.*;
    
/**
 *
 * @author priyush
 */
public class Conn {
    Connection c;
    Statement s;
    Conn(){
       try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","Pass#02");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
