public class If_Nested {
    public static void main(String[] args) {
        int a=5;

        if (a==5) {
            System.out.println("Sukses Langsung");
        }else{
            if (a==6) {
                System.out.println("Sukses 1 Tingkat");
            }else{
                if (a==7) {
                    System.out.println("Sukses 2 Tingkat");
                }else{
                    System.out.println("Sukses 3 Tingkat");
                }
            }
        }
        System.out.println("Program Selesai");
    }
}
