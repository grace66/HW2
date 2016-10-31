///*****HW2**********

//2.1.1  Show, in the style of the example trace with Algorithm 2.1
//how selection sort sorts the array E A S Y Q U E S T I O N.


import java.util.Comparator;
import java.util.*;
	
public class SelectionSort {

    public static int[] SelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int letters = arr[index];  
            arr[index] = arr[i];
            arr[i] = letters;
        }
        return arr;
    }
     
    public static void main(String a[]){
         
        int[] array1 = {'E', 'A', 'S', 'Y', 'Q', 'U', 'E', 'S', 'T', 'I', 'O', 'N'};
        int[] array2 = SelectionSort(array1);
        for (int b : array2)
         System.out.print((char)b + " ");    
    
    }
}