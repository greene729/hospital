package hospital;

public class Receptionist extends Employee {

	private boolean onPhone;

	public Receptionist(String name, String employeeNumber, int salary) {
		super(name, employeeNumber, salary);
		onPhone = false;
	}

	public boolean isOnPhone() {
		return onPhone;
	}

	public void toggleOperating() {
		onPhone = !onPhone;
	}

	@Override
	public String toString() {
		return "Receptionist [name=" + getName() + ", employeeNumber=" + getEmployeeNumber() + ", salary=" + getSalary()
				+ "isOnPhone=" + isOnPhone() + "]";
	}

}
