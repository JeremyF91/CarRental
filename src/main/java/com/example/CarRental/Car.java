package com.example.CarRental;

public class Car {


    private String plateNumber;
    private String brand;
    private int nbPlace;
    private int price;

    public Car() {
        super();
    }

    public Car(String plateNumber, String brand, int nbPlace, int price) {
        super();
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.nbPlace = nbPlace;
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

    public int getNbPlace() {
        return nbPlace;
    }
    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car [plateNumber=" + plateNumber + ", brand=" + brand + ", Number of seat="+ nbPlace+ ", price=" + price + "]";
    }

}
