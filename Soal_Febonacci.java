import java.util.Scanner;

public class Soal_Febonacci {
    public static void main(String[] args) {
        int fn,fn_1,fn_2,n;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Fibonacci ke -:");
        n = inputUser.nextInt();
        fn_2=0;
        fn_1=1;
        fn =0 ;
        
        for (int i = 0; i <= n; i++) {
            System.out.print(" "+fn);
            fn = fn_1+fn_2;
            fn_1= fn_2;
            fn_2 = fn;
        }
    }
}
