/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer2;

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
    
    private void displayTableValues(){
        
    }
    
 }
    class SQL {
        // changes SQL depending on the frame that will use it.
        private String firstFieldValue;
        private String secondFieldValue;
        private String thirdFieldValue;
        private String fourthFieldValue;
        private String fifthFieldValue;
        private String sixthFieldValue;
        private final String InsertSQL = 
            "INSERT INTO Students VALUES(" + firstFieldValue + ", '" + secondFieldValue + "','" + thirdFieldValue + "','" + fourthFieldValue + "','" + 
            " + " + fifthFieldValue + "','" + sixthFieldValue + "')";
    private final String subjectsInsertSQL = "";
    private final String teachersInsertSQL = "";
    
    private final String studentsIdQuery = "";
    private final String subjectsIdQuery = "";
    private final String teachersIdQuery = "";
    
    
    // changes the value of fieldValue accordingly to the frame.
    public void setInsertSQL(String[] textFieldValues){
        firstFieldValue = textFieldValues[0];
        secondFieldValue = textFieldValues[1];
        thirdFieldValue = textFieldValues[2];
        fourthFieldValue = textFieldValues[3];
        fifthFieldValue = textFieldValues[4];
        sixthFieldValue = textFieldValues[5];
    }
    
    public String getInsertSQL(String frameName){
       if (frameName.equalsIgnoreCase(studentsFrame.getName())){
           return studentsInsertSQL;
       }
       return "";
    }
    
    public String getIdQuery(String frameName){
        
        return studentsIdQuery;
    }
    }
    
   
    

