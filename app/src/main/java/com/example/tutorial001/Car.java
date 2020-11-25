package com.example.tutorial001;

import com.example.tutorial001.exception.InvalideException;

public class Car {
    private Long no = 1L;
    private String model = "1396";

    public Car(Long no, String model) throws InvalideException {
//        setNo(no);
//        setModel(model);
        this.no = no;
        this.model = model;
    }

    public Car() {

    }

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) throws InvalideException {
        if (no <= 0)
        {
            throw new InvalideException();
        }
        this.no = no;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
