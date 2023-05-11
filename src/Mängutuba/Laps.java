package Mängutuba;

public class Laps implements Runnable {
    private Mängutuba mängutuba;
    private String nimi;

    public Laps(Mängutuba mängutuba, String nimi) {
        this.mängutuba = mängutuba;
        this.nimi = nimi;
    }

    @Override
    public void run() {
        int j = 10;
        while (j-- > 0) {
            String mänguasi = mängutuba.leiaMänguasi();
            for (int i = 0; i < 10000; i++) {}
            System.out.println(nimi + " mängib mänguasjaga " + mänguasi);
            for (int i = 0; i < 10000; i++) {}
            mängutuba.tagastaMänguasi(mänguasi);
        }
    }
}
