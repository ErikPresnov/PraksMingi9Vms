package Seikluspark;

public class Seikluspark {
    public static void main(String[] args) {
        Rippsild[] sillad = {new Rippsild('A', 10), new Rippsild('B', 20)};
        Seikleja esimene = new Seikleja("Rasmus", true, sillad);
        Seikleja teine = new Seikleja("Grete", false, sillad);
        Thread t1 = new Thread(esimene);
        Thread t2 = new Thread(teine);
        t1.start();
        t2.start();
    }
}
