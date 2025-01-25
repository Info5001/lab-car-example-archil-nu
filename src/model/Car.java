package model;

// This class describes a car
public class Car {
    String manufacturer;
    int year;
    String modelName;

    Engine veryPowerfulEngine;
    Wheel frontLeftWheel;
    Wheel frontRightWheel;
    Wheel rearLeftWheel;
    Wheel rearRightWheel;
    
    public Car(String m, String md, int y, int hp){ // constructor
        manufacturer = m;
        modelName = md;
        year = y;

        veryPowerfulEngine = new Engine(hp);
        frontLeftWheel = new Wheel();
        frontRightWheel = new Wheel();
        rearLeftWheel = new Wheel();
        rearRightWheel = new Wheel();

    }

    public void drive() {
        System.out.println(modelName + " is driving");
        int speed = frontLeftWheel.getSpeed();
        System.out.println("The speed of the car is " + speed);
    }

    public void makeATurn() {
        System.out.println(modelName + " is making a turn");
    }

    public void stop() {
        System.out.println(modelName + " is stopping");
    }

    public void startTheEngine() {
        System.out.println(modelName + " is starting");
        veryPowerfulEngine.start();
    }

    public void setModelName(String n) {
        modelName = n;
    }

    public String getModelName() {
        return modelName;
    }

}
