
import java.util.Scanner;

public class kubus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan SIsi : ");
        double sisi = scanner.nextDouble();

        double volume = sisi * sisi * sisi;
        System.out.print("Volume Kubus : " + volume);
        
        scanner.close();
    }
}
