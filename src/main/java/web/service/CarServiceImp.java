package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(1, 1, "qwe"));
        cars.add(new Car(2, 2, "wer"));
        cars.add(new Car(3, 3, "ert"));
        cars.add(new Car(4, 4, "rty"));
        cars.add(new Car(5, 5, "tyu"));
        cars.add(new Car(6, 6, "yui"));
        cars.add(new Car(7, 7, "uio"));
    }


    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCars(int count) {
        if (count > 0 && count < 5) {
            return cars.subList(0, count);
        }
        else return cars;
    }

}
