package com.example.CarRental;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
public class RentController {

    private List<Rent> rents = new ArrayList<Rent>();

    public RentController()  {
        try {

            /** TEST **/
            SimpleDateFormat date = new SimpleDateFormat("dd/mm/yyyy");
            Date dateBegin = date.parse("16/02/2004");
            Date dateEnd = date.parse ("17/03/2005");
            rents.add (new Rent("11AA22", dateEnd, dateBegin, true));

            rents.add (new Rent("33BB44", null, null, false));

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value="/rents", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Rent getRents(){
        System.out.println("Rent : " + rents.get(1));
        Rent loc = rents.get(1);
      return loc;
   }

   /***********************************************************************************/
   /*
    @RequestMapping(value = "/rents/plateNumber", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void rent(@PathVariable("plateNumber") String plateNumber) throws Exception{
    }

    @RequestMapping(value = "/rents/plateNumber", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Rent aRent(@PathVariable("plateNumber") String plateNumber) throws Exception{
        System.out.println(plateNumber);
        for(Rent rent : rents) {
            if(rent.getPlateNumber().contentEquals(plateNumber)) { return rent; }
        }
        return null;
    }

    @RequestMapping(value = "/rents/plateNumber", method = RequestMethod.PUT)
    public void rentAndGetBack(@PathVariable("plateNumber") String plateNumber,
                               @RequestParam(value="rented", required = true)boolean rented,
                               @RequestBody(required = false) Date date){

        for(Rent rent : rents) {
            if(rent.getPlateNumber().equals(plateNumber)) {

                if (rented == true) {

                            rent.setRented(true);
                            rent.setBeginRent(rent.getBeginRent());
                            rent.setEndRent(rent.getEndRent());
                            System.out.println("Car Rented :" + rent);
                    }

                }
                else if (rented == false) {

                            rent.setRented(false);
                            rent.setBeginRent(null);
                            rent.setEndRent(null);
                            System.out.println("Car unrented :" + rent);
                    }

                }
            }


    */
        }


