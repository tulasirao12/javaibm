import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Employee e1 = new Employee("scott",5000);
		e1.payslip();
		Employee e2 = new Employee("smith",3000);
		e2.payslip();*/
		Executive ex1 = new Executive("ram",5000,4000);
		
		
		Manager m1 = new Manager("hari",3000,2000);
		
		showSalary(ex1);
		showSalary(m1);
		
		
		 
	}
	private static void showSalary(Employee e) {
		if(e instanceof Manager)
			System.out.println("Manager Salary\t:"+e.getSalary());
		else
			System.out.println("Executive Salary\t:"+e.getSalary());
		
	}


	

//	private static void showSalary(Manager m1) {
	//	System.out.println("Manager Salary\t:"+m1.getSalary());
		
	//}

	//private static void showSalary(Executive ex1) {
		//System.out.println("Executive Salary\t:"+ex1.getSalary());
		
//	}

}
