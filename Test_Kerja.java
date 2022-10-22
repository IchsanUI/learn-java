/**
 * coba
 */
public class Test_Kerja {

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

//VERSI JAVASCRIPT
// let h2 = document.querySelector('h2');
// let str = 'Psi123 hsj @1123*!j123 01123A';
// let outStr = str.replace(/\D/g, '');
// let num = +outStr;
// console.log(num);
// let sum = 0;

// while (num > 0) {
//   let r = num % 10;
//   sum = sum + r;
//   num = num / 10;
// }
// let ssum = Math.round(sum);
// console.log(ssum - 1);