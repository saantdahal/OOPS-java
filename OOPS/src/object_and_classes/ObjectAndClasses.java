package object_and_classes;


// Creating a  custom class
class Employee{
	int id;
	int salary;
	String name;

	//Creating a method for print the employee details
	public void PrintDetails() {
		System.out.println("The name is "+ name + " and the Employee id is "+ id +".");
	}

	public int getSalary() {
		return salary;
	}
}

public class ObjectAndClasses {
	public static void main(String[] args) {
		System.out.println("This is my custom class..");
		Employee emp = new Employee();// Crating a object
		Employee emp1 = new Employee();// Crating a Second object
		//	Setting Attributes for emp
		emp.id=1;
		emp.name="Santosh";
		emp.PrintDetails();
		emp.salary=7000;
		System.out.println("The salary of Employee 1 is "+ emp.salary +"\n");

		//	Setting Attributes for emp1
		emp1.id=2;	
		emp1.name="Aashika";
		emp1.PrintDetails();
		emp1.salary=5000;
		System.out.println("The salary of Employee 2 is "+ emp1.salary);
	}

}
