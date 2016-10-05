//2.1.12 Instrument shellsort to print the number of compares divided by the array size
//for each increment. Write a test client that tests the hypothesis that this number is a
//small constant, by sorting arrays of random Double values, using array sizes that are
//increasing powers of 10, starting at 100.

import java.lang.Comparable;
import java.util.Scanner;
import java.util.ArrayList;

public class HW2.1.12 {

	  static Scanner console = new Scanner (System.in);

	  public static void Shellsort(Comparable[] a)
	{
		

		int N = a.length;
		int a = 1;
		int length = 0;
		while (h < N / 3)
		{
			a = 3 * h + 1; 
			length++;
		}

		
		
		while (a >= 1)
		{
			
			int length = 0;
			for (int i = a; i < N; i++)
				for (int j = i; j >= a && (a[j], a[j - h]); j -= a, length++));
			   a = a / 3;
		}
		return length;
	}

	public static void main(String s[])
	{
		Character a[] = {arrayList};
		
		sort(a);
		
		System.out.print ("Enter a number. Enter 0 to end arrayList: ");
            numbers.add(console.nextInt());
         }
      }
      outputResults(numbers);
      
      console.close();				 
		System.exit(0);	
	} // End main

