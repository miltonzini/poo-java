public class Animal {
    private String name;
    private int age;

    public Animal() { // Constructor vacío
        this.name = "";
        this.age = 0;

    }
    
    public Animal(String name, int age) { // Constructor por defecto
        if(age < 0) {
            throw new IllegalArgumentException("La edad debe ser positiva");
        }
        this.name = name;
        this.age = age;
    }

    // Getters y Setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    // Métodos

    public boolean isAdult() {
        return this.age >= 18;
    }

    @Override
    public String toString() {
        return this.name + " " + " de " + this.age + " años.";
    }
    
}