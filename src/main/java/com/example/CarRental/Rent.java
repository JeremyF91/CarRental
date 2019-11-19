package com.example.CarRental;

import java.util.Date;

public class Rent {

    private String plateNumber;

    private Date beginRent;

    private Date endRent;

    public Rent(String plateNumber, Date endRent, Date beginRent) {
        this.plateNumber=plateNumber;
        this.beginRent = beginRent;
        this.endRent = endRent;
    }


    @Override
    public String toString() {
        return "{ begin : " + beginRent+  " ,  end :" + endRent +"}";
    }
}
