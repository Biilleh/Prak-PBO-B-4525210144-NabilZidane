package Static_nested;

public class Main {
    public static void main(String[] args){

        System.out.println("=== Vending Machine Demo ===\n");
        VendingMachine.Product p1 = new VendingMachine.Product("coca cola", 8000);
        VendingMachine.Product p2 = new VendingMachine.Product("Fanta ", 5000);
        VendingMachine.Product p3 = new VendingMachine.Product("AQUA", 3000);

        System.out.println("--- Product Info ---");
        p1.displayinfo();
        p2.displayinfo();

        System.out.println("Total product created : " + VendingMachine.Product.getTotalProduct());
        System.out.println();

        VendingMachine vm1 = new VendingMachine("Kantin");
        VendingMachine vm2 = new VendingMachine("Pinggir jalan");

        System.out.println("--- Vending Machine ---");
        vm1.displayMachineinfo();
        vm2.displayMachineinfo();
        System.out.println();

        System.out.println("--- Purchase Simulation ---");
        vm1.buyProduct(p1, 2);
        vm2.buyProduct(p2, 1);
        vm1.buyProduct(p3, 3);
    }
}
