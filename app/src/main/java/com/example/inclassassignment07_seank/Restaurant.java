package com.example.inclassassignment07_seank;

import java.io.Serializable;

public class Restaurant implements Serializable {
    String resName;
    int resZip;
    String resInfo;
    boolean hasParkingLot;
    String cashOnly;

    public Restaurant(String resName, int resZip, String resInfo, boolean hasParkingLot, String cashOnly) {
        this.resName = resName;
        this.resZip = resZip;
        this.resInfo = resInfo;
        this.hasParkingLot = hasParkingLot;
        this.cashOnly = cashOnly;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public int getResZip() {
        return resZip;
    }

    public void setResZip(int resZip) {
        this.resZip = resZip;
    }

    public String getResInfo() {
        return resInfo;
    }

    public void setResInfo(String resInfo) {
        this.resInfo = resInfo;
    }

    public boolean isHasParkingLot() {
        return hasParkingLot;
    }

    public void setHasParkingLot(boolean hasParkingLot) {
        this.hasParkingLot = hasParkingLot;
    }

    public String getCashOnly() {
        return cashOnly;
    }

    public void setCashOnly(String cashOnly) {
        this.cashOnly = cashOnly;
    }
    @Override
    public String toString() {
        return "Restaurant's Name: "+resName+
                "\nZip: "+ resZip+
                "\nCash only? "+ cashOnly+
                "\nHas parking space? "+hasParkingLot+
                "\nOther Information: " + resInfo;
    }
}
