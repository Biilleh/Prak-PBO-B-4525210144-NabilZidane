package Pemesanan;

public class Main {
    public static void main(String[]args){
        Kopi Kopibiase = new Kopi();
        Kopi Kopiluarbiase = new Kopi(){
        @Override 
        public void racik() {
            System.out.println("Racikan ke-1 : kapal api + susu UHT + Gula Aren.");
        }
        };
        Kopi Kopisusu = new Kopi(){
        @Override 
        public void racik() {
            System.out.println("Racikan ke-2 : Liong + Skm.");
        }
        };
        Kopi Kopialpukat = new Kopi(){
        @Override 
        public void racik() {
            System.out.println("Racikan ke-3 : Nescaffe + Gula Batu.");
        }
        };
        Kopibiase.racik();

        System.out.println("\n--- Pesanan ke-1---");
        Kopiluarbiase.racik();

        System.out.println("\n--- Pesanan ke-2---");
        Kopisusu.racik();

        System.out.println("\n--- Pesanan ke-3---");
        Kopialpukat.racik();
}
}
