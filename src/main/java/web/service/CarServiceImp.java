package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;

@Service
public class CarServiceImp {
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

    public ArrayList<Car> getCars() {
        return cars;
    }

    public ArrayList<Car> getCars(int count) {
        if (count > 0 && count < 5) return (ArrayList<Car>) cars.subList(0, count);
        else return cars;
    }

}
