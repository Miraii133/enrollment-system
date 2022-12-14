/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer7;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.sql.SQLException;

/**
 *
 * @author User1
 */
public class CreatePDF {

    private DB db;
    public CreatePDF(DB db){
        this.db = db;
    }
    
    private int studentUserId;
    public void setStudentUserId(int studentUserId){
        this.studentUserId = studentUserId;
    }
    
    
    // retrieves resultSet from query
    private int totalRowsInResultSet;
    public void getTotalResultSetRows(int studentUserId){
        String searchQuery = "SELECT Enroll.studid, Students.studname, Grades.prelim, Grades.midterm, Grades.prefinal, Grades.final  FROM Enroll, Subjects, Students, Grades WHERE Students.studid=Enroll.studid AND Subjects.subjid=Enroll.subjid AND Enroll.eid=Grades.eid AND Students.studid=" + studentUserId;
        try {
             db.setStatement(db.getConn().createStatement());
            
            ResultSet resultSet = db.getStatement().executeQuery(searchQuery);
        if (resultSet.last()) {
             totalRowsInResultSet = resultSet.getRow();
             
             resultSet.beforeFirst(); 
           }
         } catch (SQLException ex){
             ex.printStackTrace();
         };
    }
    
    private String studname;
    private String studcrs;
    private String yrlvl;
    
