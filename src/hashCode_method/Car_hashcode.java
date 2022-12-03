package hashCode_method;

public class Car_hashcode {

	public static void main(String[] args) {
		Car mustang = new Car();
		mustang.model = "Ford Mustang Shelby";
		mustang.speed = 298;
		mustang.horsePower = 760;
		mustang.price = 80000;
		System.out.println(mustang.hashCode());
		
		
	}

}
