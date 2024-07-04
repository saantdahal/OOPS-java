package object_and_classes;


// Creating a  custom class
class Employee{
	int id;
	String name;
}

public class ObjectAndClasses {
	public static void main(String[] args) {
		System.out.println("This is my custom class..");
		Employee emp = new Employee();// Crating a object
		
		//	Setting Attributes
		emp.id=1;
		emp.name="Santosh";

		System.out.println(emp.id);
		System.out.println(emp.name);


	}

}
