/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exer5;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import java.sql.SQLException;

/**
 *
 * @author jiyo
 */
public class LoginGUIJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginGUIJFrame
     */
    

    public LoginGUIJFrame() {
        initComponents();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        dbSelector_comboBox = new javax.swing.JComboBox<>();
        submit_button = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userId_textField = new javax.swing.JTextField();
        password_passwordField = new javax.swing.JPasswordField();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        login_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("loginJFrame"); // NOI18N
        setResizable(false);

        jLabel3.setText("School Year");

        dbSelector_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School Year" }));

        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        jLabel2.setText("Password:");

        jLabel1.setText("User ID:");

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(userId_textField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(password_passwordField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(48, 48, 48)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userId_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(password_passwordField))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userId_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(password_passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(login_button, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_button)
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_button)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submit_button)
                            .addComponent(dbSelector_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dbSelector_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(submit_button)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ;
  
    private DB db = new DB();
    private SQL sql = new SQL(db);
   
    private FilterSQL filterSQL;
    
    private StudentsJFrame studentsJFrame;
    private SubjectsJFrame subjectsJFrame;
    private TeachersJFrame teachersJFrame;
    private Functions functions;
    
    private Enroll enroll;
    private Assign assign;
    
   
    
    // initializes all classes, instead of placing it into
    // constructor where it will call all frames
    // prior to logging in bug.
    private void initialize_classes(){
        studentsJFrame = new StudentsJFrame(sql, db);
        subjectsJFrame = new SubjectsJFrame(sql, db);
        teachersJFrame = new TeachersJFrame(sql, db);
        functions = new Functions(db,
        studentsJFrame,  subjectsJFrame, teachersJFrame);
        
        enroll = new Enroll();
        assign = new Assign();
        
        filterSQL = new FilterSQL(db, sql);
        // passes reference of jframes to sql
        sql.setStudentsJFrame(studentsJFrame);
        sql.setSubjectsJFrame(subjectsJFrame);
        sql.setTeachersJFrame(teachersJFrame);
        
       studentsJFrame.setFilterSQL(filterSQL);
       studentsJFrame.setSubjectsJFrame(subjectsJFrame);
       studentsJFrame.setTeachersJFrame(teachersJFrame);
       studentsJFrame.setFunctions(functions);
       studentsJFrame.setEnroll(enroll);
       
       subjectsJFrame.setFilterSQL(filterSQL);
       subjectsJFrame.setStudentsJFrame(studentsJFrame);
       subjectsJFrame.setTeachersJFrame(teachersJFrame);
       subjectsJFrame.setFunctions(functions);
       
       teachersJFrame.setFilterSQL(filterSQL);
       teachersJFrame.setStudentsJFrame(studentsJFrame);
       teachersJFrame.setSubjectsJFrame(subjectsJFrame);
       teachersJFrame.setFunctions(functions);
       teachersJFrame.setAssign(assign);
       
       enroll.setDB(db);
       enroll.setSQL(sql);
       
       assign.setDB(db);
       assign.setSQL(sql);
       
    
       
    }
    // changes value of comboboxes to dbNames from dbSelector event
    private void changeSelector_comboBoxValue(List<String> dbNames){
       DefaultComboBoxModel model = (DefaultComboBoxModel) dbSelector_comboBox.getModel();
        // removing old data
        model.removeAllElements();
         for (String item : dbNames) {
            model.addElement(item);
        }
        dbSelector_comboBox.setModel(model);
        
    }
    
    // removes unecessary DBs like
    // information_schema, performance_schema
    // since DBs are shown to user but cannot access it anyways
    private String rootUserName;
    private boolean isSelectedToHideDB(String dbName){
        // add to this list to hide DBs
        
        rootUserName = "root";
        List<String> hiddenDBsRootUser = Arrays.asList(
                "information_schema", "performance_schema",
                "mysql", "sys"
        ); 
        
        // hidden DBs for normal users
        List<String> hiddenDBsNormalUser = Arrays.asList(
                "information_schema", "performance_schema",
                "mysql", "sys","dummyDB"
        ); 
        
        List<String> hiddenDBsTeacherUser = Arrays.asList(
                "information_schema", "performance_schema",
                "mysql", "sys","dummyDB, enrollmentsystem"
        ); 
        
        // hides dbs if a normal user is logging in
        if (hiddenDBsNormalUser.contains(dbName) &&
             !userName.equalsIgnoreCase(rootUserName))
        {
            return true;
        }
        
        else if (hiddenDBsTeacherUser.contains(dbName) &&
             !userName.equalsIgnoreCase(rootUserName))
        {
            return true;
        }
        
        else if (hiddenDBsRootUser.contains(dbName) &&
             userName.equalsIgnoreCase(rootUserName))
        {
            return true;
        }
        
        
            
        return false;
    }
        
        private String userName;
    private void getLoginInfo(){                                         
        userName = userId_textField.getText();
        db.setUser(userName);   
        // should replace .getText() with
        // .getPassword() but problems in db.setConn arises
        // will fix on refactoring
        String password = password_passwordField.getText();
        db.setPassword(password);
    }
    
    // getter setter to store dbNames that
    // a user has access to so it can be used
    // for db checking
    private List<String> dbNames = new ArrayList<>();
    private void setDBNames(List<String> dbNames){
        this.dbNames = dbNames;
    }
    
    public List<String> getDBNames(){
        for (int i = 0; i < dbNames.size(); i++){
            System.out.println(dbNames.get(i));
        }
        return dbNames;
    }
    
    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        getLoginInfo();
        List<String> dbNames = new ArrayList<>();
        db.connectDB();
        try {
            db.setStatement(db.getConn().createStatement());
            ResultSet rs = db.getStatement().executeQuery("SHOW DATABASES");
            int counter = 0;

            // checks if current DB is needed for user
            // to see and stores it to a list if its not 
            // supposed to be hidden
            while(rs.next()) {
               if(!isSelectedToHideDB(rs.getString(1))){
                 dbNames.add(rs.getString(1));
               }

            counter++;
            }
            changeSelector_comboBoxValue(dbNames);
            // stores all accessible DBs to 
            // dbNames setter
            setDBNames(dbNames);
           
         
            
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_login_buttonActionPerformed

    
    private void showJFrame(String selectedDB){
        
      
        // should dynamically check for dbs
        // but not much time left just refactor in future
        
        // root user check
        if (selectedDB.equalsIgnoreCase("1st_sy2022_2023")){
            studentsJFrame.setVisible(true);
            this.dispose();
            return;
        }
        else if (selectedDB.equalsIgnoreCase("2nd_sy2022_2023")){
            studentsJFrame.setVisible(true);
            this.dispose();
            return;
        }
        else if (selectedDB.equalsIgnoreCase("summer_sy2022_2023")){
            studentsJFrame.setVisible(true);
            this.dispose();
            return;
        }
        
         else if (selectedDB.equalsIgnoreCase("dummyDB")){
            studentsJFrame.setVisible(true);
            this.dispose();
            return;
        }
        
            
        
        if (selectedDB.equalsIgnoreCase("enrollmentsystem")){
            var studentUserForm = new StudentsUserFormJFrame();
            studentUserForm.setVisible(true);
            this.dispose();
        }
        else if (selectedDB.equalsIgnoreCase("1st_sy2022_2023")&&
                !userName.equalsIgnoreCase(rootUserName)
                ){
            var teachersUserForm = new TeachersUserFormJFrame();
            teachersUserForm.setVisible(true);
            this.dispose();
            
        }
        else if (selectedDB.equalsIgnoreCase("2nd_sy2022_2023")&&
                !userName.equalsIgnoreCase(rootUserName)
                ){
            var teachersUserForm = new TeachersUserFormJFrame();
            teachersUserForm.setVisible(true);
            this.dispose();
            
        }
        else if (selectedDB.equalsIgnoreCase("summer_sy2022_2023")&&
                !userName.equalsIgnoreCase(rootUserName)
                ){
            var teachersUserForm = new TeachersUserFormJFrame();
            teachersUserForm.setVisible(true);
            this.dispose();
            
        }
        
    }
    
    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
      getLoginInfo();
      db.setDBObject(db);
      String selectedDB = dbSelector_comboBox.getSelectedItem().toString();
      
      // sets the specific database where
      // the instance of DB will connect to
      // depending on the selected comboBox
      db.setDBToConnect(selectedDB);
      // sets the proper URL for the DB to connect to
      //after DB is changed.
      db.setURL();
      try {
          // replace previous connection with
          // dummyDB as db to new connection
          // with dynamic DB selected from comboBOx
          db.connectDB();
          db.setStatement(db.getConn().createStatement());
      } catch (SQLException ex){
          
      }
  
      
  
      initialize_classes();
      showJFrame(selectedDB);
      
     
    }//GEN-LAST:event_submit_buttonActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUIJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dbSelector_comboBox;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField password_passwordField;
    private javax.swing.JButton submit_button;
    private javax.swing.JTextField userId_textField;
    // End of variables declaration//GEN-END:variables
}
