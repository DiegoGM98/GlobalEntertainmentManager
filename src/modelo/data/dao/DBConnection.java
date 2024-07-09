package modelo.data.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static String jdbcUrl;
    private static String jdbcUser;
    private static String jdbcPassword;

    static {
        try (InputStream input = DBConnection.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            prop.load(input);
            jdbcUrl = prop.getProperty("jdbcUrl");
            jdbcUser = prop.getProperty("jdbcUser");
            jdbcPassword = prop.getProperty("jdbcPassword");
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
    }
}

