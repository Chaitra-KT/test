package spring_ioc_sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Tester {

public static void main(String[] args) {
	ClassPathResource resource=new ClassPathResource("/spring_ioc_sample/MyConfigFile.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	Bike bike=(Bike)factory.getBean("x");
	
System.out.println(bike);
}
}
