/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author jiyo
 */
public class DB {
    
    
  
    private String user = "";
    private String password  = "";
    private Connection conn = null;
    private Statement stmt = null;
    
  
    // db Object to be used by all other frames 
    // and methods
    private DB db;
    // initial DB will always be dummyDB
    // in order for connectDB to have an initial DB
    // to connect to.
    private String sqlURL = "jdbc:mysql://localhost:3306/dummyDB?useSSL=false&allowPublicKeyRetrieval=true";
    public void setURL(){
    sqlURL = new StringBuilder()
   .append("jdbc:mysql://localhost:3306/")
   // database to which the sql will
   // connect to. Used dummyDB
    //as dummy DB to connect initially
   .append(getDBToConnect())
   .append("?useSSL=false&allowPublicKeyRetrieval=true")
   .toString();
    
    }
    
    public String getURL(){
        return sqlURL;
    }
    public String getUser(){
        return user;
    }
    public String getPassword(){
        return password;
    }
    
    public void setUser(String userId){
        user = userId;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    public Connection getConn(){
        return conn;
    }
    public void setConn(Connection conn){
        this.conn = conn;
    }
    public Statement getStatement(){
        return stmt;
    }
    public void setStatement(Statement stmt){
        this.stmt = stmt;
    }
    
    
    private String dbName = "";
    // sets the Database to connect
    // used for switching to other databases
    public void setDBToConnect(String dbName){
        this.dbName = dbName;
    }
    
    public String getDBToConnect(){
        return dbName;
    }
    
    // stores instance of DB from LoginGUIFrame
    // to pass to StudentsJFrame and others
    public void setDBObject(DB db){
        this.db = db;
    }
    
    public Object getDBObject(){
        return db;
    }
    
  
    void connectDB(){
        try {
            // connects code to DB, changes the connection to
            // new setConnection when DB connection changes dynamically
            setConn(DriverManager.getConnection(getURL(), getUser(), getPassword()));
    }
        catch(SQLException ex) {
            System.out.println("Unable to connect to the Database.");
          System.out.println(ex.getMessage());
          ex.printStackTrace();
}
    }
    
    // executeUpdate is named the same with the built-in
    // SQL executeUpdate() function, but inherintly
    // does the same job.
    void executeUpdate(String update){
        try {
            setStatement(getConn().createStatement());
            // update refers to the statement that is going to modify
            // the database.
            getStatement().executeUpdate(update);
            
        }  catch (SQLException ex){
            System.out.println("Unable to execute update to the database");
            System.out.println(ex.getMessage());
            
        }
   
    }
    
        // Checks if query is a valid query
        // returns true or false accordingly.
       boolean executeQuery(String query){
        try {
            setStatement(getConn().createStatement());
            // checks if current query has something
            // returns false if next() is empty.
            ResultSet rs = getStatement().executeQuery(query);
             if(!rs.next()){
                 return false;
             }
           
        }  catch (SQLException ex){
            
            
            System.out.println("Unable to execute query to the database");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            return false;
        }
        return true;
   
    }
}

