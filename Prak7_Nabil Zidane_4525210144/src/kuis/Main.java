package kuis;
public class Main {
    public static void main(String[]args){
        
        Musik Musikpop = new Musik();
        Musik Musikdj = new Musik(){
        @Override 
        public void putar() {
            System.out.println("DJ remix hihu");
        }
        };

    System.out.println("\n--- Musik dj---");
    Musikdj.putar();

    System.out.println("\n--- musik pop---");
    Musikpop.putar();
}
}