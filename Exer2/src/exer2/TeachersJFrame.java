/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exer2;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jiyo
 */
public class TeachersJFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentsJFrame
     */
    public TeachersJFrame() {
        initComponents();
        SQL sql = new SQL();
        sql.GetResultSetSQL(this.getName(), teachers_table);
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
        dept_textField = new javax.swing.JTextField();
        addr_textField = new javax.swing.JTextField();
        contact_textField = new javax.swing.JTextField();
        status_textField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        teachers_table = new javax.swing.JTable();
        save_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        students_item = new javax.swing.JMenuItem();
        subjects_item = new javax.swing.JMenuItem();
        teachers_item = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Students Menu");
        setName("studentsJFrame"); // NOI18N
        setResizable(false);

        jLabel1.setText("Teacher ID");

        jLabel2.setText("Teacher Name");

        jLabel3.setText("Teacher Dept");

        jLabel4.setText("Teacher Addr");

        jLabel5.setText("Teacher Contact");

        jLabel6.setText("Teacher Status");

        teachers_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "studid", "studname", "studaddr", "studcrs", "studgender", "yrlvl"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(teachers_table);
        if (teachers_table.getColumnModel().getColumnCount() > 0) {
            teachers_table.getColumnModel().getColumn(0).setResizable(false);
            teachers_table.getColumnModel().getColumn(1).setResizable(false);
            teachers_table.getColumnModel().getColumn(2).setResizable(false);
            teachers_table.getColumnModel().getColumn(3).setResizable(false);
            teachers_table.getColumnModel().getColumn(4).setResizable(false);
            teachers_table.getColumnModel().getColumn(5).setResizable(false);
        }

        save_button.setText("Save");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

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
                        .addComponent(save_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update_button)
                        .addGap(12, 12, 12)
                        .addComponent(delete_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dept_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addr_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addComponent(contact_textField)
                                .addComponent(status_textField)))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
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
                            .addComponent(dept_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(addr_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(contact_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(status_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save_button)
                            .addComponent(update_button)
                            .addComponent(delete_button)))
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
             TeachersJFrame studentsFrame = new TeachersJFrame();
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
            {
            id_textField.getText(), name_textField.getText(),
            dept_textField.getText(), addr_textField.getText(), 
            contact_textField.getText(), status_textField.getText()};
       
            Functions functions = new Functions();
            SQL sqlObj = new SQL();
            DB db = new DB();
            db.connectDB();
        // checks if ID is a valid id    
        // checks if ID provided already exists
        // so code can insert it to DB.
        if (functions.IsANumber(functions.getTextFieldValues(textFieldValues), this.getName())){
            if (!functions.IsExistingID(functions.getTextFieldValues(textFieldValues), this.getName())){
                // includes frame name to verify which frame
                // is sending the setInsertSQL
                 sqlObj.setInsertSQL(textFieldValues, this.getName());
                 String sql = sqlObj.getInsertSQL(this.getName());
                 db.executeUpdate(sql);
                 sqlObj.GetResultSetSQL(this.getName(), teachers_table);
                System.out.println("Student ID data inserted.");
                
                // converts return value from GetResultSetSQL to
                // a local variable
                
                // passes it to DisplayTableValues
                //List<String> resultData = sqlObj.GetResultSetSQL(students_table);
                //functions.DisplayTableValues(students_table, resultData);
                return;
            }
            System.out.println("Student ID provided already exists!");
            System.out.println("Please use Update instead.");
            }
            
        
    }//GEN-LAST:event_save_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        String textFieldValues[] =  
             // retrieve current frame name for Functions
             // if condition. 
            {
            id_textField.getText(), name_textField.getText(),
            dept_textField.getText(), addr_textField.getText(), 
            contact_textField.getText(), status_textField.getText()};
        DB db = new DB();
        db.connectDB();

        //Deletes row and replaces it with a new and updated one.
        // String update = "DELETE FROM Students WHERE studid='" + id + "'";
        SQL sqlObj = new SQL();
        sqlObj.setUpdateSQL(textFieldValues, this.getName());
        String sql = sqlObj.getUpdateSQL(this.getName());
        db.executeUpdate(sql);
        sqlObj.GetResultSetSQL(this.getName(), teachers_table);
        System.out.println("Student ID data updated.");
    }//GEN-LAST:event_update_buttonActionPerformed

    
    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
         String textFieldValues[] =  
            {
            id_textField.getText(), name_textField.getText(),
            dept_textField.getText(), addr_textField.getText(), 
            contact_textField.getText(), status_textField.getText()};
        
        DB db = new DB();
        db.connectDB();
        Functions functions = new Functions();
        if (!functions.IsExistingID(textFieldValues, this.getName())){
            System.out.println("Student ID provided does not exist!");
            System.out.println("Cannot delete data from Student ID.");
            return;
        }
        SQL sqlObj = new SQL();
        sqlObj.setDeleteSQL(textFieldValues, this.getName());
        String sql = sqlObj.getDeleteSQL(this.getName());
        db.executeUpdate(sql);
        sqlObj.GetResultSetSQL(this.getName(), teachers_table);
        System.out.println("Student ID data deleted.");
    }//GEN-LAST:event_delete_buttonActionPerformed
    public JTable GetJTable(){
        
        return teachers_table;
    }
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
            java.util.logging.Logger.getLogger(TeachersJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeachersJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeachersJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeachersJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeachersJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addr_textField;
    private javax.swing.JTextField contact_textField;
    private javax.swing.JButton delete_button;
    private javax.swing.JTextField dept_textField;
    private javax.swing.JTextField id_textField;
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
    private javax.swing.JTextField status_textField;
    private javax.swing.JMenuItem students_item;
    private javax.swing.JMenuItem subjects_item;
    private javax.swing.JMenuItem teachers_item;
    private javax.swing.JTable teachers_table;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}
