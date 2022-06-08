package Dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutils {

    private static final String USERNAME = "root";
    private static final String PASS = "123456";
    private static final String URL = "jdbc:mysql://localhost:3306/school?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";

    public static Connection getConnection()  {

        Connection con = null;
        try {
            con = DriverManager.getConnection(URL,USERNAME, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return con;

    }


}