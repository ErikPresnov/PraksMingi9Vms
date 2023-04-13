import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class VooSulgemine {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        fis.close();

        Scanner scanner = new Scanner(System.in);
        String nali = scanner.nextLine();
    }
}
