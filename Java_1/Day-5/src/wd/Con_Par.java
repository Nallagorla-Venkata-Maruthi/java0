package wd;

public class Con_Par {
	String name;
	int id;
	
	Con_Par(String Empname,int empid){
		name=Empname;
		id=empid;
	}
	
	void display() {
		System.out.println("This is Employe Name:");
		System.out.println(id);
	}
	public static void main(String[] args) {
		Con_Par c1= new Con_Par("Maruthi",100);
		Con_Par c2= new Con_Par("Vasu",10000);	
		c1.display();
		c2.display();
	}
}
	
	
