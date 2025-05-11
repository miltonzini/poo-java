import java.util.Objects;

public class Book {
    private String isbn;
    private String title;
    private int pages;
    private String author;
    private boolean isLoaned;

    public Book() {
        this("", "", 0, "", false);
    }
    
    public Book(String isbn, String title, int pages, String author, boolean isLoaned) {
        this.isbn = isbn;
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.isLoaned = isLoaned;
    }

    public String getIsbn() {
        return this.isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return this.pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getIsLoaned() {
        return this.isLoaned;
    }
    public void setLoaned(boolean isLoaned) {
        this.isLoaned = isLoaned;
    }

    public void lend() {
        if(this.isLoaned) {
            System.out.println("El libro ya está prestado");
        } else {
            this.isLoaned = true;
            System.out.println("El libro se ha prestado.");
        }
    }
    public void giveBack() {
        if(this.isLoaned) {
            this.isLoaned = false;
            System.out.println("El libro se ha devuelto");
        } else {
            System.out.println("El libro no está prestado.");
        }
    }
    public double print(double cost) {
        return cost * this.pages;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.isbn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Book other = (Book) obj;
        return Objects.equals(this.isbn, other.isbn);
    }

    @Override
    public String toString() {
        String message = "Libro: '" + this.title + "'. Autor: '" + this.author + "'. ISBN: " + this.isbn + ". Cantidad de páginas: " + this.pages + ".";
        
        if (!this.isLoaned) {            
            message += " Estado: disponible.";
        } else {
            message += " Estado: prestado.";
        }
        return message;
    }



    
}