package application;

public class Department {

	String name;
	int id;
	String country;
	String city;

	/*
	 *
	 * Your code comes here. Remember you can overload constructors.
	 *
	 */

	public Department(String name, int id, String country, String city) {
		this.name = name;
		this.id = id;
		this.country = country;
		this.city = city;
	}

	public Department() {
		name = "Test";
		id = 123;
		country = "Neverland";
		city = "Gotham";
	}

	public boolean isEquals(Department other) {
		Employee emp = new Employee();
		if (emp.id == (other.id)) {
			System.out.println("Die ID's sind gleich");
			return true;
		} else {
			return false;
		}
	}
}
