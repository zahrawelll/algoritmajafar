
import java.util.Scanner;

public class persegiPanjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Panjang : ");
        double Panjang = scanner.nextDouble();
        
        System.out.print("Masukan Lebar : ");
        double Lebar = scanner.nextDouble();

        double luas = Panjang * Lebar ;

        System.out.print("Luas : " + luas);

        scanner.close();
    }
}
