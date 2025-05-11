public class PrivateAirport extends Airport {
    private int partners;

    public PrivateAirport(){
        this("", 0, 0, 0);
    }
    public PrivateAirport(String name, int inaugurationYear, int capacity, int partners){
        super(name, inaugurationYear, capacity);
        this.partners = partners;
    }
    public int getPartners() {
        return partners;
    }

    public void setPartners(int partners) {
        this.partners = partners;
    }

    @Override
    public void totalEarnings(int quantity) {
        double partnerEarnings = quantity / this.partners;
        System.out.println("Cada socio ganó $" + partnerEarnings + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ". Cantidad de socios: " + partners + ".";
    }
    
}
