class iphone{
    String color;
    String storage;

    public void nyala() {System.out.println("iphone warna " + this.color + "menyala" + this.storage);}
    public void mati() {System.out.println("iphone warna " + this.color + "mati" + this.storage);}
    public void berdering() {System.out.println("iphone warna " + this.color + "berdering" + this.storage);}
    public void videocall() {System.out.println("iphone warna " + this.color + "videocall" + this.storage);}

    public static void main(String[] args) {
        iphone iGold = new iphone();
        iphone iGreen = new iphone();
        iphone iGrey = new iphone();
        iphone iDarkGrey = new iphone();

        iGold.color = "Gold ";
        iGreen.color = "Green ";
        iGrey.color = "Grey ";
        iDarkGrey.color = "Dark Grey ";

        iGold.storage = " 64GB";
        iGreen.storage = " 128GB";
        iGrey.storage = " 512GB";
        iDarkGrey.storage = " 64GB";

        System.out.println();
        iGreen.berdering();
        iDarkGrey.mati();
        iGold.nyala();
        iGrey.videocall();
        System.out.println();
    }
}