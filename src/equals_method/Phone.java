package equals_method;

public class Phone {
 String model;
 int price;
 
 @Override
 public boolean equals(Object o) {
	 Phone p = (Phone)o;
	 if(this.model ==p.model&&this.price ==p.price) {
		 return true;
	 }
	 return false;
 }
}
