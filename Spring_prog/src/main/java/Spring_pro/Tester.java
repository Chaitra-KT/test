package Spring_pro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Tester {
public static void main(String[] args) {
	ClassPathResource resource=new ClassPathResource("/Spring_pro/MyConfig.xml");
	BeanFactory factory= new XmlBeanFactory(resource);
	Bike bike1=(Bike) factory.getBean("x");
	Bike bike2=(Bike) factory.getBean("x");
	System.out.println(bike1);
	System.out.println(bike2);
}
}
