/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JTable;


public class Assign {
    
    private DB db;
    private SQL sql;
    private Assign assign;
    
    public void setDB(DB db){
        this.db = db;
    }
    public void setSQL(SQL sql){
        this.sql = sql;
    }
    
    
    private String currentDate;
    public String getCurrentDate(){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
    LocalDateTime date = LocalDateTime.now();  
    currentDate = dtf.format(date);
    return this.currentDate;
    }
      public void InsertSQLToAssign(String selected_teacherid, String selected_subjid, String frameName, JTable primaryTable, JTable secondaryTable){
        String insertSQL = 
                "INSERT INTO Assign(dateassigned, Tid, subjid) VALUES (" + "'" +  getCurrentDate() + "'" + ", "+ selected_teacherid + "," + SubjectsJFrame.selected_subjid +")";      
        db.executeUpdate(insertSQL);
        sql.GetResultSetSQL(frameName, primaryTable);
        sql.GetSecondaryResultSetSQL(frameName, secondaryTable, selected_teacherid);
       }
    
     public void DeleteSQLToAssign(String selected_studid, String selected_assignsubjid, String frameName, JTable primaryTable, JTable secondaryTable){
        String deleteSQL = 
                "DELETE FROM Assign WHERE Tid=" + selected_studid + " AND subjid=" + selected_assignsubjid;
        db.executeUpdate(deleteSQL);
        sql.GetResultSetSQL(frameName, primaryTable);
        sql.GetSecondaryResultSetSQL(frameName, secondaryTable, selected_studid);
       }
     
     
}
