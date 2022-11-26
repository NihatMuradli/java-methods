package metodun_deyer_qaytarmasi;

public class employee_salary {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Shelby";
		e.weight = 80;
		
		salaryCalculator calculator = new salaryCalculator();
		calculator.calculateSalary(e);
		
		System.out.println("Total Salary: "+e.salary);
	}
 
}
