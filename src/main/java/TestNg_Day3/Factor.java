package TestNg_Day3;

import org.testng.annotations.Factory;

public class Factor {
	@Factory
	public Object[] createInstances() {
		return new Object[] {
		new Factories("https://o2.openmrs.org/openmrs/login.htm"),
		new Factories("https://www.google.com"),
		new Factories("https://www.instagram.com")
	};
	}
}
