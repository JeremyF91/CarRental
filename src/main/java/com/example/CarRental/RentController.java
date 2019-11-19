package com.example.CarRental;

import java.io.IOException;
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

    /* TEST */
    public RentController()  {
        try {
            SimpleDateFormat date = new SimpleDateFormat("dd/mm/yyyy");

            Date dateBegin = date.parse("16/02/2004");
            Date dateEnd = date.parse ("17/03/2005");

            rents.add (new Rent("11AA22", dateEnd, dateBegin));

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value="/rents", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Rent getRents(){
        System.out.println("TEST" + rents.get(0));
        Rent loc = rents.get(0);
      return loc;

   }


}
