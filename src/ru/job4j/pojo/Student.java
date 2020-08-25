package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fIO;
    private int group;
    private Date dateOfEnter;

    public String getfIO() {
        return fIO;
    }

    public void setfIO(String fIO) {
        this.fIO = fIO;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Date getDateOfEnter() {
        return dateOfEnter;
    }

    public void setDateOfEnter(Date dateOfEnter) {
        this.dateOfEnter = dateOfEnter;
    }
}
