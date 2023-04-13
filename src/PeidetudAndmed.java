import java.io.RandomAccessFile;

public class PeidetudAndmed {

    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("peidetud.txt", "r")) {
            long asukoht = -raf.readLong() % raf.length();
            System.out.println(raf.length());
            System.out.println("Asukoht -> " + asukoht);
            raf.seek(asukoht);
            int i = raf.readInt();
            System.out.println("Loetud int -> " + i);
        } catch (Exception e) {}
    }
}
