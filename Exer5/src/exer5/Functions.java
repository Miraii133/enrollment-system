/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer5;

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
    
     private StudentsJFrame studentsJFrame;
     private SubjectsJFrame subjectsJFrame;
     private TeachersJFrame teachersJFrame;
     
     //private TeachersUserFormFrameJFrame teachersFormJFrame
     private SQL sql;
     private DB db;
     public Functions (
             SQL sql,
             DB db,
             StudentsJFrame studentsJFrame, 
             SubjectsJFrame subjectsJFrame, 
             TeachersJFrame teachersJFrame){
         
         this.studentsJFrame = studentsJFrame;
         this.subjectsJFrame = subjectsJFrame;
         this.teachersJFrame = teachersJFrame;
         this.db = db;
         this.sql = sql;
     }
     
     
     /*StudentsJFrame studentsFrame = new StudentsJFrame();
     SubjectsJFrame subjectsFrame = new SubjectsJFrame();*/
     //TeachersJFrame teachersFrame = new TeachersJFrame();
     
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
           if (frameName.equalsIgnoreCase(studentsJFrame.getName())){
              System.out.println("Student ID provided is not a number!");
           }
           else if (frameName.equalsIgnoreCase(subjectsJFrame.getName())){
              System.out.println("Subject ID provided is not a number!");
           }
           else if (frameName.equalsIgnoreCase(teachersJFrame.getName())){
              System.out.println("Teacher ID provided is not a number!");
           }
          System.out.println(ex);
           return false; 
    }
        return true;
    }
    
    public boolean IsExistingID(String[] textFieldValues, String frameName){
        
        if (!IsANumber(textFieldValues, frameName)) return false;
        
            int id = Integer.parseInt(textFieldValues[0]);
            String searchQuery = "";
            String dbName = "";
            
            // create short lived teacherJFrame for teachersJFrame condition only
            var teachersFormJFrame = new TeachersUserFormJFrame(sql, db);
            
            if (frameName.equalsIgnoreCase(studentsJFrame.getName())){
                dbName = "Students";
                searchQuery = "SELECT * FROM " + dbName + " WHERE studid='" + id + "'";
            }
            else if (frameName.equalsIgnoreCase(subjectsJFrame.getName())){
                dbName = "Subjects";
                searchQuery = "SELECT * FROM " + dbName + " WHERE subjid='" + id + "'";   
            }
            else if (frameName.equalsIgnoreCase(teachersJFrame.getName())){
                dbName = "Teachers";
                searchQuery = "SELECT * FROM " + dbName + " WHERE Tid='" + id + "'";   
            }
            
            else if (frameName.equalsIgnoreCase(teachersFormJFrame.getName())){
                dbName = "Grades";
                searchQuery = "SELECT * FROM " + dbName + " WHERE eid='" + id + "'"; 
            }
            
         // if ID is not an existing ID.
         // returns true if the ID is valid.
         
        return db.executeQuery(searchQuery);
         
    }
    
    
 }
    class SQL {
        
       private final DB db;
       private StudentsJFrame studentsJFrame;
       private SubjectsJFrame subjectsJFrame;
       private TeachersJFrame teachersJFrame;
       
       private TeachersUserFormJFrame teachersFormJFrame;
       // stores dbObject for use as the same instance for all DB
       // connections.
       public SQL(DB db){
        this.db = db;
       }
       
       public void setStudentsJFrame(StudentsJFrame studentsJFrame){
           this.studentsJFrame = studentsJFrame;
       }
       public void setSubjectsJFrame(SubjectsJFrame subjectsJFrame){
           this.subjectsJFrame = subjectsJFrame;
       }
       public void setTeachersJFrame(TeachersJFrame teachersJFrame){
           this.teachersJFrame = teachersJFrame;
       }
       
       public void setTeachersFormJFrame(TeachersUserFormJFrame teachersFormJFrame){
           this.teachersFormJFrame = teachersFormJFrame;
       }
   
   
   

       
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
        
        // subjectsFrame and Grades table from TeacherUserFormJFrame
        // only has 5 textfields
        // whereas studentsFrame and teachersFrame have
        // 6.
        if (!frameName.equalsIgnoreCase(subjectsJFrame.getName()) &&
             !frameName.equalsIgnoreCase(teachersFormJFrame.getName())){
              sixthFieldValue = textFieldValues[5];
        }


        
        
        // assigns the dbName so SQL is dynamic and
        // changes accordingly to which frame
        // is being called for the SQL
        if (frameName.equalsIgnoreCase(studentsJFrame.getName())){
            dbName = "Students";
            insertSQL =  
                "INSERT INTO " + dbName + " VALUES(" + firstFieldValue + ", '" + secondFieldValue + 
                "','" + thirdFieldValue + "','" + fourthFieldValue + "','" + 
                fifthFieldValue + "','" + sixthFieldValue + "')";
        }
        // subjects table only has 5 columns
        else if (frameName.equalsIgnoreCase(subjectsJFrame.getName())){
                dbName = "Subjects";
            insertSQL = 
                "INSERT INTO " + dbName + " VALUES(" + firstFieldValue + ", '" + secondFieldValue + 
                "','" + thirdFieldValue + "','" + fourthFieldValue + "','" + 
                fifthFieldValue + "')";
        }
        else if (frameName.equalsIgnoreCase(teachersJFrame.getName())){
            dbName = "Teachers";
            insertSQL = 
                "INSERT INTO " + dbName + " VALUES(" + firstFieldValue + ", '" + secondFieldValue + 
                "','" + thirdFieldValue + "','" + fourthFieldValue + "','" + 
                fifthFieldValue + "','" + sixthFieldValue + "')";
        }
         else if (frameName.equalsIgnoreCase("teachersFormJFrame")){
            dbName = "Grades";
            insertSQL = 
                "UPDATE " + dbName + " SET(" + firstFieldValue + ", '" + secondFieldValue + 
                "','" + thirdFieldValue + "','" + fourthFieldValue + "','" + 
                fifthFieldValue + "')";
        }
        
    }
    
     public void setUpdateSQL(String[] textFieldValues, String frameName){
        firstFieldValue = textFieldValues[0];
        secondFieldValue = textFieldValues[1];
        thirdFieldValue = textFieldValues[2];
        fourthFieldValue = textFieldValues[3];
        fifthFieldValue = textFieldValues[4];
        
        String dbName;
        
       // subjectsFrame and Grades table from TeacherUserFormJFrame
        // only has 5 textfields
        // whereas studentsFrame and teachersFrame have
        // 6.
        if (!frameName.equalsIgnoreCase(subjectsJFrame.getName()) &&
                !frameName.equalsIgnoreCase(teachersFormJFrame.getName())
                ){
            sixthFieldValue = textFieldValues[5];
           
        }
        
        // assigns the dbName so SQL is dynamic and
        // changes accordingly to which frame
        // is being called for the SQL
      
        if (frameName.equalsIgnoreCase(studentsJFrame.getName())){
            dbName = "Students";
                updateSQL = ""
                + "UPDATE " +  dbName + " SET " + "studid='" + firstFieldValue + "', studname='" + secondFieldValue + "', studaddr='" + thirdFieldValue + "',"
                + "studcrs='" + fourthFieldValue + "', studgender='" + fifthFieldValue + "', yrlvl='" + sixthFieldValue + "'"
                + "WHERE studid=" + firstFieldValue ;
        }
        else if (frameName.equalsIgnoreCase(subjectsJFrame.getName())){
            dbName = "Subjects";
                updateSQL = ""
                + "UPDATE " +  dbName + " SET " + "subjid='" + firstFieldValue + "', subjode='" + secondFieldValue + "', subjdesc='" + thirdFieldValue + "',"
                + "subjunits='" + fourthFieldValue + "', subjsched='" + fifthFieldValue + "'"
                + "WHERE subjid=" + firstFieldValue ;
        }
        else if (frameName.equalsIgnoreCase(teachersJFrame.getName())){
            dbName = "Teachers";
                updateSQL = ""
                + "UPDATE " +  dbName + " SET " + "Tid='" + firstFieldValue + "', Tname='" + secondFieldValue + "', Tdept='" + thirdFieldValue + "',"
                + "Taddr='" + fourthFieldValue + "', Tcontact='" + fifthFieldValue + "', Tstatus='" + sixthFieldValue + "'"
                + "WHERE Tid=" + firstFieldValue ;
        }
        else if (frameName.equalsIgnoreCase("teachersFormJFrame")){
            dbName = "Grades";
                updateSQL = ""
                + "UPDATE " +  dbName + " SET " + "prelim='" + secondFieldValue + "', midterm='" + thirdFieldValue + "',"
                + "prefinal='" + fourthFieldValue + "', final='" + fifthFieldValue + "' "
                + "WHERE eid=" + firstFieldValue ;
        }
        
    }
     
      public void setDeleteSQL(String[] textFieldValues, String frameName){
        firstFieldValue = textFieldValues[0];
        secondFieldValue = textFieldValues[1];
        thirdFieldValue = textFieldValues[2];
        fourthFieldValue = textFieldValues[3];
        fifthFieldValue = textFieldValues[4];
        
        String dbName;
       
        // subjectsFrame only has 5 textfields
        // where as studentsFrame and teachersFrame have
        // 6.
        if (!frameName.equalsIgnoreCase(subjectsJFrame.getName())){
            sixthFieldValue = textFieldValues[5];
        }
            
        // assigns the dbName so SQL is dynamic and
        // changes accordingly to which frame
        // is being called for the SQL
      
        if (frameName.equalsIgnoreCase(studentsJFrame.getName())){
            dbName = "Students";
                deleteSQL = "DELETE FROM " + dbName +" WHERE studid=" + firstFieldValue;
           
        }
        else if (frameName.equalsIgnoreCase(subjectsJFrame.getName())){
            dbName = "Subjects";
                deleteSQL = "DELETE FROM " + dbName +" WHERE subjid=" + firstFieldValue;
        }
        else if (frameName.equalsIgnoreCase(teachersJFrame.getName())){
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
        
         else if (frameName.equalsIgnoreCase("teachersFormJFrame")){
            searchQuery = "SELECT Enroll.eid, Enroll.studid, Students.studname, Grades.prelim, Grades.midterm, Grades.prefinal, Grades.final  FROM Enroll, Subjects, Students, Grades WHERE Students.studid=Enroll.studid AND Subjects.subjid=Enroll.subjid AND Enroll.eid=Grades.eid AND Subjects.subjid=" + selectedid;
         } 
        
        try {
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
        
         else if (frameName.equalsIgnoreCase("teachersFormJFrame")){
             while (resultSet.next()){
                String eid = resultSet.getString("eid");
                String id = resultSet.getString("studid");
                String name = resultSet.getString("studname");
                String prelim = resultSet.getString("prelim");
                String midterm = resultSet.getString("midterm");
                String prefinal = resultSet.getString("prefinal");
                String finals = resultSet.getString("final");
                String array[] = {eid, id, name, prelim, midterm, prefinal, finals};
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
   
        String dbName;
        String searchQuery = "";
        String unitsQuery ="";
        // changes searchQuery
        
        if (frameName.equalsIgnoreCase("studentsJFrame")){
            searchQuery = "SELECT studid as id, studname as name, studaddr as addr, studcrs as crs, studgender as gender, yrlvl as yrlvl, (SELECT SUM(subjunits) from Students, Enroll, Subjects WHERE Students.studid=Enroll.studid AND Enroll.subjid=Subjects.subjid AND Enroll.studid=id) as units FROM Students";
        }
        
        else if (frameName.equalsIgnoreCase("subjectsJFrame")){
            searchQuery = "SELECT Subjects.subjid as id, Subjects.subjode, Subjects.subjdesc, Subjects.subjunits, Subjects.subjsched, (SELECT COUNT(Subjects.subjid) from Enroll, Subjects WHERE Subjects.subjid=Enroll.subjid AND Enroll.subjid=id) AS enrolled FROM Subjects";
        }
        else if (frameName.equalsIgnoreCase("teachersJFrame")){
            searchQuery = "SELECT Teachers.Tid as id, Teachers.Tname, Teachers.Tdept, Teachers.Taddr, Teachers.Tcontact, Teachers.Tstatus, (SELECT COUNT(Teachers.Tid) from Assign, Teachers, Subjects WHERE Teachers.Tid=Assign.Tid AND Assign.subjid=Subjects.subjid AND Assign.Tid=id) AS assigned FROM Teachers";
        } 
        
        else if (frameName.equalsIgnoreCase("teachersFormJFrame")){
            searchQuery = "SELECT Subjects.subjid as id, Subjects.subjode, Subjects.subjdesc, Subjects.subjunits, Subjects.subjsched, (SELECT COUNT(Subjects.subjid) from Enroll, Subjects WHERE Subjects.subjid=Enroll.subjid AND Enroll.subjid=id) AS enrolled FROM Subjects";
        }
        
        try {
             
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
            
             String array[] = new String[6];
             while(resultSet.next()){
                 
                String id = resultSet.getString("id");
                String subjode = resultSet.getString("subjode");
                String subjdesc = resultSet.getString("subjdesc");
                String subjunits = resultSet.getString("subjunits");
                String subjsched = resultSet.getString("subjsched");
                String enrolled = resultSet.getString("enrolled");
                
                // adds array to table row
                array[0] = id;
                array[1] = subjode;
                array[2] = subjdesc;
                array[3] = subjunits;
                array[4] = subjsched;
                array[5] = enrolled;
             

             tableModel.addRow(array);
             
            }
        }
        else if (frameName.equalsIgnoreCase("teachersJFrame")){
            
           String array[] = new String[7];
             while(resultSet.next()){
                 
                String id = resultSet.getString("id");
                String name = resultSet.getString("Tname");
                String dept = resultSet.getString("Tdept");
                String addr = resultSet.getString("Taddr");
                String contact = resultSet.getString("Tcontact");
                String status = resultSet.getString("Tstatus");
                String assigned = resultSet.getString("assigned");
                
                // adds array to table row
                array[0] = id;
                array[1] = name;
                array[2] = dept;
                array[3] = addr;
                array[4] = contact;
                array[5] = status;
                array[6] = assigned;
             

             tableModel.addRow(array);
             
            }
        } 
         else if (frameName.equalsIgnoreCase("teachersFormJFrame")){
            
             String array[] = new String[6];
             while(resultSet.next()){
                 
                String id = resultSet.getString("id");
                String subjode = resultSet.getString("subjode");
                String subjdesc = resultSet.getString("subjdesc");
                String subjunits = resultSet.getString("subjunits");
                String subjsched = resultSet.getString("subjsched");
                String enrolled = resultSet.getString("enrolled");
                
                // adds array to table row
                array[0] = id;
                array[1] = subjode;
                array[2] = subjdesc;
                array[3] = subjunits;
                array[4] = subjsched;
                array[5] = enrolled;
             

             tableModel.addRow(array);
             
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
        
        private SQL sql;
        private DB db;
        public FilterSQL(DB db, SQL sql){
            this.db = db;
            this.sql = sql;
        }

       private int totalRowsInResultSet = 0;
       
    
       private void SetTotalResultRows(int totalRows){
           this.totalRowsInResultSet = totalRows;
       }
       public int GetTotalResultRows(){
           return totalRowsInResultSet;
       }
       
       
       private List<Integer> studIdsList = new ArrayList<>();
       private void SetStudentIdsFromResultSet(int studentIds){
           this.studIdsList.add(studentIds);
       }
       
       public List<Integer> GetStudentIdsFromResultSet(){
           return studIdsList;
       }
       
       
       public void ClearStudentIdsFromResultSet(){
           this.studIdsList.clear();
       }
       
       private List<Integer> studNameList = new ArrayList<>();
       private void SetStudentNameFromResultSet(int studentName){
           this.studIdsList.add(studentName);
       }
       
       public List<Integer> GetStudentNameFromResultSet(){
           return studNameList;
       }
       
       
       public void ClearStudentNameFromResultSet(){
           this.studNameList.clear();
       }
       
       
       
       
       // subjects
       private List<Integer> subjectsIdsList=new ArrayList<>();
       private void SetSubjectsIdsFromResultSet(int subjectsIdsList){
           this.subjectsIdsList.add(subjectsIdsList);
       }
       
       public List<Integer> GetSubjectsIdsFromResultSet(){
           return subjectsIdsList;
       }
       
       public void ClearSubjectsIdsFromResultSet(){
           this.subjectsIdsList.clear();
       }
       
       // teachers
        private List<Integer> teachersIdsList=new ArrayList<>();
       private void SetTeachersIdsFromResultSet(int teachersIdsList){
           this.teachersIdsList.add(teachersIdsList);
       }
       
       public List<Integer> GetTeachersIdsFromResultSet(){
           return teachersIdsList;
       }
       
       public void ClearTeachersIdsFromResultSet(){
           this.teachersIdsList.clear();
       }
    
        //SQL sqlObj = new SQL(); 
        public void GetFiltered_ResultSetSQL(String frameName, JTable jtableName, String filterString){
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
            
            ResultSet resultSet = db.getStatement().executeQuery(searchQuery);
            DefaultTableModel tableModel = (DefaultTableModel) jtableName.getModel();
            sql.ClearJTable(tableModel);
            
         if (frameName.equalsIgnoreCase("studentsJFrame")){
             // retrieves the total amount of rows in the query to
             // determine the studentIdArray size
             if (resultSet.last()) {
             totalRowsInResultSet = resultSet.getRow();
             SetTotalResultRows(totalRowsInResultSet);
             resultSet.beforeFirst(); 
           }
             
             
          
             int counter = 0;
             // Removes intitial values
             // from when StudentJFrame SQL query for default
             // display is loaded
             ClearStudentIdsFromResultSet();
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
                 
               
                 // retrieves both studid and studname for multi filter use
                 SetStudentIdsFromResultSet(Integer.parseInt(id));
                 SetStudentNameFromResultSet(name);
                 counter++;
            }
            
           
        }
        
        else if (frameName.equalsIgnoreCase("subjectsJFrame")){
            
             if (resultSet.last()) {
             totalRowsInResultSet = resultSet.getRow();
             SetTotalResultRows(totalRowsInResultSet);
             resultSet.beforeFirst(); 
           }
            
             
             int counter = 0;
             // Removes intitial values
             // from when StudentJFrame SQL query for default
             // display is loaded
             ClearSubjectsIdsFromResultSet();
             
            while (resultSet.next()){
                String id = resultSet.getString("subjid");
                String code = resultSet.getString("subjode");
                String desc = resultSet.getString("subjdesc");
                String units = resultSet.getString("subjunits");
                String sched = resultSet.getString("subjsched");
                String array[] = {id, code, desc, units, sched};
                
               
                 tableModel.addRow(array);
                 SetSubjectsIdsFromResultSet(Integer.parseInt(id));
                 counter++;
            }
        }
        else if (frameName.equalsIgnoreCase("teachersJFrame")){
            
              if (resultSet.last()) {
             totalRowsInResultSet = resultSet.getRow();
             SetTotalResultRows(totalRowsInResultSet);
             resultSet.beforeFirst(); 
           }
              
                int counter = 0;
             // Removes intitial values
             // from when TeachersId SQL query for default
             // display is loaded
             ClearTeachersIdsFromResultSet();
            
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
                 SetTeachersIdsFromResultSet(Integer.parseInt(id));
                 counter++;
                
            }
        } 
            
            
        } catch (SQLException ex ){
            System.out.println("Cant get result set");
            ex.printStackTrace();
        }
       
    }
    
        
   
    }

class DBPermissions {
    
    // Assign for students
    // s(studid)(studname)
    // GRANT SELECT ON "db.*" TO 'name'@'localhost';
    
    private DB db;
    public DBPermissions(DB db){
        this.db = db;
    }
    
    
    
    
    public void CreateStudentUser(String studid, String studname){
        String autoGeneratedId = studid + studname;
        String autoGeneratedPass = "s" + studid + studname; 
        String createStudentSQL = "CREATE USER " + "'" + autoGeneratedId +"'@'localhost' IDENTIFIED by "+ "'" + autoGeneratedPass + "'";
        db.executeUpdate(createStudentSQL);
    }
    
    public void CreateTeacherUser(String Tid, String Tname){
        String autoGeneratedId = Tid + Tname;
        String autoGeneratedPass = "t" + Tid + Tname; 
        String createStudentSQL = "CREATE USER " + "'" + autoGeneratedId +"'@'localhost' IDENTIFIED by "+ "'" + autoGeneratedPass + "'";
        System.out.println(createStudentSQL);
        db.executeUpdate(createStudentSQL);
    }
    
    public void DeleteStudentUser(String studid){
        // contemplating whether to drop user to DB entirely or just remove their perms to the DB
        // since dropping user to DB removes all their records which also
        // removes records from other DBs
        
    }
    
    public void DeleteTeacherUser(){
        // contemplating whether to drop user to DB entirely or just remove their perms to the DB
        // since dropping user to DB removes all their records which also
        // removes records from other DBs
    }
    
    public void GrantStudentPermission(String studid, String studname, String dbSelected){
        String autoGeneratedId = studid + studname;
        String grantStudentPermsSQL = "GRANT SELECT ON "  + dbSelected + ".* TO '" + autoGeneratedId + "'@'localhost'"; 
        db.executeUpdate(grantStudentPermsSQL);
        // grants dummyDB perms in order to connect
        String grantDummyDBPermsSQL = "GRANT SELECT ON dummyDB.* TO '" + autoGeneratedId + "'@'localhost'"; 
        db.executeUpdate(grantDummyDBPermsSQL);
    }
    
    public void RevokeStudentPermission(String studid, String studname, String dbSelected){
        String selectedStudentId = studid + studname;
        String revokeStudentPermsSQL = "REVOKE SELECT ON "  + dbSelected + ".* FROM '" + selectedStudentId + "'@'localhost'"; 
        db.executeUpdate(revokeStudentPermsSQL);
    }
    
    public void GrantTeacherPermission(String Tid, String Tname, String dbSelected){
        String autoGeneratedId = Tid + Tname;
        String grantTeacherPermsSQL = "GRANT SELECT, UPDATE ON "  + dbSelected + ".* TO '" + autoGeneratedId + "'@'localhost'"; 
        db.executeUpdate(grantTeacherPermsSQL);
        // grants dummyDB perms in order to connect
        String grantDummyDBPermsSQL = "GRANT SELECT ON dummyDB.* TO '" + autoGeneratedId + "'@'localhost'"; 
        db.executeUpdate(grantDummyDBPermsSQL);
    }
    
    public void RevokeTeacherPermission(String Tid, String Tname, String dbSelected){
        String selectedTeacherId = Tid + Tname;
        String revokeTeacherPermsSQL = "REVOKE SELECT ON "  + dbSelected + ".* FROM '" + selectedTeacherId + "'@'localhost'"; 
        db.executeUpdate(revokeTeacherPermsSQL);
    }
    
    // Revoke for students
    
    // Assign for Teacher
    // t(Tid)(Tname)
    
    // Revoke for teacher   
}

    
   
    
