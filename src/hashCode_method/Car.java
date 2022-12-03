package hashCode_method;

import java.util.Objects;

public class Car {
	String model;
	int speed;
	int horsePower;
	int price;
	
	@Override
	public int hashCode() {
		return Objects.hash(model,speed,horsePower,price);
	}
}
