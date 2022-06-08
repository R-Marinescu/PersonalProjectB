package Interface;

import java.sql.SQLException;

public interface UpdateQuery {
    void insertStudent() throws SQLException;

    void insertTrainer() throws SQLException;

    void insertAssignment() throws SQLException;

    void insertCourse() throws SQLException;

    void insertStudentCourse() throws SQLException;

    void insertTrainerCourse() throws SQLException;

    void insertAssignmentCourse() throws SQLException;

    void insertAssignmentStudent() throws SQLException;
}


