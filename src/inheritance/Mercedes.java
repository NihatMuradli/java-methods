package inheritance;

public class Mercedes extends Car {
	 String color;
	 public void printInfo() {
		 super.printInfo();
		 System.out.println("Color: " + color);
	 }
}
