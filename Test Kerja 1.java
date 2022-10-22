/**
 * coba
 */
public class coba {

    public static void main(String[] args) {
        long r,sum =0;
        String str1 ="01861Hjja8s227aJja08K;";
        String charr = str1.replaceAll("[^0-9]","");
        Long num = Long.parseLong(charr);
        System.out.println(charr);

        while(num>0) {
            r=num%10;
            // System.out.print(r);
            // System.out.print(" ");

            sum = sum+r; 
            // System.out.print(sum);
            // System.out.print(" ");

            num=num/10;
            // System.out.println(num);
            // System.out.print(" ");
        }

        System.out.println(sum);

    }
}