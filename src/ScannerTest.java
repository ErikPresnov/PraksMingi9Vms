import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) throws IOException {
        kirjutaFaili("Algne text", "scannerTest.txt");

        Scanner scanner = new Scanner(Path.of("scannerTest.txt"));
        String rida = scanner.nextLine();
        scanner.close();

        kirjutaFaili("Mingi tekst mida kirjutada", "scannerTest.txt");

    }

    public static void loeFailist(String failitee) {
        try (FileInputStream fis = new FileInputStream(failitee);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            String rida = br.readLine();
            while (rida != null) {
                System.out.println(rida);
                rida = br.readLine();
            }
        } catch (Exception e) {}
    }

    public static void kirjutaFaili(String text, String failinimi) {
        try (FileOutputStream fos = new FileOutputStream(failinimi);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(osw)) {
            bw.write(text);
        } catch (Exception e) {}
    }
}
