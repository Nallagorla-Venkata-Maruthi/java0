package collections;

import java.time.LocalDateTime;

class Appointment{
	private String patientname;
	private LocalDateTime datetime;

	public Appointment(String patientname, LocalDateTime datetime) {
		this.patientname=patientname;
		this.datetime=datetime;
	}
	public LocalDateTime getdateTime() {
		return datetime;
	}

	public LocalDateTime getDateTime() {
    return datetime;
	}
	
	public int hashCode() {
        return Objects.hash(datetime);
    }
    public boolean equals(Object x) {
        if (this == x) return true;
        if (!(x instanceof Appointment)) return false;
        Appointment a = (Appointment) x;
        return this.datetime==(a.datetime); // Unique by date & time
    }

	}

public class Hospital_Sorted {
	
	

	public static void main(String[] args) {
		

	}

}
