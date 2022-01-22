package patterns.singleton.model;

import java.sql.Connection;

public class Database {

    private static Database dbInstance;

    private Database(){
    }

    public static synchronized Database getInstance(){
        if(dbInstance == null){
            return dbInstance = new Database();
        }
        return dbInstance;
    }

    public void connect(){
        System.out.println("Connected to db.");
    }

    public void disconnect(){
        System.out.println("Disconnected!");
    }
}
