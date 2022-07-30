/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
        System.out.println("called");
try {
    // db parameters
    setConn(DriverManager.getConnection(getURL(), getUser(), getPassword()));
    setStatement(getConn().createStatement());
    String query = "INSERT INTO Students VALUES ('3', 'Meme', 'davao', 'IT', 'Male', '2nd')";
    getStatement().executeUpdate(query);
}
 catch(SQLException e) {
   System.out.println(e.getMessage());
   e.printStackTrace();
}
    }
}
