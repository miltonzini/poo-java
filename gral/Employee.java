public class Employee extends Person{
    private double salary;

    public Employee(String name, String surname, int age, double salary) {
        super(name, surname, age, new Address());
        this.salary = salary;
    }
    public Employee(String name, String surname, int age, double salary, Address address) {
        super(name, surname, age, address);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double annualCost() {
        return 100;
    }

    @Override
    public String toString() {
        return super.toString() + ", salario: " + this.salary;
    }

}
