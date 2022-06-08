package model;

import java.util.Date;

public class Course {
    String cName;
    String cType;
    int courseId;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    Date startDate;

    public Course() {
    }

    public Course(String cName, String cType, int courseId, Date startDate) {
        this.cName = cName;
        this.cType = cType;
        this.courseId = courseId;
        this.startDate = startDate;
    }
}
