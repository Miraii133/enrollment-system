/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer1;

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
    private final String url = "jdbc:mysql://localhost:3306/enrollmentsystem";
    private final String user = "root";
    private final String password  = "AiHosh1no_135";
    private Connection conn = null;
    private Statement stmt = null;
    public String getURL(){
        return url;
    }
    public String getUser(){
        return user;
    }
    public String getPassword(){
        return password;
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
    
    void connectDB(){
try {
    // db parameters
    setConn(DriverManager.getConnection(getURL(), getUser(), getPassword()));
}
 catch(SQLException ex) {
     System.out.println("Unable to connect to the Database.");
   System.out.println(ex.getMessage());
   ex.printStackTrace();
}
    }
    
    void executeUpdate(String update){
        try {
            setStatement(getConn().createStatement());
            // update refers to the statement that is going to modify
            // the database.
            getStatement().executeUpdate(update);
            
        }  catch (SQLException ex){
            System.out.println("Unable to execute update to the database");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
   
    }
        // returns true or false if the query is
         // valid or not
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

