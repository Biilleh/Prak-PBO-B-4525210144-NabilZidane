package Static_nested;

public class VendingMachine {
    private static String machineBrand = "javaVend";
    private static int totalMachines = 0;
    private static final int MAX_ITEMS = 0;

    private String location;
    private int machineId;

    public VendingMachine(String location){
        this.location = location;
        totalMachines++;
        this.machineId = totalMachines;
    }
    public void displayMachineinfo(){
        System.out.println("Machine Id: " + machineId);
        System.out.println("location : " + location);
        System.out.println("Brand : " + machineBrand);
        System.out.println("Total Machine : " + totalMachines);
    }
    public void buyProduct(Product product, int quantity){
        System.out.println("===Vanding Machine #" + machineId + "at" + location + "===");
        System.out.println("Buying " + quantity + " x" + product.getname());
        System.out.println("Total : Rp." + (product.getPrice() * quantity));
    }
    public static class Product{
        private String name;
        private int price;
        private static int totalProduct = 0;
        public Product(String name, int price){
            this.name = name;
            this.price = price;
            totalProduct++;
        }
        public void displayinfo(){
        System.out.println("product : " + name);
        System.out.println("Price : Rp." + price);
        System.out.println("Brand : " + machineBrand);
        System.out.println("Max Items : " + MAX_ITEMS);
        System.out.println();
        }
        public int getPrice(){
            return price;
        }
        public String getname(){
            return name;
        }
        public static int getTotalProduct(){
            return totalProduct;
        }
    }
}

