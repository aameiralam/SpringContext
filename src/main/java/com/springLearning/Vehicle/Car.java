package com.springLearning.Vehicle;

public class Car {

    private Engine engine;
    private AutomaticTransmission transmission;


    public Car(Engine engine, AutomaticTransmission transmission){
        this.engine= engine;
        this.transmission = transmission;
    }

    public void start(){
        engine.start();
    }

    public void transmissionStarts(){
        transmission.transmissionStarts();
    }





}
