package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class CarsController {


    private CarServiceImp carServiceImp;

    @Autowired
    public CarsController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }


    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5", required = false) String count, ModelMap model) {

        int countInt;
        try {
            countInt = Integer.parseInt(count);
        } catch (NumberFormatException e) {
            countInt = 5;
        }

        ArrayList<Car> cars = carServiceImp.getCars(countInt);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
