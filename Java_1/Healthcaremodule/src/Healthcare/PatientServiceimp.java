package Healthcare;

public class PatientServiceimp implements PatientceService {

    private Patient[]patientArray=new Patient[100];
    private int count = 0;
    @Override
    public void registerPatient(Patient patient) {
        if (count < patientArray.length) {
            patientArray[count] = patient;
            System.out.println("Patient"+ patient.getName() +"registered");
            count++;
        } else {
            System.out.println("Patient list full. Cannot register more patients.");
        }
    }
    @Override
    public void showPatientDetails(int patientId) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (patientArray[i].getId() == patientId) {
                Patient p = patientArray[i];
                System.out.println("ID:"+p.getId());
                System.out.println("Name:"+p.getName());
                System.out.println("Age:"+p.getAge());
                System.out.println("Illness:"+p.getIllness());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Patient not found.");
        }
    }
}
