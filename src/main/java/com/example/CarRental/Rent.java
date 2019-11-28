package com.example.CarRental;

import java.util.Date;

public class Rent {

    private String plateNumber;
    private Date beginRent;
    private Date endRent;
    private boolean rented;

    public Rent(String plateNumber, Date endRent, Date beginRent, boolean rented) {
        this.plateNumber=plateNumber;
        this.beginRent = beginRent;
        this.endRent = endRent;
        this.rented =rented;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Date getBeginRent() { return beginRent; }
    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }

    public Date getEndRent() {
        return endRent;
    }
    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }

    public Object getRented(boolean b) {return rented;}
    public void setRented(boolean rented) { this.rented = rented; }


    @Override
    public String toString() {
        return "{ begin : " + beginRent+  " ,  end :" + endRent +"}" + "\n PlateNumber ="+ plateNumber + " Rent : "+ rented;
    }


}
