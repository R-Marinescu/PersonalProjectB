package model;

import java.util.Date;

public class Assignment {
    String assiName;

    public Assignment(String assiName, int assiId, Date subDate) {
        this.assiName = assiName;
        this.assiId = assiId;
        this.subDate = subDate;
    }

    public String getAssiName() {
        return assiName;
    }

    public void setAssiName(String assiName) {
        this.assiName = assiName;
    }

    public int getAssiId() {
        return assiId;
    }

    public void setAssiId(int assiId) {
        this.assiId = assiId;
    }

    public Date getSubDate() {
        return subDate;
    }

    public void setSubDate(Date subDate) {
        this.subDate = subDate;
    }

    public Assignment() {
    }

    int assiId;
    Date subDate;
}
