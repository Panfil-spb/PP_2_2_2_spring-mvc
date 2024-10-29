package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class CarsController {
    private ArrayList<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(1, 1, "qwe"));
        cars.add(new Car(2, 2, "wer"));
        cars.add(new Car(3, 3, "ert"));
        cars.add(new Car(4, 4, "rty"));
        cars.add(new Car(5, 5, "tyu"));
        cars.add(new Car(6, 6, "yui"));
        cars.add(new Car(7, 7, "uio"));
    }


    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Optional<String> count, ModelMap model) {
        int countInt = Integer.parseInt(count.orElse("5"));
        if(countInt > 0 && countInt < 5) model.addAttribute("cars", cars.subList(0, countInt));
        else model.addAttribute("cars", cars);
        return "cars";
    }

}
