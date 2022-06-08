package model;

public class Trainer {
    String tFName;
    String tLName;

    public String gettFName() {
        return tFName;
    }

    public void settFName(String tFName) {
        this.tFName = tFName;
    }

    public String gettLName() {
        return tLName;
    }

    public void settLName(String tLName) {
        this.tLName = tLName;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public Trainer() {
    }

    int trainerId;

    public Trainer(String tFName, String tLName, int trainerId) {
        this.tFName = tFName;
        this.tLName = tLName;
        this.trainerId = trainerId;
    }
}
