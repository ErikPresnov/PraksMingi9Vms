import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Praks9 {


    public static void main(String[] args) throws IOException {
        for (String s : loeParool("paroolid.txt")) {
            System.out.println(s);
        }
    }

    public static void kirjutaFaili(String text, String failinimi) {
        try (FileOutputStream fos = new FileOutputStream(failinimi);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(osw)) {
            bw.write(text);
        } catch (Exception e) {}
    }

    public static void loeFailist(String failitee) {
        try (FileInputStream fis = new FileInputStream(failitee);
             InputStreamReader isr = new InputStreamReader(fis, "windows-1257");
             BufferedReader br = new BufferedReader(isr)) {
            String rida = br.readLine();
            while (rida != null) {
                System.out.println(rida);
                rida = br.readLine();
            }
        } catch (Exception e) {}
    }

    public static List<String> loeParool(String failitee) throws IOException {
        List<String> leitudParoolid = new ArrayList<>();

        List<String> read = Files.readAllLines(Path.of(failitee));
        for (String s : read) {
            if (s.contains("parool")) {
                StringBuilder parool = new StringBuilder();
                char c = s.split("parool: ")[1].toCharArray()[0];
                int i = 1;
                while (c != ' ') {
                    parool.append(c);
                    c = s.split("parool: ")[1].toCharArray()[i++];
                }
                leitudParoolid.add(parool.toString());
            }
        }

        return leitudParoolid;
    }
}
