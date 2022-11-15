
package pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager 
{
    Connection c;
    public DatabaseManager() throws SQLException
    {
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_system", "root", "");
    }
}
