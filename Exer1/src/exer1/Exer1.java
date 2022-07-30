package exer1;
import java.sql.*;
public class Exer1 {

    public static void main(String[] args) {
        DB db = new DB();
        db.connectDB();
        db.executeUpdate("INSERT INTO Students VALUES('5', 'Nya', 'davao', 'IT', 'Male', '3rd')");

    }
}
