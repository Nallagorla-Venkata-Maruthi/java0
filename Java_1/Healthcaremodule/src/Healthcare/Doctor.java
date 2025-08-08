package Healthcare;

public abstract class Doctor {
	protected String name;
	protected String specilization;
	
	public Doctor(String name,String specilization) {
		this.name=name;
		this.specilization=specilization;
	}
	public abstract void diagnose(Patient patient);
}
