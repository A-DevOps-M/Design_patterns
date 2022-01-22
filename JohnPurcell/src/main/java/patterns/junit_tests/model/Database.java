package patterns.junit_tests.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static Database dbInstance;
    private Connection conn;

    private Database(){
    }

    public static synchronized Database getInstance(){
        if(dbInstance == null){
            return dbInstance = new Database();
        }
        return dbInstance;
    }

    public Connection getConnection(){
        return conn;
    }

    public void connect() throws Exception {
        if(conn != null){
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connected to DB!");
        } catch (ClassNotFoundException e) {
            throw new Exception("Driver not found");
        }

        String url = String.format("jdbc:mysql://localhost:%d/patterns", 3306);

        conn = DriverManager.getConnection(url, "root", "123Asd!@");
    }

    public void disconnect(){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        conn = null;
    }
}
