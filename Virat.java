package inheritance;

public class Virat {

	public static void main(String[] args) {
		Manager mgr = new Manager();
		mgr.calculateincententive();
		mgr.calculatesalary();
		
		Employee emp = new Employee();
		emp.calculatesalary();
		//emp.calculateincententive(); becouse perent chlid ko access nhi kr skta
		

	}

}
