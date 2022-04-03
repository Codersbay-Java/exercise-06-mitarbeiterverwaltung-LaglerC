package application;

public class Employee {
	final Department dept;

	String firstName;
	String lastName;
	int id;

	/*
	 *
	 * Your code comes here. Remember you can overload constructors.
	 *
	 */

	public Employee(String firstName, String lastName, int id, Department dept) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.dept = dept;
	}

	public Employee() {
		firstName = "Max";
		lastName = "Mustermann";
		id = 123;
		dept = new Department();
	}

	public void print() {
		System.out.println("Der Mitarbeiter " + id + " " + firstName + " " + lastName + " arbeitet in der Abteilung "
				+ dept.name + " in " + dept.city);
	}

	public boolean isEquals(Employee other) {
		if (dept.id == (other.id)) {
			System.out.println("Die ID's sind gleich");
			return true;
		} else {
			return false;
		}
	}
}
