package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


public interface CarService {
    public List<Car> getCars();

    public List<Car> getCars(String count);
}
