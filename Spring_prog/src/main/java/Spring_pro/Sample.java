package Spring_pro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("/Spring_pro/MyConfig.xml");
	Car car=(Car) context.getBean("car");
	System.out.println(car);
	Bike bike=(Bike) context.getBean("bike");
    System.out.println(bike);
	JblMusicSystem system=(JblMusicSystem)context.getBean("music");
	System.out.println(system);
}
}

