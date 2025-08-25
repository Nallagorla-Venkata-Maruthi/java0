package TestNg_Day3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

public class Parllel_Methods {
	
	private String getCurrentTime() {
		return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS"));
		
	}
	@Test
    public void test1() {
		System.out.println("Test 1 | Time: "+ getCurrentTime()+   " | Thread ID: " + Thread.currentThread().getId());
    }
    @Test
    public void test2() {
    	System.out.println("Test 1 | Time: " +getCurrentTime() + " | Thread ID: " + Thread.currentThread().getId());
    }

}
