
package smart_homestay;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi_mysql {
     Connection Koneksi;

    public static Connection Conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/homestay", "root", "");

            return koneksi;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);

            return null;
        }
    }
}
