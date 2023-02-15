package spring_ioc_sample;

import lombok.Data;


public class Mobile {
String brand;
int RAM;
String color;
double price;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getRAM() {
	return RAM;
}
public void setRAM(int rAM) {
	RAM = rAM;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
