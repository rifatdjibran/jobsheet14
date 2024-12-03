import java.util.Scanner;

public class Percobaan2_18 {

    static String deret = ""; 

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            deret += "1"; 
            return 1;
        } else {
            deret += x + "x"; 
            return x * hitungPangkat(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        deret = ""; 
        int hasil = hitungPangkat(bilangan, pangkat);
        
        System.out.println("Perhitungan: " + deret + " = " + hasil);
        System.out.println("Hasil dari " + bilangan + " pangkat " + pangkat + " adalah: " + hasil);
    }
}
