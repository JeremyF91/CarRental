package com.example.CarRental;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
public class RentController {

    private List<Rent> rents = new ArrayList<Rent>();

    /* TEST */
    public RentController() {

        Date dateBegin = new Date(2019, 04,21);
        Date dateEnd = new Date(2019, 05,21);

        rents.add (new Rent("11AA22", dateEnd, dateBegin));


    }

    /*
        @RequestMapping(value = "/rents/plateNumber", method = RequestMethod.PUT)
        @ResponseStatus(HttpStatus.OK)
        public void getBack(@PathVariable("plateNumber") String plateNumber) throws Exception{

        }
    */
    @RequestMapping(value = "/rents/{plateNumber}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Rent rent(@PathVariable("plateNumber") String plateNumber) throws Exception{
        return rents.get(0);
    }
// RENTSERVICE = RENTCONTROLLER
    /*
    @RequestMapping(value = "/cars/plateNumber", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void addCar(@RequestBody Car car) throws Exception{
        System.out.println(car);
        cars.add(car);
    }

     */




}
