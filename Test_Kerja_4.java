import java.util.Arrays;

/**
 * Test_Kerja_4
 */
public class Test_Kerja_4 {

    public static void main(String[] args) {
        int[] arrayA = {1,2,7,4};
        int[] arrayB = {1,2,3};
        String[] hasil = new String[arrayA.length];

        // if (arrayA.length > arrayB.length) {
        //     for (int i = 0; i < arrayA.length-arrayB.length; i++) {
        //         for (int j = 0; j < arr.length; j++) {
        //             newArr[j + 1] = arr[j];
        //         }
        //     }
        // }

        for (int i = 0; i < arrayA.length; i++) {
            if(i< arrayB.length){
                    if(arrayA[i]+arrayB[i] >= 10){
                        hasil[i]= "*";
                    }else{
                        hasil[i] =""+(arrayA[i]+arrayB[i]);
                    };
            }else{
                hasil[i]= "*";
            }
        }

        System.out.println(Arrays.toString(hasil));
    }
}



// let arrayA = [1, 2, 3, 4];
// let arrayB = [7, 8];

// if (arrayA.length > arrayB.length) {
//   for (let i = 0; i < arrayA.length - arrayB.length + 1; i++) {
//     arrayB.unshift(0);
//   }
// }

// for (let i = 0; i < arrayA.length; i++) {
//   let tot = arrayA[i] + arrayB[i];
//   if (tot > 9) {
//     arrayA[i] = '*';
//   } else {
//     arrayA[i] = tot;
//   }
// }

// console.log(arrayA);