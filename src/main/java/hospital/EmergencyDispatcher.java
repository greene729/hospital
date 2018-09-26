package hospital;

public class EmergencyDispatcher extends Receptionist implements PatientCare, DrawBlood {

	boolean onPhone;

	public EmergencyDispatcher(String name, String employeeNumber, int salary) {
		super(name, employeeNumber, salary);
		onPhone = false;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.reduceBlood();

	}

	@Override
	public void increasePatientHealth(Patient patient) {
		patient.increaseHealth();

	}

	@Override
	public String toString() {
		return "Emergency Dispatcher [name=" + getName() + ", employeeNumber=" + getEmployeeNumber() + ", salary="
				+ getSalary() + ", isOnPhone=" + isOnPhone() + "]";
	}

}
