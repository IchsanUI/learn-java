import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nilai :");
        int Nilai = input.nextInt();

        int Banyak = Nilai*2;

        for (int i = Nilai; i >= 1; i--) {
            System.out.print(" " + i);
        }
        for (int i = 2; i <= (Banyak - Nilai); i++) {
            System.out.print(" " + i);
        }       



        // System.out.println("Masukan Banyak Deret :");
        // int BanyakDeret = input.nextInt();

        // System.out.println("Mulai Dengan Angka :");
        // int MulaiDari = input.nextInt();

        // if (BanyakDeret > MulaiDari) {
        //     for (int i = MulaiDari; i >= 1; i--) {
        //         System.out.print(" " + i);
        //     }
        //     for (int i = 2; i <= (BanyakDeret - MulaiDari); i++) {
        //         System.out.print(" " + i);
        //     }
        // } else {
        //     for (int i = MulaiDari; i >= 1; i--) {
        //         if (i == BanyakDeret) {
        //             break;
        //         } else {
        //             System.out.print(" " + i);
        //         }
        //     }
        // }

    }
}
