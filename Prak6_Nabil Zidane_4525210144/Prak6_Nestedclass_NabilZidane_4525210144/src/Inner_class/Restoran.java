package Inner_class;

public class Restoran {
    private String restoranNama;
    private String address;
    private String phone;

    private static int totalrestoran = 0;

    public Restoran(String restoranNama, String address, String phone){
        this.restoranNama = restoranNama;
        this.address = address;
        this.phone = phone;
        totalrestoran++;
        System.out.println("Restoran" + restoranNama + "created!");
    }
    public void displayrestoraninfo(){
        System.out.println("\n--info restoran--");
        System.out.println("Nama : " + restoranNama);
        System.out.println("Alamat : " + address);
        System.out.println("Telpon : " + phone);
    }
    public Order createOrder(String customerName){
        return new Order (customerName);
    }
    public class Order{
        private String customerName;
        private String[] items;
        private int[] quantities;
        private double totalharga;
    
    public Order(String customerName){
        this.customerName = customerName;
        this.items = new String[10];
        this.quantities = new int [10];
        this.totalharga = 0.0;
    }
    public void addItem(String itemName, int quantiity, double harga){
        for(int i=0; i< items.length;i++){
            if(items[i] ==null){
                items[i] = itemName;
                quantities[i] = quantiity;
                break;
            }   
        }
    }
    public void displayorder(){
        System.out.println("\n==order ditail==");
        System.out.println("restoran : " +restoranNama);
        System.out.println("alamat : "+ address);
        System.out.println("customer : "+ customerName);
        System.out.println("total restoran : "+totalrestoran);

        System.out.println("\n==item order==");
        for (int i = 0; i < items.length; i++){
            if(items[i] != null){
                System.out.println("- " + items[i] + " x" +quantities[i]);
            }
        }
        System.out.println("======================");
        System.out.println("total : Rp." + totalharga);
        System.out.println("terimakasih atas orderan anda dati " + restoranNama + "!");
    }
        public void processOrder(){
            System.out.println("\n processing Order for " + customerName + " at " + restoranNama);
            System.out.println("kontak: " +phone);
            System.out.println("delivery to previded address...");
        }
    }
}
    
