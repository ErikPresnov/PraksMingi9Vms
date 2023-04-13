import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Peaklass {

    public static void main(String[] args) {
        Inimene inimene = new Inimene("Peeter", "Paan", List.of("Mari", "Kalle"));

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("inimene.dat"))) {
            dos.writeUTF(inimene.getEesnimi());
            dos.writeUTF(inimene.getPerenimi());
            dos.writeInt(inimene.getLasteNimed().size());
            for (String s : inimene.getLasteNimed()) {
                dos.writeUTF(s);
            }
        } catch (Exception e) {}

        System.out.println(inimene.toString());

        try (DataInputStream dis = new DataInputStream(new FileInputStream("inimene.dat"));) {
            String eesnimi = dis.readUTF();
            String perenimi = dis.readUTF();

            List<String> lapsed = new ArrayList<>();
            int lapsi = dis.readInt();
            for (int i = 0; i < lapsi; i++) {
                lapsed.add(dis.readUTF());
            }

            Inimene loetud = new Inimene(eesnimi, perenimi, lapsed);
            System.out.println(loetud.toString());
        } catch (Exception e) {}
    }

}
