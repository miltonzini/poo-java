public class App {
    public static void main(String[] args) {

        Book firstBook = new Book("123456798", "Rayuela", 500, "Julio Cortázar", false);

        System.out.println(firstBook.toString());        
        firstBook.lend();
        System.out.println(firstBook.toString());
        firstBook.giveBack();;
        System.out.println(firstBook.toString());

        Book secondBook = new Book("123456798", "Rashuela", 500, "Julio Cortázar", false);

        if (secondBook.equals(firstBook)) {
            System.out.println("Los libros son iguales (mismo ISBN).");
        } else {
            System.out.println("Son diferentes libros.");
        }


    }
}
