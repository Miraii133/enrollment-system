/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer5;

import javax.swing.JTable;



public class Enroll {
    
    private DB db;
    private SQL sql;
    
    public void setDB(DB db){
        this.db = db;
    }
    public void setSQL(SQL sql){
        this.sql = sql;
    }
    
    public void InsertSQLToEnroll(String selected_studid, String selected_subjid, String frameName, JTable primaryTable, JTable secondaryTable){
        
        String insertSQL = 
                "INSERT INTO Enroll(eid, studid, subjid) VALUES (" + 3 +","+ selected_studid + "," + SubjectsJFrame.selected_subjid +")";
        System.out.println(insertSQL);
        db.executeUpdate(insertSQL);
        sql.GetResultSetSQL(frameName, primaryTable);
        sql.GetSecondaryResultSetSQL(frameName, secondaryTable, selected_studid);
                 
       }
    
     public void DeleteSQLToEnroll(String selected_studid, String selected_enrollsubjid, String frameName, JTable primaryTable, JTable secondaryTable){
        String deleteSQL = 
                "DELETE FROM Enroll WHERE studid=" + selected_studid + " AND subjid=" + selected_enrollsubjid;
        db.executeUpdate(deleteSQL);
        sql.GetResultSetSQL(frameName, primaryTable);
        sql.GetSecondaryResultSetSQL(frameName, secondaryTable, selected_studid);
                 
       }
    
    
    
}
