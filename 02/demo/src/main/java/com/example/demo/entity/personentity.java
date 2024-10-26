package com.example.demo.entity;

    public class personentity {


    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVehical() {
        return vehical;
    }

    public void setVehical(String vehical) {
        this.vehical = vehical;
    }

    private String name;
    private String work;
    private String location;
    private String vehical;


}
