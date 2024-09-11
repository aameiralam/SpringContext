package Phone;

import com.springLearning.Vehicle.Car;
import com.springLearning.Vehicle.V6Engine;
import com.springLearning.Vehicle.V8Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {



        ApplicationContext contextIphone = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Iphone iphone14 = new Iphone(contextIphone.getBean("Iphone14", Iphone14.class));
        Iphone iphone15 = new Iphone(contextIphone.getBean("Iphone15", Iphone15.class));

        iphone14.cameraClick();
        iphone15.cameraClick();



    }
}
