package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testingclass {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("abc.xml");
//	Animal animal=(Animal) context.getBean("x");
	//System.out.println(animal);
	Cat cat= (Cat) context.getBean("cat");
	System.out.println(cat);
	Dog dog=(Dog) context.getBean("dog");
	System.out.println(dog);
}
}
