package com.example.CarRental;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
public class CarController {

    private List<Car> cars = new ArrayList<Car>();

    public CarController() {
        cars.add(new Car("11AA22", "Ferrari",5, 45000));
        cars.add(new Car("33BB44", "Porshe", 5, 35000));

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

/*
    @RequestMapping(value = "/cars/plateNumber", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Car aCar(@PathVariable("plateNumber") String plateNumber) throws Exception{
        System.out.println(plateNumber);
        for(Car Car : cars) {
            if(Car.getPlateNumber().contentEquals(plateNumber)) { return Car; }
        }
        return null;
    }

    @RequestMapping(value = "/rents/rented", method = RequestMethod.PUT)
    public void rentAndGetBack(@PathVariable("plateNumber") String plateNumber,
                               @RequestParam(value="rented", required = true)boolean rented,
                               @RequestBody(required = false) Date date){

        for(Car car : cars) {
            if(car.getPlateNumber().equals(plateNumber)) {

                if (rented == true) {

                    car.setRented(true);

                    for(Rent rent: rents) {
                        if (rent.getPlateNumber().equals(plateNumber))

                            rent.setBeginRent(rent.getBeginRent());
                            rent.setEndRent(rent.getEndRent());
                            System.out.println("Car Rented :" + car);
                    }

                }
                else if (rented == false) {
                    car.setRented(false);

                    for(Rent rent: rents) {
                        if (rent.getPlateNumber().equals(plateNumber))

                            rent.setBeginRent(null);
                            rent.setEndRent(null);
                            System.out.println("Car unrented :" + car);
                    }

                }
            }
        }
    }



*/

}
