package hospital;

public class Surgeon extends Doctor {
	private boolean operating;

	public Surgeon(String name, String employeeNumber, String specialty, int salary) {
		super(name, employeeNumber, specialty, salary);
		operating = false;
	}

	public boolean isOperating() {
		return operating;
	}

	public void toggleOperating() {
		operating = !operating;
	}

	@Override
	public String toString() {
		return "Surgeon [name=" + getName() + ", employeeNumber=" + getEmployeeNumber() + ", salary=" + getSalary()
				+ ", specialty=" + getSpecialty() + ", operating=" + operating + "]";

	}

}
