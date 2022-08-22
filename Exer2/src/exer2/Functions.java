/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer2;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jiyo
 */
 public class Functions {
    
     StudentsJFrame studentsFrame = new StudentsJFrame();
     SubjectsJFrame subjectsFrame = new SubjectsJFrame();
     TeachersJFrame teachersFrame = new TeachersJFrame();
     // 1st parameter: which frame
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
    
    public boolean IsANumber(String[] textFieldValues){
        
        try {
           Integer.parseInt(textFieldValues[0]);
        }catch(NumberFormatException ex){
          System.out.println("ID is not a valid number!");
          System.out.println(ex);
           return false;
    }
        return true;
    }
    
    public boolean IsExistingID(String[] textFieldValues){
        
        if (!IsANumber(textFieldValues)) return false;
        
            DB db = new DB();
            db.connectDB();
            int id = Integer.parseInt(textFieldValues[0]);
            String query = "SELECT * FROM Students WHERE studid='" + id + "'";
         // if ID is not an existing ID.
         // returns true if the ID is valid.
        return db.executeQuery(query);
        
    }
    
    /*public void DisplayTableValues(JTable tableObj, List<String> resultData){
        DefaultTableModel tableModel = (DefaultTableModel) tableObj.getModel();
            String[] values = new String[6];
            String currentValue = "";
            for (int i = 0; i < resultData.toArray().length; i++) {
                if (i % 5 != 0 ){
                    values[i] = resultData.get(i);
                    
                } else {
                    tableModel.addRow(new Object[]{values});
                }
                
            }
        
    }*/
    
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
    private final String teachersInsertSQL = "";
    
    private final String studentsIdQuery = "";
    private final String subjectsIdQuery = "";
    private final String teachersIdQuery = "";
    
    
    // changes the value of fieldValue accordingly to the frame.
    public void setInsertSQL(String[] textFieldValues, String frameName){
        firstFieldValue = textFieldValues[0];
        secondFieldValue = textFieldValues[1];
        thirdFieldValue = textFieldValues[2];
        fourthFieldValue = textFieldValues[3];
        fifthFieldValue = textFieldValues[4];
        sixthFieldValue = textFieldValues[5];
        
        String dbName;
        Functions functions = new Functions();
        
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
        else if (frameName.equalsIgnoreCase(functions.subjectsFrame.getName())){
            dbName = "Subjects";
        }
        else if (frameName.equalsIgnoreCase(functions.teachersFrame.getName())){
            dbName = "Teachers";
        }
        
    }
    
     public void setUpdateSQL(String[] textFieldValues, String frameName){
        firstFieldValue = textFieldValues[0];
        secondFieldValue = textFieldValues[1];
        thirdFieldValue = textFieldValues[2];
        fourthFieldValue = textFieldValues[3];
        fifthFieldValue = textFieldValues[4];
        sixthFieldValue = textFieldValues[5];
        
        String dbName;
        Functions functions = new Functions();
        
        // assigns the dbName so SQL is dynamic and
        // changes accordingly to which frame
        // is being called for the SQL
      
        System.out.println(functions.studentsFrame.getName());
        if (frameName.equalsIgnoreCase(functions.studentsFrame.getName())){
            dbName = "Students";
                updateSQL = ""
                + "UPDATE Students SET " + "studid='" + firstFieldValue + "', studname='" + secondFieldValue + "', studaddr='" + thirdFieldValue + "',"
                + "studcrs='" + fourthFieldValue + "', studgender='" + fifthFieldValue + "', yrlvl='" + sixthFieldValue + "'"
                + "WHERE studId=" + firstFieldValue ;
            
        }
        else if (frameName.equalsIgnoreCase(functions.subjectsFrame.getName())){
            dbName = "Subjects";
        }
        else if (frameName.equalsIgnoreCase(functions.teachersFrame.getName())){
            dbName = "Teachers";
        }
        
    }
    
    
    
    public String getInsertSQL(String frameName){
       return insertSQL;
    }
    
    public String getUpdateSQL(String frameName){
       return updateSQL;
    }
    
    public String getIdQuery(String frameName){
        
        return studentsIdQuery;
    }
    
    public void GetResultSetSQL(JTable jtableName){
        
        String query = "SELECT * FROM Students";
        DB db = new DB();
        db.connectDB();
        List<String> resultData = new ArrayList<>();
        try {
             db.setStatement(db.getConn().createStatement());
            // update refers to the statement that is going to modify
            // the database.
            ResultSet resultSet = db.getStatement().executeQuery(query);
            while (resultSet.next()){
                String id = resultSet.getString("studid");
                String name = resultSet.getString("studname");
                String address = resultSet.getString("studaddr");
                String course = resultSet.getString("studcrs");
                String gender = resultSet.getString("studgender");
                String yearLevel = resultSet.getString("yrlvl");
                String array[] = {id, name, address, course, gender, yearLevel};
                
                // adds array to table row
                 DefaultTableModel tableModel = (DefaultTableModel) jtableName.getModel();
                 ClearJTable(tableModel);
                 for (int i = 0; i < array.length; i++){
                     System.out.println(array[i]);
                 }
                 tableModel.addRow(array);
                /*for(String data:array){  
                resultData.add(data);
                }*/
                
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
    
   
    

