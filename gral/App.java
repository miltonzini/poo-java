public class App {
    public static void main(String[] args) {
        Address address1 = new Address("Calle falsa", 123, "Morón", "Buenos Aires");
        Address address2 = new Address("Calle falsa", 567, "Haedo", "Buenos Aires");

        // Person p = new Person("Juan", "Díaz", 35, address1);
        // Person q = new Person("Pedro", "Díaz", 10, address2);
        
        // Animal z = new Animal("Pedro", 10);
        
        
        // System.out.println(p.name);
        // System.out.println(p.surname);
        // System.out.println(p.age);

        // System.out.println(p.getName());
        // System.out.println(p.isAdult());
        // System.out.println(q.getName());
        // System.out.println(q.isAdult());

        // System.out.println(q);

        // Probando enum
        // for (Months month  : Months.values()) {
        //     System.out.println("el mes " + month + " tiene " + month.getDays() + " días.");
        // }

        // Probando método estático
        // System.out.println("Personas creadas: " + Person.getPersonsCount());
        // System.out.println(p.toString());


        // Probando Herencia
        Employee employee1 = new Employee("Fernando", "Díaz", 42, 2000, address1);
        Manager manager1 = new Manager("Sebastián", "Díaz", 42, 2000, address2, "Sales");

        System.out.println(employee1);
        System.out.println(manager1);
        System.out.println(manager1.getDepartment());


    }
}
