package spring_dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Maincla {
ApplicationContext context=new AnnotationConfigApplicationContext(Settingclass.class);
Mobile mobile= (Mobile)context.getBean("mobile");
mobile.sim.getSimdetails();

}
