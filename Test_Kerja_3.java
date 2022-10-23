import java.util.*;


public class Test_Kerja_3 {
    public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        
        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++){
            set.add(a[i]);
        }
        
 
        // Print the elements of LinkedHashSet
        System.out.print(set);
    }
 
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3,4,5,6,7,8};
        int[] array2 = {1,3,5,7,6};
        
        int[] HasilArray = new int[array1.length+array2.length];
        
        for (int i = 0; i < array1.length; i++) {
            HasilArray[i]= array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
                HasilArray[i+array1.length] = array2[i];
        }

        removeDuplicates(HasilArray);
        }
    }

