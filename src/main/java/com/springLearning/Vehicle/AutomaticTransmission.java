package com.springLearning.Vehicle;

public class AutomaticTransmission implements Transmission {
    @Override
    public void transmissionStarts() {
        System.out.println("Transmission kicks in");
    }
}
