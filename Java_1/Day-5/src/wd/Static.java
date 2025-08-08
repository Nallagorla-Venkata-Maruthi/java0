package wd;

public class Static {
	
	void Hi() {
		System.out.println("I am Maruthi");
	}
	
	static void hello() {
		System.out.println("Hello How Are You");
	}

public static void main(String[] args) {
	
	Static s= new Static();
	s.Hi();
	Static.hello();

}
}
