/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer6;

import javax.swing.JTable;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Enroll {
    
    private DB db;
    private SQL sql;
    
    public void setDB(DB db){
        this.db = db;
    }
    public void setSQL(SQL sql){
        this.sql = sql;
    }
    
    private String selected_studid;
    private String selected_subjid;
    // subjid selected from secondary enroll table
    private String selected_enrollsubjid;
    
    public void InsertSQLToEnroll(String selected_studid, String selected_subjid, String frameName, JTable primaryTable, JTable secondaryTable){
        
        String insertSQL = 
                "INSERT INTO Enroll( studid, subjid) VALUES (" + selected_studid + "," + SubjectsJFrame.selected_subjid +")";
        db.executeUpdate(insertSQL);
        sql.GetResultSetSQL(frameName, primaryTable);
        sql.GetSecondaryResultSetSQL(frameName, secondaryTable, selected_studid);
        // retrieves subjid
        GetStudenteid(selected_studid, selected_subjid);
     
       }
    
     public void DeleteSQLToEnroll(String selected_studid, String selected_enrollsubjid, String frameName, JTable primaryTable, JTable secondaryTable){
         // delete Grades first since Grades.eid is a foreign key from Enroll.eid
         DeleteGradesSQL(selected_studid, selected_enrollsubjid, frameName, primaryTable, secondaryTable);
         
         String deleteSQL = 
                "DELETE FROM Enroll WHERE studid=" + selected_studid + " AND subjid=" + selected_enrollsubjid;
        db.executeUpdate(deleteSQL);
        sql.GetResultSetSQL(frameName, primaryTable);
        sql.GetSecondaryResultSetSQL(frameName, secondaryTable, selected_studid);
        GetStudenteid(selected_studid, selected_enrollsubjid);
                 
       }
     
     // create Grades for the user who was assigned a subject so that grades table will appear
     // in teachersForm
     
     private String studenteid;
     public void GetStudenteid(String selected_studid, String selected_enrollsubjid){
         String studenteidSQL =
         "SELECT Enroll.eid FROM Enroll, Students, Subjects WHERE Students.studid=Enroll.studid AND Subjects.subjid=Enroll.subjid AND Students.studid='"+ selected_studid +"' AND Subjects.subjid='" + selected_enrollsubjid +"'";
         try {
             ResultSet resultSet = db.getStatement().executeQuery(studenteidSQL);
             while (resultSet.next()){
                 // retrieves eid so insertGradesSQL and deleteGradesSQL can use it
                   studenteid = resultSet.getString("eid");
             } 
         } catch(SQLException ex){
             System.out.println("Could not get Studenteid");
             ex.printStackTrace();
         }
         
     }
      public void InsertGradesSQL(){
        String insertGradesSQL = 
                "INSERT INTO Grades(eid) VALUES ("  + studenteid+ ")";      
        db.executeUpdate(insertGradesSQL);
      }
    
     public void DeleteGradesSQL(String selected_studid, String selected_enrollsubjid, String frameName, JTable primaryTable, JTable secondaryTable){
         GetStudenteid(selected_studid, selected_enrollsubjid);
         String deleteGradesSQL = 
                "DELETE FROM Grades WHERE eid='" + studenteid + "'";
        
        db.executeUpdate(deleteGradesSQL);

       }
    
    
    
}
