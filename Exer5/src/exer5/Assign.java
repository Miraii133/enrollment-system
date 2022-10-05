/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer5;

import javax.swing.JTable;


public class Assign {
     
      public void InsertSQLToAssign(String selected_teacherid, String selected_subjid, String frameName, JTable primaryTable, JTable secondaryTable){
        SQL sqlObj = new SQL();
        DB db = new DB();
        db.connectDB();
        String insertSQL = 
                "INSERT INTO Assign(Tid, subjid) VALUES (" + selected_teacherid + "," + SubjectsJFrame.selected_subjid +")";
                db.executeUpdate(insertSQL);
        sqlObj.GetResultSetSQL(frameName, primaryTable);
        sqlObj.GetSecondaryResultSetSQL(frameName, secondaryTable, selected_teacherid);
       }
    
     public void DeleteSQLToAssign(String selected_studid, String selected_assignsubjid, String frameName, JTable primaryTable, JTable secondaryTable){
        SQL sqlObj = new SQL();
        DB db = new DB();
        db.connectDB();
        String deleteSQL = 
                "DELETE FROM Assign WHERE Tid=" + selected_studid + " AND subjid=" + selected_assignsubjid;
                db.executeUpdate(deleteSQL);
        sqlObj.GetResultSetSQL(frameName, primaryTable);
        sqlObj.GetSecondaryResultSetSQL(frameName, secondaryTable, selected_studid);
       }
}
