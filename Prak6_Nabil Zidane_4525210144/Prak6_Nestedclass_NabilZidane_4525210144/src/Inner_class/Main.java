package Inner_class;

public class Main {
    public static void main(String[] args){
        System.out.println("=== Restoran Order Sistem===");

        Restoran MCD = new Restoran("mekdi", "Jl. sudirman", "08123456");
        Restoran KFC = new Restoran("KFC", "Jl. BOGOR", "081234578");

        MCD.displayrestoraninfo();
        KFC.displayrestoraninfo();

        Restoran.Order order1 = KFC.createOrder("nabil");
        order1.displayorder();
    }
}
