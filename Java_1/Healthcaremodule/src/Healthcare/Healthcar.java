package Healthcare;

public class Healthcar {

	public static void main(String[] args)
	{
		Patient p1= new Patient(1,"Maruthi",30,"Kinney");
		Patient p2= new Patient (2,"Gopi",25,"Shoulder");
		PatientceService s1= new PatientServiceimp();
		s1.registerPatient(p1);
		s1.registerPatient(p2);
		s1.showPatientDetails(1);
		s1.showPatientDetails(2);
		Doctor d1= new GeneralPhysician ("Dr.Sai");
		Doctor d2= new Cardiologist("Dr. Vasu");
		d1.diagnose (p1); 
		d2.diagnose(p1);
		d2.diagnose(p2); 
		d1.diagnose(p2);
		}
	}


