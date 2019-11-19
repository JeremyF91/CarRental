package com.example.CarRental;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
public class CarController {

    private List<Car> cars = new ArrayList<Car>();

    public CarController() {
        cars.add(new Car("11AA22", "Ferrari", 1000, true));
        cars.add(new Car("33BB44", "Porshe", 2222, false));

    }

    @RequestMapping(value="/cars", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Car> getListOfCars(){
        return cars;
    }

    @RequestMapping(value = "/cars/plateNumber", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void addCar(@RequestBody Car car) throws Exception{
        System.out.println(car);
        cars.add(car);
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Car> getAllCars(){
        List<Car> newCarsListe = new ArrayList<>();
        for(Car car: cars){
            if(car.isRented()){
                newCarsListe.add(car);
            }
        }
        return newCarsListe;
    }
    @RequestMapping(value = "/cars/plateNumber", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Car aCar(@PathVariable("plateNumber") String plateNumber) throws Exception{
        for(Car car: cars){
            if(car.getPlateNumber() == plateNumber){
                return car;
            }
        }
        throw new IOException("Car doesn't exist");
    }
    @RequestMapping(value = "/cars/plateNumber", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void getBack(@PathVariable("plateNumber") String plateNumber) throws Exception{
    }
    @RequestMapping(value = "/cars/plateNumber", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void rent(@PathVariable("plateNumber") String plateNumber) throws Exception{
        for(Car car: cars){
            if(car.getPlateNumber() == plateNumber){
                car.setRented(true);
            }
        }
        throw new IOException("Car doesn't exist");
    }
    @RequestMapping(value = "/cars/plateNumber", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void rentAndGetBack(@PathVariable("plateNumber") String plateNumber,
                               @RequestParam(value="rent", required = true)boolean rent) throws Exception{
    }





}