package hospital;

public class Nurse extends Employee implements DrawBlood, PatientCare {

	private int numberOfPatients;

	public Nurse(String name, String employeeNumber, int salary) {
		super(name, employeeNumber, salary);
		numberOfPatients = 0;
	}

	public int getNumberOfPatients() {
		return numberOfPatients;
	}

	public void addPatientToNurse() {
		numberOfPatients++;
	}

	public void removePatientFromNurse() {
		numberOfPatients--;
	}

	@Override
	public void increasePatientHealth(Patient patient) {
		patient.increaseHealth();
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.reduceBlood();
	}

	@Override
	public String toString() {
		return "Nurse [name=\" + name + \", employeeNumber=\" + employeeNumber + \", salary=\" + salary + numberOfPatients="
				+ numberOfPatients + "]";
	}

}
