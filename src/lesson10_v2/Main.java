package lesson10_v2;

import java.sql.SQLException;

import javax.swing.SwingUtilities;

public class Main {
        public static void main(String[] args) throws SQLException {
        SwingUtilities.invokeLater(() -> {
            Panel app = new Panel();
            app.setVisible(true);
        });

    }
}
