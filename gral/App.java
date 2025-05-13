import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Address address1 = new Address("Calle falsa", 123, "Morón", "Buenos Aires");
        // Address address2 = new Address("Calle falsa", 567, "Haedo", "Buenos Aires");

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
        // Employee employee1 = new Employee("Fernando", "Díaz", 42, 2000, address1);
        // Manager manager1 = new Manager("Sebastián", "Díaz", 42, 2000, address2, "Sales");

        // System.out.println(employee1);
        // System.out.println(manager1);
        // System.out.println(manager1.getDepartment());

        
        // Probando Interfaces
        // Circle firstCircle = new Circle(5);
        // Square firstSquare = new Square(5);

        // System.out.println("Area firstCircle: " + firstCircle.calculateArea());
        // System.out.println("Perímetro firstCircle: " + firstCircle.calculatePerimeter());
        // System.out.println("Area firstSquare: " + firstSquare.calculateArea());
        // System.out.println("Perímetro firstSquare: " + firstSquare.calculatePerimeter());

        // Probando Arrays de objetos y InstanceOf
        // Person[] persons = {
        //     new Employee("Juan", "Pérez", 32, 1000),
        //     new Employee("Lucas", "Pérez", 32, 1000),
        //     new Employee("Esteban", "Gimenez", 33, 1000),
        //     new Manager("Fernando", "Díaz", 50, 2000, "Marketing"),
        //     new Manager("Mariano", "Pérez", 46, 2000, "Software Development")
        // };

        // int employeesCount = 0;
        // int managersCount = 0;
        // for (Person person : persons) {
        //     if (person instanceof Manager) {
        //         managersCount++;
        //     } else if (person instanceof Employee) {
        //         employeesCount++;
        //     }
        // }
        // System.out.println("Empleados (sin contar Managers): " + employeesCount + ".");
        // System.out.println("Managers: " + managersCount + ".");

        // Probando compareTo()
        Employee a = new Employee("Juan", "Gómez", 30, 1000);
        Employee b = new Employee("Lucas", "Gómez", 32, 1000);

        if (a.compareTo(b) > 0) {            
            System.out.println("La persona A es mayor");
        } else if (a.compareTo(b) < 0) {
            System.out.println("La persona B es mayor");
        } else {
            System.out.println("A y B tienen la misma edad");
        }

        Employee[] employees = {
            a, 
            b,
            new Employee("Matías", "Díaz", 33, 1200),
            new Employee("Esteban", "Dominguez", 25, 1000),
        };

        Arrays.sort(employees); // Esto ordena el array usando lo que hicmos en compareTo (comparar la edad)
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