    private String schoolyear;
    public void GetStudentInfoFromQuery(){
        schoolyear = db.getDBToConnect();
        String searchQuery = "SELECT studname, studcrs, yrlvl FROM Students WHERE studid=" + studentUserId;
     try {
             db.setStatement(db.getConn().createStatement());
            
            ResultSet resultSet = db.getStatement().executeQuery(searchQuery);
              while (resultSet.next()){
              this.studname = resultSet.getString("studname");
              this.studcrs = resultSet.getString("studcrs");
              this.yrlvl = resultSet.getString("yrlvl");
              }
         } catch (SQLException ex){
             ex.printStackTrace();
         };
    }
    
    
    private String subjid;
    private String subjode;
    private String prelim;
    private String midterm;
    private String prefinal;
    private String finals;
    public void GetResultSet(PdfPTable table, Font bfBold12, int studentUserId){
        String searchQuery = "SELECT Subjects.subjid, Subjects.subjode, Grades.prelim, Grades.midterm, Grades.prefinal, Grades.final  FROM Enroll, Subjects, Students, Grades WHERE Students.studid=Enroll.studid AND Subjects.subjid=Enroll.subjid AND Enroll.eid=Grades.eid AND Students.studid=" + studentUserId;
        try {
            ResultSet resultSet = db.getStatement().executeQuery(searchQuery);
             while (resultSet.next()){
                this.subjid = resultSet.getString("subjid");
                this.subjode = resultSet.getString("subjode");
                this.prelim = resultSet.getString("prelim");
                this.midterm = resultSet.getString("midterm");
                this.prefinal = resultSet.getString("prefinal");
                this.finals = resultSet.getString("final");

   insertCell(table, this.subjid, Element.ALIGN_CENTER, 1, bfBold12,1,255,255,255);  
   insertCell(table, this.subjode, Element.ALIGN_CENTER, 1, bfBold12,1,255,255,255);  
   insertCell(table, this.prelim, Element.ALIGN_CENTER, 1, bfBold12,1,255,255,255);  
   insertCell(table, this.midterm, Element.ALIGN_CENTER, 1, bfBold12,1,255,255,255);  
   insertCell(table, this.prefinal, Element.ALIGN_CENTER, 1, bfBold12,1,255,255,255);  
   insertCell(table, this.finals, Element.ALIGN_CENTER, 1, bfBold12,1,255,255,255);  
   
               
          
                 
             }
              
 
               
    
    } catch (SQLException ex){
        ex.printStackTrace();
    }

    }
    
    
    public void generatePDF(DB Db, int studentUserId){
         Document doc = new Document();
         PdfWriter docWriter = null;
         DecimalFormat df = new DecimalFormat("0.00");
         Font bfBold12 = new Font(FontFamily.TIMES_ROMAN, 12, Font.BOLD, new BaseColor(0, 0, 0));
         Font bf12 = new Font(FontFamily.TIMES_ROMAN, 12);
  try {         
        String path = "/home/jiyo/NetBeansProjects/Exer7/src/exer7/studentGrades.pdf" ;
        docWriter = PdfWriter.getInstance(doc , new FileOutputStream(path));         
        doc.open();  
        float[] columnWidths2 = {2f, 5f};
        float[] columnWidths = {2f, 3f, 2f, 2f, 2f,2f};
        
  PdfPTable table2 = new PdfPTable(columnWidths2);
   table2.setWidthPercentage(50f);
   table2.getDefaultCell().setBorder(0);
   table2.addCell("Ateneo De Davao University\nRegistrars Office");

   
   doc.add(table2);
   
   PdfPTable table = new PdfPTable(columnWidths);
   table.setWidthPercentage(90f); 
   Paragraph paragraph = new Paragraph();
 
   getTotalResultSetRows(studentUserId);
   GetStudentInfoFromQuery();
   insertCell(table, "Student Grade Sheet", Element.ALIGN_CENTER, 6, bfBold12,0,255,255,255);
   insertCell(table, "", Element.ALIGN_CENTER, 6, bfBold12,0,255,255,255);
   
   insertCell(table, "Student ID: " + this.studentUserId, Element.ALIGN_LEFT, 3, bfBold12,0,255,255,255);
   insertCell(table, "School Year " + this.schoolyear, Element.ALIGN_CENTER, 3, bfBold12,0,255,255,255);
   insertCell(table, "Student Name: " + this.studname, Element.ALIGN_LEFT, 3, bfBold12,0,255,255,255);
   insertCell(table, "Student Course: " + this.studcrs, Element.ALIGN_CENTER, 3, bfBold12,0,255,255,255);
   insertCell(table, "Student Year: " + this.yrlvl, Element.ALIGN_LEFT, 6, bfBold12,0,255,255,255);
   insertCell(table, "Number of Subjects Listed: " + totalRowsInResultSet, Element.ALIGN_LEFT, 6, bfBold12,0,255,255,255);
   insertCell(table, "subjid", Element.ALIGN_CENTER, 1, bfBold12,1,255,255,255);  
   insertCell(table, "subjode", Element.ALIGN_CENTER, 1, bfBold12,1,255,255,255);  
   insertCell(table, "prelim", Element.ALIGN_CENTER, 1, bfBold12,1,255,255,255);  
   insertCell(table, "midterm", Element.ALIGN_CENTER, 1, bfBold12,1,255,255,255);  
   insertCell(table, "prefinal", Element.ALIGN_CENTER, 1, bfBold12,1,255,255,255);  
   insertCell(table, "final", Element.ALIGN_CENTER, 1, bfBold12,1,255,255,255); 
   
   // Generates the grades of student
   
   GetResultSet(table, bfBold12, studentUserId);
   paragraph.add(table);

   doc.add(paragraph);
   
    }

  catch (DocumentException dex)
  {
   dex.printStackTrace();
  }
  catch (Exception ex)
  {
   ex.printStackTrace();
  }
  finally
  {
   if (doc != null){
    //close the document
    doc.close();
   }
   if (docWriter != null){
    //close the writer
    docWriter.close();
   }
  }  
   try {
        File myFile = new File("/home/jiyo/NetBeansProjects/Exer7/src/exer7/studentGrades.pdf");
        Desktop.getDesktop().open(myFile);
    }catch(Exception e){

    } 
  
    }
   
   
    
    
  private static void insertCell(PdfPTable table, String text, int align, int colspan, Font font,int border, int r, int g, int b){
  
  //create a new cell with the specified Text and Font
  PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
  //set the cell alignment
  
  
  cell.setHorizontalAlignment(align);
  //set the cell column span in case you want to merge two or more cells
  cell.setColspan(colspan);
  //in case there is no text and you wan to create an empty row
  if(text.trim().equalsIgnoreCase("")){
   cell.setMinimumHeight(10f);
  }
  if(border==0)
    cell.setBorder(Rectangle.NO_BORDER);
  else
    cell.setBorder(Rectangle.BOX);  
  cell.setBackgroundColor(new BaseColor(r,g,b));
  //add the call to the table
  table.addCell(cell);

 }   
    
}