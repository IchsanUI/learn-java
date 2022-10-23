import java.util.Scanner;


public class Soal3_Deret_Angka {
    public static void main(String[] args) {
        int BanyakLoop = 4;

        int NilaiAwal = 3 ;
        
        for (int i = 0; i < 1; i++) {
            System.out.print(NilaiAwal+" ");
        }
        for (int i = 1; i < BanyakLoop; i++) {
                int Pangkat = NilaiAwal+NilaiAwal;
                System.out.print((NilaiAwal+Pangkat)+" ");
                NilaiAwal += Pangkat;
        }
        

    }

}
