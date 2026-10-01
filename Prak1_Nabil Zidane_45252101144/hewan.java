class hewan{
    String cara;

    public void jalan() {System.out.println("hewan jenis " + this.cara + "jalan" );}
    public void terbang() {System.out.println("hewan jenis " + this.cara + "terbang tinggi" );}
    
    public static void main(String[] args) {
        hewan kucing = new hewan();
        hewan anjing = new hewan();
        hewan burung = new hewan();
    

        kucing.cara = "kucing oren ";
        burung.cara = "burung elang ";
        anjing.cara = "anjing ";

        System.out.println();
        kucing.jalan();
        burung.terbang();
        anjing.jalan();
        System.out.println();
    }
}