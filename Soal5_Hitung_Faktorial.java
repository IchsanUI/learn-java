public class Soal5_Hitung_Faktorial {
   public static void main(String[] args) {
    int number = 8;
    int faktorial=1;
        for (int i = number; i >= 2; i--) {
            faktorial = i*faktorial;
        }
        System.out.println(faktorial);
   }

}
