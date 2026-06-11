package ai0611.lab.subcar;

import ai0611.lab.car.Car;

public class SportsCar extends Car {

    @Override
    public void upSpeed(int speed) {
        this.speed += speed;
    }
}