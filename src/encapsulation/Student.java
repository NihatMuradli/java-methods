package encapsulation;

public class Student {
 public String name = "Nihat";
 public String password = "2009";
 private String score = "93";
 
 public String giveMeScoreInfo(String pass) {
	 if(pass.equals(password)) {
		 return score;
	 }else {
		 return "Password səhvdir";
	 }

 }
}
