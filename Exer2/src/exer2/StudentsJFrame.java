/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exer2;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jiyo
 */
public class StudentsJFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentsJFrame
     */
    public StudentsJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id_textField = new javax.swing.JTextField();
        name_textField = new javax.swing.JTextField();
        address_textField = new javax.swing.JTextField();
        course_textField = new javax.swing.JTextField();
        gender_textField = new javax.swing.JTextField();
        year_textField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        students_table = new javax.swing.JTable();
        save_button = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        students_item = new javax.swing.JMenuItem();
        subjects_item = new javax.swing.JMenuItem();
        teachers_item = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Students Menu");
        setName("studentsJFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        jLabel1.setText("Student ID");

        jLabel2.setText("Student Name");

        jLabel3.setText("Student Address");

        jLabel4.setText("Student Course");

        jLabel5.setText("Student Gender");

        jLabel6.setText("Student Year");

        name_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_textFieldActionPerformed(evt);
            }
        });

        students_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Course", "Gender", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(students_table);
        if (students_table.getColumnModel().getColumnCount() > 0) {
            students_table.getColumnModel().getColumn(0).setResizable(false);
            students_table.getColumnModel().getColumn(1).setResizable(false);
            students_table.getColumnModel().getColumn(2).setResizable(false);
            students_table.getColumnModel().getColumn(3).setResizable(false);
            students_table.getColumnModel().getColumn(4).setResizable(false);
            students_table.getColumnModel().getColumn(5).setResizable(false);
        }

        save_button.setText("Save");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        jButton2.setText("Update");

        jButton3.setText("Delete");

        jMenu1.setText("Menu");

        students_item.setText("Students");
        students_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                students_itemActionPerformed(evt);
            }
        });
        jMenu1.add(students_item);

        subjects_item.setText("Subjects");
        subjects_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjects_itemActionPerformed(evt);
            }
        });
        jMenu1.add(subjects_item);

        teachers_item.setText("Teachers");
        teachers_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachers_itemActionPerformed(evt);
            }
        });
        jMenu1.add(teachers_item);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(course_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(gender_textField)
                            .addComponent(year_textField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(save_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(12, 12, 12)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(address_textField)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(id_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(address_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(course_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(gender_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(year_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save_button)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void students_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_students_itemActionPerformed
             this.setVisible(false);
             StudentsJFrame studentsFrame = new StudentsJFrame();
             studentsFrame.setVisible(true);
    }//GEN-LAST:event_students_itemActionPerformed

    private void subjects_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjects_itemActionPerformed
             this.setVisible(false);
             SubjectsJFrame subjectsFrame = new SubjectsJFrame();
             subjectsFrame.setVisible(true);
    }//GEN-LAST:event_subjects_itemActionPerformed

    private void teachers_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachers_itemActionPerformed
             this.setVisible(false);
             TeachersJFrame teachersFrame = new TeachersJFrame();
             teachersFrame.setVisible(true);
    }//GEN-LAST:event_teachers_itemActionPerformed

    
    
    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        /*DefaultTableModel tableModel = (DefaultTableModel) students_table.getModel();
        tableModel.addRow(new Object[]{"10", "Jiyo", "Davao"});*/
        String textFieldValues[] =  
             // retrieve current frame name for Functions
             // if condition. 
            {
            id_textField.getText(), name_textField.getText(),
            address_textField.getText(), course_textField.getText(), 
            gender_textField.getText(), year_textField.getText()};
       
            Functions functions = new Functions();
            SQL sqlObj = new SQL();
            DB db = new DB();
            db.connectDB();
        // checks if ID is a valid id    
        // checks if ID provided already exists
        // so code can insert it to DB.
        if (functions.IsANumber(functions.getTextFieldValues(textFieldValues))){
            if (!functions.IsExistingID(functions.getTextFieldValues(textFieldValues))){
                // includes frame name to verify which frame
                // is sending the setInsertSQL
                 sqlObj.setInsertSQL(textFieldValues, this.getName());
                 String sql = sqlObj.getInsertSQL(this.getName());
                 db.executeUpdate(sql);
                System.out.println("Student ID data inserted.");
                
                // converts return value from GetResultSetSQL to
                // a local variable
                
                // passes it to DisplayTableValues
                List<String> resultData = sqlObj.GetResultSetSQL();
                functions.DisplayTableValues(students_table, resultData);
                return;
            }
            System.out.println("Student ID provided already exists!");
            System.out.println("Please use Update instead.");
            }
            
        
    }//GEN-LAST:event_save_buttonActionPerformed

    private void name_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_textFieldActionPerformed

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
            java.util.logging.Logger.getLogger(StudentsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_textField;
    private javax.swing.JTextField course_textField;
    private javax.swing.JTextField gender_textField;
    private javax.swing.JTextField id_textField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name_textField;
    private javax.swing.JButton save_button;
    private javax.swing.JMenuItem students_item;
    private javax.swing.JTable students_table;
    private javax.swing.JMenuItem subjects_item;
    private javax.swing.JMenuItem teachers_item;
    private javax.swing.JTextField year_textField;
    // End of variables declaration//GEN-END:variables
}
