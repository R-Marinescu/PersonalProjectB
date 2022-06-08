package Dao;


import Dbutils.Dbutils;
import Interface.UpdateQuery;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class insertDao implements UpdateQuery {
    String fName;
    String lName;
    int Id;
    int IdOne;
    int IdTwo;
    int IdThree;
    int IdFour;
    LocalDate DOB;

    public static LocalDate addDate() {
        Scanner scan = new Scanner(System.in);
       // System.out.println("Enter date of birth [dd/mm/yyyy]");
        String str = scan.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(str, dtf);
    }


    @Override
    public void insertStudent() throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert student name:");
        String a = scan.nextLine();
        System.out.println("Insert student last name:");
        String b = scan.nextLine();
        System.out.println("Insert student ID(5 digits):");
        int c = scan.nextInt();
        System.out.println("Enter date of birth [dd/mm/yyyy]");

        this.fName = a;
        this.lName = b;
        this.Id = c;

        Connection con = Dbutils.getConnection();

        String insertStudent = "Insert into student values(?,?,?,?)";
        PreparedStatement pstStu = con.prepareStatement(insertStudent);
        pstStu.setString(1, a);
        pstStu.setString(2, b);
        pstStu.setInt(3, c);
        pstStu.setString(4, String.valueOf(addDate()));

        int result = pstStu.executeUpdate();
        System.out.println(result);

    }

    @Override
    public void insertTrainer() throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert trainer name:");
        String a = scan.nextLine();
        System.out.println("Insert trainer last name:");
        String b = scan.nextLine();
        System.out.println("Insert trainer ID(4 digits):");
        int c = scan.nextInt();

        this.fName = a;
        this.lName = b;
        this.Id = c;

        Connection con = Dbutils.getConnection();

        String insertStudent = "Insert into trainer values(?,?,?)";
        PreparedStatement pstStu = con.prepareStatement(insertStudent);
        pstStu.setString(1, a);
        pstStu.setString(2, b);
        pstStu.setInt(3, c);

        int result = pstStu.executeUpdate();
        System.out.println(result);
    }

    @Override
    public void insertAssignment() throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert assignment title:");
        String a = scan.nextLine();
        System.out.println("Insert assignment ID(3 digits):");
        int c = scan.nextInt();
        System.out.println("Enter submission date [dd/mm/yyyy]");

        this.fName = a;
        this.Id = c;

        Connection con = Dbutils.getConnection();

        String insertStudent = "Insert into assignment values(?,?,?)";
        PreparedStatement pstStu = con.prepareStatement(insertStudent);
        pstStu.setString(1, a);
        pstStu.setInt(2, c);
        pstStu.setString(3, String.valueOf(addDate()));

        int result = pstStu.executeUpdate();
        System.out.println(result);

    }

    @Override
    public void insertCourse() throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert course title:");
        String a = scan.nextLine();
        System.out.println("Insert course type:");
        String b = scan.nextLine();
        System.out.println("Insert course ID(4 digits):");
        int c = scan.nextInt();
        System.out.println("Enter start date [dd/mm/yyyy]");

        this.fName = a;
        this.lName = b;
        this.Id = c;

        Connection con = Dbutils.getConnection();

        String insertStudent = "Insert into course values(?,?,?,?)";
        PreparedStatement pstStu = con.prepareStatement(insertStudent);
        pstStu.setString(1, a);
        pstStu.setString(2, b);
        pstStu.setInt(3, c);
        pstStu.setString(4, String.valueOf(addDate()));

        int result = pstStu.executeUpdate();
        System.out.println(result);

    }

    @Override
    public void insertStudentCourse() throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert existing student id:");
        int a = scan.nextInt();
        System.out.println("Insert existing course id:");
        int b = scan.nextInt();
        System.out.println("Insert tuition fees");
        int c = scan.nextInt();

        String f = null;
        this.IdOne = a;
        this.IdTwo = b;
        this.Id = c;

        Connection con = Dbutils.getConnection();

        String insertStudent = "Insert into stud_course values(?,?,?,?)";
        PreparedStatement pstStu = con.prepareStatement(insertStudent);
        pstStu.setString(1,f);
        pstStu.setInt(2, a);
        pstStu.setInt(3, b);
        pstStu.setInt(4, c);

        int result = pstStu.executeUpdate();
        System.out.println(result);

    }

    @Override
    public void insertTrainerCourse() throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert number for id(2 digits):");
        int a = scan.nextInt();
        System.out.println("Insert existing Trainer id:");
        int b = scan.nextInt();
        System.out.println("Insert existing course id");
        int c = scan.nextInt();


        this.IdOne = a;
        this.IdTwo = b;
        this.Id = c;

        Connection con = Dbutils.getConnection();

        String insertStudent = "Insert into trainer_course values(?,?,?)";
        PreparedStatement pstStu = con.prepareStatement(insertStudent);
        pstStu.setInt(1, a);
        pstStu.setInt(2, b);
        pstStu.setInt(3, c);

        int result = pstStu.executeUpdate();
        System.out.println(result);

    }

    @Override
    public void insertAssignmentCourse() throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert assignment/course id(6 digits):");
        int a = scan.nextInt();
        System.out.println("Insert existing course id:");
        int b = scan.nextInt();
        System.out.println("Insert existing assignment id");
        int c = scan.nextInt();


        this.IdOne = a;
        this.IdTwo = b;
        this.Id = c;

        Connection con = Dbutils.getConnection();

        String insertStudent = "Insert into assi_course values(?,?,?)";
        PreparedStatement pstStu = con.prepareStatement(insertStudent);
        pstStu.setInt(1, a);
        pstStu.setInt(2, b);
        pstStu.setInt(3, c);

        int result = pstStu.executeUpdate();
        System.out.println(result);

    }

    @Override
    public void insertAssignmentStudent() throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert assignment/student id(5 digits):");
        int a = scan.nextInt();
        System.out.println("Insert existing student id:");
        int b = scan.nextInt();
        System.out.println("Insert existing assignment id:");
        int c = scan.nextInt();
        System.out.println("Insert oral mark numeric value (2 digits)");
        int d = scan.nextInt();
        System.out.println("Insert total mark numeric value (2)");
        int e = scan.nextInt();

        this.IdOne = a;
        this.IdTwo = b;
        this.Id = c;
        this.IdThree = d;
        this.IdFour = e;

        Connection con = Dbutils.getConnection();

        String insertStudent = "Insert into assign_stud values(?,?,?,?,?)";
        PreparedStatement pstStu = con.prepareStatement(insertStudent);
        pstStu.setInt(1, a);
        pstStu.setInt(2, b);
        pstStu.setInt(3, c);
        pstStu.setInt(4, d);
        pstStu.setInt(5, e);

        int result = pstStu.executeUpdate();
        System.out.println(result);

    }

}