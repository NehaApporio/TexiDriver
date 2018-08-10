package com.example.mmcomp.texidriver;

public class Model {
    String name;
    String pickupPlace;
    String goingon;
    String msg;

    public Model(String name, String pickupPlace, String goingon, String msg) {
        this.name = name;
        this.pickupPlace = pickupPlace;
        this.goingon = goingon;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPickupPlace() {
        return pickupPlace;
    }

    public void setPickupPlace(String pickupPlace) {
        this.pickupPlace = pickupPlace;
    }

    public String getGoingon() {
        return goingon;
    }

    public void setGoingon(String goingon) {
        this.goingon = goingon;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
