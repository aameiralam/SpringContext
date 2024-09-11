package com.springLearning.Vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Engine engine1 = new V6Engine();
//        Engine engine2 = new V8Engine();

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");


        Car car1 = new Car(context.getBean("V6Engine", V6Engine.class), context.getBean("AutomaticTransmission", AutomaticTransmission.class));

        Car car2 = new Car(context.getBean("V8Engine",V8Engine.class), context.getBean("AutomaticTransmission", AutomaticTransmission.class));


        //without new keyword
        // it is getting the bean directly now.
        Car carWithoutNew = context.getBean("carV6",Car.class);

        car1.start();
        car2.start();
        car1.transmissionStarts();


    }
}