package Spring_pro;

public class Bike {
String Company;
int cc;
String color;
JblMusicSystem sytem;

public Bike(String company, int cc, String color, JblMusicSystem sytem) {
	super();
	Company = company;
	this.cc = cc;
	this.color = color;
	this.sytem = sytem;
}
public Bike() {
	
}
@Override
public String toString() {
	return "Bike [Company=" + Company + ", cc=" + cc + ", color=" + color + ", sytem=" + sytem + "]";
}

}
