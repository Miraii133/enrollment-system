/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer3;

/**
 *
 * @author jiyo
 */
public class Enroll {
    
    public void InsertSQLToEnroll(String selected_studid, String selected_subjid,){
        Functions functions = new Functions();
        DB db = new DB();
        db.connectDB();
        String insertSQL = 
                "INSERT INTO Enroll(studid, subjid) VALUES (" + selected_studid + "," + SubjectsJFrame.selected_subjid +")";
                db.executeUpdate(insertSQL);
              
 
            }
    
    
    
}
