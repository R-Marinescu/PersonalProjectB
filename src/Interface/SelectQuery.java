package Interface;

import java.sql.SQLException;

public interface SelectQuery {


    void selectStudents() throws SQLException;

    void selectCourses() throws SQLException;

    void selectTrainers() throws SQLException;

    void selectAssignments() throws SQLException;

    void selectStudentsCourse() throws SQLException;

    void selectTrainersCourse() throws SQLException;

    void selectAssignmentsCourse() throws SQLException;

    void selectAssignmentsStudentCourse() throws SQLException;

    void selectStudentsMoreCourses() throws SQLException;



}
