package wd;
import java.util.Scanner;

class Vasu{
	private int a;
	private String name;
	public void setId(int a) {
		this.a=a;
	}
	public int getId() {
		return a;
	}
}
public class Basic {
	
	public static void main(String[] args) {
		
		Vasu s1=new Vasu();
		s1.setId(10);
		int a=s1.getId();
		System.out.println(a);
	}

}
