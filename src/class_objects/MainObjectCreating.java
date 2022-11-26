package class_objects;

public class MainObjectCreating {
	public static void main(String[] args) {
		 Car mustang = new Car();
		 mustang.speed = 298;
		 mustang.color = "black";
		 mustang.horsePower = 760; 
		 
		 System.out.println("Mustang speed: "+ mustang.speed);
		 System.out.println("Mustang color: "+ mustang.color);
		 System.out.println("Mustang Horse Power: "+ mustang.horsePower);
	}
}
