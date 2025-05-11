public class PublicAirport extends Airport{
    private int financing;
    private int handicapEmployees;

    public PublicAirport(){      
        this("", 0, 0, 0, 0);
    }
    public PublicAirport(String name, int inaugurationYear, int capacity, int financing, int handicapEmployees){        
        super(name, inaugurationYear ,capacity);
        this.financing = financing;
        this.handicapEmployees = handicapEmployees;
    }

    public int getFinancing() {
        return financing;
    }

    public void setFinancing(int financing) {
        this.financing = financing;
    }

    public int getHandicapEmployees() {
        return handicapEmployees;
    }

    public void setHandicapEmployees(int handicapEmployees) {
        this.handicapEmployees = handicapEmployees;
    }
    
    @Override
    public void totalEarnings(int quantity) {
        double earnings = quantity + this.financing + (this.handicapEmployees * 1000);

        System.out.println("Las ganancias han sido de " + earnings + ".");
    }

    @Override
    public String toString() {
        return super.toString() + "Financiación: " + financing + ". Empleados discapacitados: " + handicapEmployees + ". ";        
    }
    
}
