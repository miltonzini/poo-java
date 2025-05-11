public abstract class Airport {
    private int id; // tiene que ser autoincremental
    private String name;
    private int inaugurationYear;
    private int capacity;

    public static int autoIncrementalId = 1;

    public Airport(){
        this("", 0, 0);
    }
    public Airport(String name, int inaugurationYear, int capacity){
        this.name = name;
        this.inaugurationYear = inaugurationYear;
        this.capacity = capacity;
        this.id = Airport.autoIncrementalId++;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getInaugurationYear(){
        return this.inaugurationYear;
    }
    public void setInaugurationYear(int inaugurationYear){
        this.inaugurationYear = inaugurationYear;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public abstract void totalEarnings(int quantity);

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", inaugurationYear=" + inaugurationYear +
                ", capacity=" + capacity +
                '}';
    }

}
