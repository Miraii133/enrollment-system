/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer5;

import javax.swing.JTable;


/**
 *
 * @author jiyo
 */
public class Enroll {
    
    public void InsertSQLToEnroll(String selected_studid, String selected_subjid, String frameName, JTable primaryTable, JTable secondaryTable){
        SQL sqlObj = new SQL();
        DB db = new DB();
        db.connectDB();
        String insertSQL = 
                "INSERT INTO Enroll(studid, subjid) VALUES (" + selected_studid + "," + SubjectsJFrame.selected_subjid +")";
                db.executeUpdate(insertSQL);
        sqlObj.GetResultSetSQL(frameName, primaryTable);
        sqlObj.GetSecondaryResultSetSQL(frameName, secondaryTable, selected_studid);
                 
       }
    
     public void DeleteSQLToEnroll(String selected_studid, String selected_enrollsubjid, String frameName, JTable primaryTable, JTable secondaryTable){
        SQL sqlObj = new SQL();
        DB db = new DB();
        db.connectDB();
        String deleteSQL = 
                "DELETE FROM Enroll WHERE studid=" + selected_studid + " AND subjid=" + selected_enrollsubjid;
                db.executeUpdate(deleteSQL);
        sqlObj.GetResultSetSQL(frameName, primaryTable);
        sqlObj.GetSecondaryResultSetSQL(frameName, secondaryTable, selected_studid);
                 
       }
    
    
    
}
