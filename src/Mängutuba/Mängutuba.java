package Mängutuba;

import java.util.Arrays;

public class Mängutuba {
    private String[] riiul;

    public Mängutuba(String[] riiul) {
        this.riiul = riiul;
    }

    public String leiaMänguasi() {
        int parim = -1;
        for (int i = 0; i < riiul.length; i++) {
            if (riiul[i] != null &&
                (parim == -1 || riiul[i].length() > riiul[parim].length())) {
                parim = i;
            }
        }
        String valik = riiul[parim];
        riiul[parim] = null;
        System.out.println(valik + " võeti ära " + Arrays.toString(riiul));
        return valik;
    }

    public void tagastaMänguasi(String mänguasi) {
        for (int i = 0; i < riiul.length; i++) {
            if (riiul[i] == null) {
                riiul[i] = mänguasi;
                break;
            }
        }
        System.out.println(mänguasi + " toodi tagasi " + Arrays.toString(riiul));
    }

    public static void main(String[] args) {
        Mängutuba tuba = new Mängutuba(new String[]{"rong", "puzzle", "nukk"});
        Runnable laps1 = new Laps(tuba, "Volli");
        Laps laps2 = new Laps(tuba, "Martin");
        Thread t1 = new Thread(laps1);
        Thread t2 = new Thread(laps2);
        t1.start();
        t2.start();
    }
}
