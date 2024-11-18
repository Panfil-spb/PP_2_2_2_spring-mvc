package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;

@Service
public interface CarService {
    public ArrayList<Car> getCars();

    public ArrayList<Car> getCars(int count);
}
