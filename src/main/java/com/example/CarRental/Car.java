package com.example.CarRental;

public class Car {

    private String plateNumber;
    private String brand;
    private int price;
    private Object rented;

    public Car() {
        super();
    }

    public Car(String plateNumber, String brand, int price, boolean rented) {
        super();
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.rented=rented;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void getRented(boolean b) {
        this.rented = rented;
    }

    public boolean isRented() {
        this.rented = rented;
        return false;
    }

    public boolean setRented(boolean rented) {
        if (rented == true) return true;
        else { return false;
        }
    }

    @Override
    public String toString() {
        return "Car [plateNumber=" + plateNumber + ", brand=" + brand + ", price=" + price + "]";
    }
}
