package klonlamaq;

public class MainKlon {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Car c1 = new Car();
		c1.brand="Lamborghini";
		c1.model="Aventador";
		c1.speed =350;
		c1.horsePower =740;
		c1.color = "Green";
		c1.seats = 2;
		c1.doors = 2;
		c1.year = 2020;
		
		Car c2 = (Car) c1.clone();
		c2.printInfo();
	}

}
