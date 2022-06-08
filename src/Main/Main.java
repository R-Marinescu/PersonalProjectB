package Main;

import Dao.QueryStatements;
import Dao.insertDao;
import java.sql.SQLException;



public class Main {

    public static void main(String[] args) throws SQLException {

        QueryStatements print = new QueryStatements();
        //Type print. to select ready query's from the school schema like so, print.selectAssignmentsCourse() etc.
        // Example below

//        //Select students that belong to more than one courses
//       print.selectStudentsMoreCourses();

        insertDao insert = new insertDao();
        //Type insert.  to run the method to update desired table from school schema
        //Example below

        //Insert assignment/course
       // insert.insertAssignmentCourse();
        insert.insertAssignmentStudent();




    }
}