public class Manager extends Employee {
    private String department;

    public Manager(String name, String surname, int age, int salary, String department) {
        super(name, surname, age, salary, new Address());
        this.department = department;
    }
    public Manager(String name, String surname, int age, int salary, Address address, String department) {
        super(name, surname, age, salary, address);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public double annualCost() {
        if (this.department == "sales") {
            return 200;        
        } else {
            return 250;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ". Departamento: " + department + ".";
    }
}
