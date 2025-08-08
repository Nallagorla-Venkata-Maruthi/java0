package Healthcare;

public class Cardiologist extends Doctor {

    public Cardiologist(String name) {
        super(name, "Cardiologist");
    }
    @Override
    public void diagnose(Patient patient) {
        System.out.println("Cardiologist " + name + " diagnosing patient: " + patient.getName());

        if (patient.getIllness().toLowerCase().contains("heart")) {
            System.out.println("Diagnosis: Heart-related issue");
        } else {
            System.out.println("Diagnosis: Not a heart issue.please go and meet General Physician");
        }
    }
}
