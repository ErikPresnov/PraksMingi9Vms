import java.io.*;

public class PuhverdatudVood {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("käsurealt.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write(args[0]);


        try (FileInputStream fis = new FileInputStream("käsurealt.txt");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr);) {
            System.out.println(br.readLine());
        } catch (Exception e) {}

    }


}
