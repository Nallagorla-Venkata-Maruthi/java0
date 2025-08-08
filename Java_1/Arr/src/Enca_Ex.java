public class Enca_Ex {
    private double salary;

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount");
        }
    }
}
