package klonlamaq;

public class Car implements Cloneable{
	
	String brand;
	String model;
	int speed;
	int horsePower;
	String color;
	int seats;
	int doors;
	int year;
	
	public void printInfo() {
		System.out.println("Brand: " + brand);
		 System.out.println("Model: " + model);
		 System.out.println("Top Speed: " + speed);
		 System.out.println("Engine power (hp): " + horsePower);
		 System.out.println("Color: " + color);
		 System.out.println("Seats: " + seats);
		 System.out.println("Doors: " + doors);
		 System.out.println("Year: " + year);
	 }
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
