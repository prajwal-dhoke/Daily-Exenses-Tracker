package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    public static Connection myConnection() {
        Connection conn = null;
        try {

            String url = "jdbc:mysql://localhost:3306/";
            String DB = "db";
            String userName = "root";
            String password = "Prajwal@123";

            conn = DriverManager.getConnection(url + DB, userName, password);
           
            /*Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521/orcl";
            String user = "system";
            String password = "1234";
            conn = DriverManager.getConnection(url, user, password);*/

        } catch (SQLException e) {
        }

        return conn;
    }
}
