package com.example.CarRental;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
public class CarRentalService {

    private List<Car> cars = new ArrayList<Car>();


    public CarRentalService() {
        cars.add(new Car("11AA22", "Ferrari", 1000));
        cars.add(new Car("33BB44", "Porshe", 2222));

    }

    @RequestMapping(value="/cars/plateNumber", method=RequestMethod.GET)
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




}