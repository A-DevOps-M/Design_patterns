package patterns.beans.model;

import java.sql.Connection;
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

    public void connect() throws Exception {
        if(conn != null){
            return;
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Driver not found");
        }
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
