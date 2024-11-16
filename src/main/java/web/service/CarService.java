package web.service;

import web.model.Car;

import java.util.ArrayList;


public interface CarService {
    public ArrayList<Car> getCars();
    public ArrayList<Car> getCars(int count);
}
