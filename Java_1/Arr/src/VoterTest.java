
public class VoterTest {
	 public static void main(String[] args){
	        Voter c1= new Voter();
	        c1.setName("Maruthi");
	        c1.setAge(17);

	        System.out.println(" Voter Info");
	        System.out.println("Name:" + c1.getName());
	        System.out.println("Age :" + c1.getAge());

	        if (c1.canVote()) {
	            System.out.println("Status: Eligible to vote");
	        } else {
	            System.out.println("Status: Not eligible to vote");
	        }
	        
	 }
}

	 
