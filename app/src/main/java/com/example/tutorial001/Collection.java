package com.example.tutorial001;

import java.util.ArrayList;

public class Collection {
    ArrayList<Car> cars = new ArrayList<>();
    public void insertCar(Car car)
    {
        car.getModel();
        cars.add(car);
    }
}
