package inheritance;

public class Car {
 String model;
 int price;
 int hp;
 double engine;
 String transmission;
 String fuel;
 
 public void printInfo() {
	 System.out.println("Model: " + model);
	 System.out.println("Price (AZN): " + price);
	 System.out.println("Engine power (hp): " + hp);
	 System.out.println("Engine: " + engine);
	 System.out.println("Transmission: " + transmission);
	 System.out.println("Fuel Type: " + fuel);
 }
}
