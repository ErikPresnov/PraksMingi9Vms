package Seikluspark;

public class Rippsild {
    private char sillaTähis;
    private int läbimiseAeg;

    public Rippsild(char sillaTahis, int labimiseAeg) {
        this.läbimiseAeg = labimiseAeg;
        this.sillaTähis = sillaTahis;
    }

    public synchronized void ületa(Seikleja seikleja) throws InterruptedException {
        System.out.println(seikleja.getNimi() + " astus sillale " + sillaTähis + " " + ((System.currentTimeMillis() - seikleja.getAlgusAeg()) / 1000));
        Thread.sleep(1000 * läbimiseAeg);
        System.out.println(seikleja.getNimi() + " lahkus sillalt " + sillaTähis + " " + ((System.currentTimeMillis() - seikleja.getAlgusAeg()) / 1000));
    }
}