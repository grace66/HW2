# HW2

//2.1.1  Show, in the style of the example trace with Algorithm 2.1,how selection sort sorts the arraym E A S Y Q U E S T I O N.

public class HW2 {

	
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
         
        int[] array1 = {E, A, S, Y, Q, U, E, S, T, I, O, N};
        int[] array2 = SelectionSort(array1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
    }        



//2.1.5 For each of the two conditions in the inner for loop in insertion sort (Algorithm2.2), 
//describe an array of N items where that condition is always false when the loop terminates.

  public class InsertionSort{
  
    public static void main(String a[]){
    
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    
    int i,j,temp;
    
    for(i=1;i<a.length;i++){
            j = i-1; 
            
    while(i>0 && a[j] > a[i]){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            }
        }
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);   
        }
    }
}         
      
// 2.1.9 Show, in the style of the example trace with Algorithm 2.3, how shellsort sorts 
//the array E A S Y S H E L L S O R T Q U E S T I O N.

      public class Shellsort() {
      int[] theArray = {E, A, S, Y, Q, U, E, S, T, I, O, N};

            int i=0; (i<theArray.length; i++);

            int temp = theArray[i]; 
            int j;              

            for(j=i; j>h-1 && theArray[j-h] >= temp; j=j-h){
                a[j] = a[j-h];                  
            }
            a[j] = temp;
        }
        }
    
    public static void main(String[] args) {
 
    int [] array = {E, A, S, Y, Q, U, E, S, T, I, O, N}; 
    System.out.println("Before: " + Arrays.toString(array));
    sort(array);
    System.out.println("After:  " + Arrays.toString(array));
 
  }
}
