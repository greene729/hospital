package hospital;

public class HospitalApp {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();

		hospital.addEmployee(new WitchDoctor("Garbage", "WD1", "necronancy", -1250000));
		hospital.addEmployee(new VampireJanitor("Vlad", "J1", 40000));
		hospital.addEmployee(new Surgeon("Killer", "S1", "Eyes", 120000));
		hospital.addEmployee(new Nurse("Glados", "N1", 45000));
		hospital.addEmployee(new Receptionist("Tammy", "R1", 45000));
		hospital.addEmployee(new EmergencyDispatcher("DootDoot", "ED1", 45000));

		for (Employee employee : hospital.getEmployees()) {
			System.out.println(employee);

		}
	}
}