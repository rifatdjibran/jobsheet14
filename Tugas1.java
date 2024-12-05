import java.util.Scanner;

public class Tugas1 {

    static int hitungTotalRekursif(int[] angka, int n) {
        if (n == 0) {
            return 0;
        } else {
            return angka[n - 1] + hitungTotalRekursif(angka, n - 1);
        }
    }

    static int hitungTotalIteratif(int[] angka, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += angka[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        int[] angka = new int[n];
        for (int i = n; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i - 1] = sc.nextInt();
        }

        int totalRekursif = hitungTotalRekursif(angka, n);
        System.out.println("Total rekursif dari " + n + " angka yang dimasukkan adalah: " + totalRekursif);

        int totalIteratif = hitungTotalIteratif(angka, n);
        System.out.println("Total iteratif dari " + n + " angka yang dimasukkan adalah: " + totalIteratif);
    }
}
