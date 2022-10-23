import java.util.Scanner;

public class Soal1_Deret_Hitung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Banyak Deret :" );
        int Deret =  input.nextInt();

        int Angka =3;
        for (int i = 1; i < Deret +1 ; i++) {
            System.out.println(Angka+" ");
            Angka+= 3;
        }

        
    }

}
