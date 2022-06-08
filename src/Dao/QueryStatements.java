package Dao;
import Dbutils.Dbutils;
import Interface.SelectQuery;

import java.sql.*;
import java.util.Date;

// In this class the Interface SelectQuery has been implemented and its methods filled with executeQuery to be selected and printed
public class QueryStatements implements SelectQuery {


    @Override
    public void selectStudents() throws SQLException {
        //Connection constructor for DataBase connection
        Connection con = Dbutils.getConnection();
        //Select query
        String sql1 = "Select * from Student" + " order by S_Fname DESC ";
        //PreparedStatement to execute the query
        PreparedStatement pst = con.prepareStatement(sql1);
        //And storing the result in to a resultSet
        ResultSet rs = pst.executeQuery();
        //Loop to print all the requested columns
        while (rs.next()) {
            System.out.println(rs.getString("S_Fname"));
        }
        //connection closure
        try {

        } catch(Exception ex) {
       }
        finally {
            con.close();
        }

    }

    @Override
    public void selectCourses() throws SQLException {
        Connection con = Dbutils.getConnection();


        String sql1 = "Select * from Course" + " order by C_name DESC ";

        PreparedStatement pst = con.prepareStatement(sql1);

        ResultSet rs = pst.executeQuery();


        while (rs.next()) {
            System.out.println(rs.getString("C_name"));
        }
        try {

        } catch(Exception ex) {
        }
        finally {
            con.close();
        }
    }

    @Override
    public void selectTrainers() throws SQLException {
        Connection con = Dbutils.getConnection();


        String sql1 = "Select * from Trainer" + " order by T_Fname DESC ";

        PreparedStatement pst = con.prepareStatement(sql1);

        ResultSet rs = pst.executeQuery();


        while (rs.next()) {
            System.out.println(rs.getString("T_Fname"));
        }
        try {

        } catch(Exception ex) {
        }
        finally {
            con.close();
        }

    }

    @Override
    public void selectAssignments() throws SQLException {
        Connection con = Dbutils.getConnection();


        String sql1 = "Select * from assignment" + " order by Ass_Name DESC ";

        PreparedStatement pst = con.prepareStatement(sql1);

        ResultSet rs = pst.executeQuery();


        while (rs.next()) {
            System.out.println(rs.getString("Ass_Name"));
        }
        try {

        } catch(Exception ex) {
        }
        finally {
            con.close();
        }

    }

    @Override
    public void selectStudentsCourse() throws SQLException {
        Connection con = Dbutils.getConnection();


        String sql1 = "SELECT S_Fname, C_Name" + " FROM student" + " join stud_course on FK_StudCourse_Student=Student_Id" +
                " join course on FK_StudCourse_Course=Course_Id";

        PreparedStatement pst = con.prepareStatement(sql1);

        ResultSet rs = pst.executeQuery();


        while (rs.next()) {
            System.out.println(rs.getString("S_Fname") + " attends");
            System.out.println(rs.getString("C_Name") );
        }
        try {

        } catch(Exception ex) {
        }
        finally {
            con.close();
        }

    }

    @Override
    public void selectTrainersCourse() throws SQLException {
        Connection con = Dbutils.getConnection();


        String sql1 = "Select T_Fname, C_Name from trainer join trainer_course on FK_TrainerCourse_Trainer=Trainer_Id" +
                " join course on FK_TrainerCourse_Course=course_id";

        PreparedStatement pst = con.prepareStatement(sql1);

        ResultSet rs = pst.executeQuery();


        while (rs.next()) {
            System.out.println(rs.getString("T_Fname") + " presents");
            System.out.println(rs.getString("C_Name") );
        }
        try {

        } catch(Exception ex) {
        }
        finally {
            con.close();
        }

    }

    @Override
    public void selectAssignmentsCourse() throws SQLException {
        Connection con = Dbutils.getConnection();


        String sql1 = "Select Ass_Name, C_Name from assignment join assi_course on FK_AssiCourse_Assignment=Ass_Id" +
                " join course on FK_AssiCourse_Course=Course_Id";

        PreparedStatement pst = con.prepareStatement(sql1);

        ResultSet rs = pst.executeQuery();


        while (rs.next()) {
            System.out.println(rs.getString("Ass_Name") + " for");
            System.out.println(rs.getString("C_Name") );
        }
        try {

        } catch(Exception ex) {
        }
        finally {
            con.close();
        }

    }

    @Override
    public void selectAssignmentsStudentCourse() throws SQLException {
        Connection con = Dbutils.getConnection();


        String sql1 = "select FK_StudCourse_Course, FK_StudCourse_Student,Ass_Name from stud_course" +
                " join assi_course on FK_StudCourse_Course = FK_AssiCourse_Course" +
                " join assignment on FK_AssiCourse_Assignment=Ass_Id order by FK_StudCourse_Course, FK_StudCourse_Student";

        PreparedStatement pst = con.prepareStatement(sql1);

        ResultSet rs = pst.executeQuery();


        while (rs.next()) {
            System.out.println(rs.getString("FK_StudCourse_Course") + ":" + " Course id");
            System.out.println(rs.getString("FK_StudCourse_Student") + ":" + " Student id");
            System.out.println(rs.getString("Ass_Name") + "\n");
        }
        try {

        } catch(Exception ex) {
        }
        finally {
            con.close();
        }

    }

    @Override
    public void selectStudentsMoreCourses() throws SQLException {
        Connection con = Dbutils.getConnection();


        String sql1 = "Select S_Fname From student, stud_course" +
                " where student.Student_Id=stud_course.FK_StudCourse_Student group by Student_Id" +
                " having count(FK_StudCourse_Course) >1";

        PreparedStatement pst = con.prepareStatement(sql1);

        ResultSet rs = pst.executeQuery();


        while (rs.next()) {
            System.out.println(rs.getString("S_Fname"));

        }
        try {

        } catch(Exception ex) {
        }
        finally {
            con.close();
        }

    }
}
