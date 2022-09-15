/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jiyo
 */
 public class Functions {
    
     StudentsJFrame studentsFrame = new StudentsJFrame();
     SubjectsJFrame subjectsFrame = new SubjectsJFrame();
     TeachersJFrame teachersFrame = new TeachersJFrame();
     
    private List<String> studentsFilter_components = new ArrayList<>();
    public String[] getTextFieldValues(String[] textFieldValues){
        // retrieves values of all text fields and
        // stores them in an array
        // to make it much easier to pass to other methods.
        String[] values = new String[textFieldValues.length];
        // loops to assign values to values array from textFieldValues array.
        for (int i = 0; i < textFieldValues.length; i++){
            values[i] = textFieldValues[i];
        }
        
       

        return values;
    }
    
    public boolean IsANumber(String[] textFieldValues, String frameName){
        
        try {
           Integer.parseInt(textFieldValues[0]);
           // checks for subj units textfield
           // subjunits only accepts integer in DB.
           
           // encountered problem with deleteValues and subjectsFrame
           // cannot proceed if ID is valid and subj units is blank
           // changed type of subjunits to text in DB as
           // compromise
        } catch(NumberFormatException ex){
           if (frameName.equalsIgnoreCase(studentsFrame.getName())){
              System.out.println("Student ID provided is not a number!");
           }
           else if (frameName.equalsIgnoreCase(subjectsFrame.getName())){
              System.out.println("Subject ID provided is not a number!");
           }
           else if (frameName.equalsIgnoreCase(teachersFrame.getName())){
              System.out.println("Teacher ID provided is not a number!");
           }
          System.out.println(ex);
           return false; 
    }
        return true;
    }
    
    public boolean IsExistingID(String[] textFieldValues, String frameName){
        
        if (!IsANumber(textFieldValues, frameName)) return false;
        
            DB db = new DB();
            db.connectDB();
            int id = Integer.parseInt(textFieldValues[0]);
            String searchQuery = "";
            String dbName = "";
            if (frameName.equalsIgnoreCase(studentsFrame.getName())){
                dbName = "Students";
                searchQuery = "SELECT * FROM " + dbName + " WHERE studid='" + id + "'";   
            }
            else if (frameName.equalsIgnoreCase(subjectsFrame.getName())){
                dbName = "Subjects";
                searchQuery = "SELECT * FROM " + dbName + " WHERE subjid='" + id + "'";   
            }
            else if (frameName.equalsIgnoreCase(teachersFrame.getName())){
                dbName = "Teachers";
                searchQuery = "SELECT * FROM " + dbName + " WHERE Tid='" + id + "'";   
            }
            
         // if ID is not an existing ID.
         // returns true if the ID is valid.
        return db.executeQuery(searchQuery);
         
    }
    
    
 }
    class SQL {
        // changes SQL depending on the frame that will use it.
        private String firstFieldValue = "";
        private String secondFieldValue;
        private String thirdFieldValue;
        private String fourthFieldValue;
        private String fifthFieldValue;
        private String sixthFieldValue;
        
        private String insertSQL; 
        private String updateSQL;
        private String deleteSQL;
    
    
    
    // changes the value of fieldValue accordingly to the frame.
    public void setInsertSQL(String[] textFieldValues, String frameName){
        firstFieldValue = textFieldValues[0];
        secondFieldValue = textFieldValues[1];
        thirdFieldValue = textFieldValues[2];
        fourthFieldValue = textFieldValues[3];
        fifthFieldValue = textFieldValues[4];
        
        String dbName;
        Functions functions = new Functions();
        
        // subjectsFrame only has 5 textfields
        // where as studentsFrame and teachersFrame have
        // 6.
        if (!frameName.equalsIgnoreCase(functions.subjectsFrame.getName())){
            sixthFieldValue = textFieldValues[5];
        }
        
        
        // assigns the dbName so SQL is dynamic and
        // changes accordingly to which frame
        // is being called for the SQL
        if (frameName.equalsIgnoreCase(functions.studentsFrame.getName())){
            dbName = "Students";
            insertSQL =  
                "INSERT INTO " + dbName + " VALUES(" + firstFieldValue + ", '" + secondFieldValue + 
                "','" + thirdFieldValue + "','" + fourthFieldValue + "','" + 
                fifthFieldValue + "','" + sixthFieldValue + "')";
        }
        // subjects table only has 5 columns
        else if (frameName.equalsIgnoreCase(functions.subjectsFrame.getName())){
                dbName = "Subjects";
            insertSQL = 
                "INSERT INTO " + dbName + " VALUES(" + firstFieldValue + ", '" + secondFieldValue + 
                "','" + thirdFieldValue + "','" + fourthFieldValue + "','" + 
                fifthFieldValue + "')";
        }
        else if (frameName.equalsIgnoreCase(functions.teachersFrame.getName())){
            dbName = "Teachers";
            insertSQL = 
                "INSERT INTO " + dbName + " VALUES(" + firstFieldValue + ", '" + secondFieldValue + 
                "','" + thirdFieldValue + "','" + fourthFieldValue + "','" + 
                fifthFieldValue + "','" + sixthFieldValue + "')";
        }
        
    }
    
     public void setUpdateSQL(String[] textFieldValues, String frameName){
        firstFieldValue = textFieldValues[0];
        secondFieldValue = textFieldValues[1];
        thirdFieldValue = textFieldValues[2];
        fourthFieldValue = textFieldValues[3];
        fifthFieldValue = textFieldValues[4];
        
        String dbName;
        Functions functions = new Functions();
        
        // subjectsFrame only has 5 textfields
        // where as studentsFrame and teachersFrame have
        // 6.
        if (!frameName.equalsIgnoreCase(functions.subjectsFrame.getName())){
            sixthFieldValue = textFieldValues[5];
        }
        
        // assigns the dbName so SQL is dynamic and
        // changes accordingly to which frame
        // is being called for the SQL
      
        if (frameName.equalsIgnoreCase(functions.studentsFrame.getName())){
            dbName = "Students";
                updateSQL = ""
                + "UPDATE " +  dbName + " SET " + "studid='" + firstFieldValue + "', studname='" + secondFieldValue + "', studaddr='" + thirdFieldValue + "',"
                + "studcrs='" + fourthFieldValue + "', studgender='" + fifthFieldValue + "', yrlvl='" + sixthFieldValue + "'"
                + "WHERE studid=" + firstFieldValue ;
        }
        else if (frameName.equalsIgnoreCase(functions.subjectsFrame.getName())){
            dbName = "Subjects";
                updateSQL = ""
                + "UPDATE " +  dbName + " SET " + "subjid='" + firstFieldValue + "', subjode='" + secondFieldValue + "', subjdesc='" + thirdFieldValue + "',"
                + "subjunits='" + fourthFieldValue + "', subjsched='" + fifthFieldValue + "'"
                + "WHERE subjid=" + firstFieldValue ;
        }
        else if (frameName.equalsIgnoreCase(functions.teachersFrame.getName())){
            dbName = "Teachers";
                updateSQL = ""
                + "UPDATE " +  dbName + " SET " + "Tid='" + firstFieldValue + "', Tname='" + secondFieldValue + "', Tdept='" + thirdFieldValue + "',"
                + "Taddr='" + fourthFieldValue + "', Tcontact='" + fifthFieldValue + "', Tstatus='" + sixthFieldValue + "'"
                + "WHERE Tid=" + firstFieldValue ;
        }
        
    }
     
      public void setDeleteSQL(String[] textFieldValues, String frameName){
        firstFieldValue = textFieldValues[0];
        secondFieldValue = textFieldValues[1];
        thirdFieldValue = textFieldValues[2];
        fourthFieldValue = textFieldValues[3];
        fifthFieldValue = textFieldValues[4];
        
        String dbName;
        Functions functions = new Functions();
        // subjectsFrame only has 5 textfields
        // where as studentsFrame and teachersFrame have
        // 6.
        if (!frameName.equalsIgnoreCase(functions.subjectsFrame.getName())){
            sixthFieldValue = textFieldValues[5];
        }
        
        // assigns the dbName so SQL is dynamic and
        // changes accordingly to which frame
        // is being called for the SQL
      
        if (frameName.equalsIgnoreCase(functions.studentsFrame.getName())){
            dbName = "Students";
                deleteSQL = "DELETE FROM " + dbName +" WHERE studid=" + firstFieldValue;
            
        }
        else if (frameName.equalsIgnoreCase(functions.subjectsFrame.getName())){
            dbName = "Subjects";
                deleteSQL = "DELETE FROM " + dbName +" WHERE subjid=" + firstFieldValue;
        }
        else if (frameName.equalsIgnoreCase(functions.teachersFrame.getName())){
            dbName = "Teachers";
                deleteSQL = "DELETE FROM " + dbName +" WHERE Tid=" + firstFieldValue;
        }
        
    }
    
    
    
    public String getInsertSQL(String frameName){
       return insertSQL;
    }
    
    public String getUpdateSQL(String frameName){
       return updateSQL;
    }
    
    public String getDeleteSQL(String frameName){
       return deleteSQL;
    }
    
    
    // Gets secondary table result Set
    public void GetSecondaryResultSetSQL(String frameName, JTable jtableName, String selectedid){
         DB db = new DB();
        db.connectDB();
        String dbName;
        String searchQuery = "";
        if (frameName.equalsIgnoreCase("studentsJFrame")){
            searchQuery = "SELECT Enroll.studid, Subjects.subjid, Subjects.subjode, Subjects.subjdesc, Subjects.subjunits, Subjects.subjsched FROM Enroll, Subjects, Students WHERE Enroll.subjid=Subjects.subjid AND Students.studid=Enroll.studid AND Students.studid=" + selectedid;
        }
        
        else if (frameName.equalsIgnoreCase("subjectsJFrame")){
            searchQuery = "SELECT Students.studid, Students.studname, Students.studaddr, Students.studcrs, Students.studgender, Students.yrlvl FROM Students, Subjects, Enroll WHERE Enroll.subjid=Subjects.subjid AND Students.studid=Enroll.studid AND Enroll.subjid=" + selectedid;
        }
        else if (frameName.equalsIgnoreCase("teachersJFrame")){
            searchQuery = "SELECT Subjects.subjid, Subjects.subjode, Subjects.subjdesc, Subjects.subjunits, Subjects.subjsched FROM Teachers, Subjects, Assign WHERE Assign.subjid=Subjects.subjid AND Teachers.Tid=Assign.Tid AND Teachers.Tid=" + selectedid;
        } 
        
        try {
             db.setStatement(db.getConn().createStatement());
            // update refers to the statement that is going to modify
            // the database.
            
            ResultSet resultSet = db.getStatement().executeQuery(searchQuery);
            DefaultTableModel tableModel = (DefaultTableModel) jtableName.getModel();
            ClearJTable(tableModel);
            
        if (frameName.equalsIgnoreCase("studentsJFrame")){
             while (resultSet.next()){
                String id = resultSet.getString("subjid");
                String name = resultSet.getString("subjode");
                String address = resultSet.getString("subjdesc");
                String course = resultSet.getString("subjunits");
                String gender = resultSet.getString("subjsched");
                String array[] = {id, name, address, course, gender};
                // adds array to table row
                 tableModel.addRow(array);
              
             }
    }
        else if (frameName.equalsIgnoreCase("subjectsJFrame")){
             while (resultSet.next()){
                String id = resultSet.getString("studid");
                String name = resultSet.getString("studname");
                String address = resultSet.getString("studaddr");
                String course = resultSet.getString("studcrs");
                String gender = resultSet.getString("studgender");
                String yrlvl = resultSet.getString("yrlvl");
                String array[] = {id, name, address, course, gender, yrlvl};
                // adds array to table row
                 tableModel.addRow(array);
              
             }
    }
        else if (frameName.equalsIgnoreCase("teachersJFrame")){
             while (resultSet.next()){
                String id = resultSet.getString("subjid");
                String name = resultSet.getString("subjode");
                String address = resultSet.getString("subjdesc");
                String course = resultSet.getString("subjunits");
                String gender = resultSet.getString("subjsched");
                String array[] = {id, name, address, course, gender};
                // adds array to table row
                 tableModel.addRow(array);
              
             }
    }
        }  catch (SQLException ex ){
            System.out.println("Cant get result set");
           
            ex.printStackTrace();
        }
    }
    // Primary table in jframe
    public void GetResultSetSQL(String frameName, JTable jtableName){
        
        
        DB db = new DB();
        db.connectDB();
        String dbName;
        String searchQuery = "";
        String unitsQuery ="";
        // changes searchQuery
        if (frameName.equalsIgnoreCase("studentsJFrame")){
            searchQuery = "SELECT studid as id, studname as name, studaddr as addr, studcrs as crs, studgender as gender, yrlvl as yrlvl, (SELECT SUM(subjunits) from Students, Enroll, Subjects WHERE Students.studid=Enroll.studid AND Enroll.subjid=Subjects.subjid AND Enroll.studid=id) as units FROM Students";
       
        }
        
        else if (frameName.equalsIgnoreCase("subjectsJFrame")){
            dbName = "Subjects";
            searchQuery = "SELECT * FROM " + dbName;
        }
        else if (frameName.equalsIgnoreCase("teachersJFrame")){
            dbName = "Teachers";
            searchQuery = "SELECT * FROM " + dbName;
        } 
        try {
             db.setStatement(db.getConn().createStatement());
            // update refers to the statement that is going to modify
            // the database.
            
            ResultSet resultSet = db.getStatement().executeQuery(searchQuery);
            DefaultTableModel tableModel = (DefaultTableModel) jtableName.getModel();
            ClearJTable(tableModel);
            
         if (frameName.equalsIgnoreCase("studentsJFrame")){
              String array[] = new String[7];
             while(resultSet.next()){
                 
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("addr");
                String course = resultSet.getString("crs");
                String gender = resultSet.getString("gender");
                String yearLevel = resultSet.getString("yrlvl");
                String units = resultSet.getString("units");
                
                // adds array to table row
                array[0] = id;
                array[1] = name;
                array[2] = address;
                array[3] = course;
                array[4] = gender;
                array[5] = yearLevel;
                array[6] = units;
             
            
            
            
            
             tableModel.addRow(array);
             
            }
                
                
            }
        
        
        
        else if (frameName.equalsIgnoreCase("subjectsJFrame")){
            
            while (resultSet.next()){
                String id = resultSet.getString("subjid");
                String code = resultSet.getString("subjode");
                String desc = resultSet.getString("subjdesc");
                String units = resultSet.getString("subjunits");
                String sched = resultSet.getString("subjsched");
                String array[] = {id, code, desc, units, sched};
                
                // adds array to table row
                 tableModel.addRow(array);
                /*for(String data:array){  
                resultData.add(data);
                }*/
                
            }
        }
        else if (frameName.equalsIgnoreCase("teachersJFrame")){
            
             while (resultSet.next()){
                String id = resultSet.getString("Tid");
                String name = resultSet.getString("Tname");
                String dept = resultSet.getString("Tdept");
                String addr = resultSet.getString("Taddr");
                String contact = resultSet.getString("Tcontact");
                String status = resultSet.getString("Tstatus");
                String array[] = {id, name, dept, addr, contact, status};
                
                // adds array to table row
                 tableModel.addRow(array);
                /*for(String data:array){  
                resultData.add(data);
                }*/
                
            }
        } 
            
            
        } catch (SQLException ex ){
            System.out.println("Cant get result set");
           
            ex.printStackTrace();
        }
       
    }
    
    public void ClearJTable(DefaultTableModel tableModel){
        tableModel.setRowCount(0);
    }
    
    
    }

    class FilterSQL {
        SQL sqlObj = new SQL();
        public void GetComponentValues(String[] componentValues, String frameName){
           if (frameName.equalsIgnoreCase("studentsJFrame")){
               
           }
        }
        public void GetFiltered_ResultSetSQL(String frameName, JTable jtableName, String filterString){
        
        DB db = new DB();
        db.connectDB();
        String dbName;
        String searchQuery = "";
        
        // changes searchQuery
        if (frameName.equalsIgnoreCase("studentsJFrame")){
            searchQuery = filterString;
        }
        
        else if (frameName.equalsIgnoreCase("subjectsJFrame")){
            searchQuery = filterString;
        }
        else if (frameName.equalsIgnoreCase("teachersJFrame")){
            searchQuery = filterString;
        } 
        try {
             db.setStatement(db.getConn().createStatement());
            // update refers to the statement that is going to modify
            // the database.
            
            ResultSet resultSet = db.getStatement().executeQuery(searchQuery);
            DefaultTableModel tableModel = (DefaultTableModel) jtableName.getModel();
            sqlObj.ClearJTable(tableModel);
            
         if (frameName.equalsIgnoreCase("studentsJFrame")){
             while (resultSet.next()){
                String id = resultSet.getString("studid");
                String name = resultSet.getString("studname");
                String address = resultSet.getString("studaddr");
                String course = resultSet.getString("studcrs");
                String gender = resultSet.getString("studgender");
                String yearLevel = resultSet.getString("yrlvl");
                String array[] = {id, name, address, course, gender, yearLevel};
                // adds array to table row
                 tableModel.addRow(array);
                /*for(String data:array){  
                resultData.add(data);
                }*/
                
            }
        }
        
        else if (frameName.equalsIgnoreCase("subjectsJFrame")){
            
            while (resultSet.next()){
                String id = resultSet.getString("subjid");
                String code = resultSet.getString("subjode");
                String desc = resultSet.getString("subjdesc");
                String units = resultSet.getString("subjunits");
                String sched = resultSet.getString("subjsched");
                String array[] = {id, code, desc, units, sched};
                
               
                 tableModel.addRow(array);
                /*for(String data:array){  
                resultData.add(data);
                }*/
                
            }
        }
        else if (frameName.equalsIgnoreCase("teachersJFrame")){
            
             while (resultSet.next()){
                String id = resultSet.getString("Tid");
                String name = resultSet.getString("Tname");
                String dept = resultSet.getString("Tdept");
                String addr = resultSet.getString("Taddr");
                String contact = resultSet.getString("Tcontact");
                String status = resultSet.getString("Tstatus");
                String array[] = {id, name, dept, addr, contact, status};
                
                // adds array to table row
                 tableModel.addRow(array);
                /*for(String data:array){  
                resultData.add(data);
                }*/
                
            }
        } 
            
            
        } catch (SQLException ex ){
            System.out.println("Cant get result set");
            ex.printStackTrace();
        }
       
    }
    
        
   
    }

    
   
    
