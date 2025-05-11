public class App {
    public static void main(String[] args) {

        Computer computer1 = new Computer("Dell", "XPS", 64, 50);
        computer1.turnOn();
        computer1.turnOn();
        
        System.out.println(computer1);        
        computer1.turnOff();
        
        computer1.turnOn();
        System.out.println(computer1);        

        computer1.transferData(30);
        computer1.transferData(30);
        
        computer1.deleteFiles(20);;
        computer1.deleteFiles(20);;


        Computer computer2 = new Computer("Dell", "XPS", 16, 50);

        if (computer2.equals(computer1)) {
            System.out.println("Ambas computadoras son iguales");
        } else {
            System.out.println("Las computadoras son diferentes");
        }
    }
}
