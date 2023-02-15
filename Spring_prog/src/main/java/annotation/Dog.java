package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog {
	@Value("Johny")
	String name;
	@Value("black")
	String color;
	@Autowired
	chain chain;
	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", chain=" + chain + "]";
	}

}
