public class Voter {
	
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean canVote() {
        return age >= 18;
    }
}
