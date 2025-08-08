public class Ba_ac {

	public static void main(String[] args) {
		Bank_ac emp = new Bank_ac();

        emp.setName("Maruthi");
        emp.setId(101);
        emp.setSalary(50000);
        System.out.println("--- Employee Details ---");
        System.out.println("Name   : " + emp.getName());
        System.out.println("ID     : " + emp.getId());
        System.out.println("Salary : ₹" + emp.getSalary());
    }
}
