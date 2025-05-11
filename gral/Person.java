import java.util.Objects;

public abstract class Person {
    public static int personsCount = 0; // Atributo estático

    private String name;
    private String surname;
    private int age;
    private Address address; // Objeto como atributo

    public Person() { // Constructor vacío
        this("", "", 0, new Address());

    }
    
    public Person(String name, String surname, int age, Address address) { // Constructor por defecto
        if(!PersonValidation.validateAge(age)) {
            throw new IllegalArgumentException("La edad debe ser positiva");
        }
        if(address == null) {
            throw new IllegalArgumentException("La dirección debe existir");
        }
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        Person.personsCount++;
        System.out.println("Personas creadas: " + personsCount);
    }

    // Getters y Setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(!PersonValidation.validateAge(age)) {
            throw new IllegalArgumentException("La edad debe ser positiva");
        }
        this.age = age;
    }

    public static int getPersonsCount() {
        return personsCount;
    }



    // Métodos

    public String fullName() {
        return this.name + " " + this.surname + ".";
    }

    public String fullName(String title) { // Sobrecarga
        return title + " " + this.name + " " + this.surname + ".";
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    public abstract double annualCost(); // Método abstracto. Hay Polimorfismo, porque las clases hijas tienen métodos con el mismo nombre que sobreescriben este.

    @Override
    public String toString() {
        return this.name + " " + this.surname + " de " + this.age + " años. Dirección: " + this.address.toString() + ".";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.surname);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if(!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.surname, other.surname);
    }
    
}