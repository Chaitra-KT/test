package Spring_pro;

import lombok.Data;

@Data
public class Car {
String brand;
String color;
double price;
JblMusicSystem system;
@Override
public String toString() {
	return "Car [brand=" + brand + ", color=" + color + ", price=" + price + ", system=" + system + "]";
}

}
