package my_return;

public class Numbers {
   public void printOddNumber(int number) {
	   if(number%2==0) {
		   return;
	   }
	   System.out.println(number);
   }
}
