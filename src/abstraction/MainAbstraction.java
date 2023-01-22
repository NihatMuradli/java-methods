package abstraction;

public class MainAbstraction {

	public static void main(String[] args) {

		Car[] cars = new Car[3];
		cars[0] = new BMW();
		cars[1] = new Mercedes();
		cars[2] = new Audi();
		
		for (Car car : cars) {
			car.driving();
		}
		
		System.out.println();
		Car c1=new BMW();
		c1.makeSound();
		
	}

}