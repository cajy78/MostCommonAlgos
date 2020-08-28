package arrays;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		//Array input
		System.out.println("ARRAY SORTING PROGRAM");
		System.out.println("Enter your desired size of the array: ");
		int size = Integer.parseInt(s.nextLine());
		int[] arr = new int[size];
		System.out.println("Enter " + size + " numbers to be added into the array in succession");
		System.out.println("Use the enter/return key to enter each number");
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = Integer.parseInt(s.nextLine());
		}
		
		//standard array display:
		System.out.println("");
		System.out.println("Unsorted array list as entered:");
		displayArray(arr);
		
		//sorting using temp variable and display
		System.out.println("");
		System.out.println("");
		System.out.println("Sorted array:");
		System.out.println("");
		sortAscending(arr);
		System.out.println("");
		sortDescending(arr);
		
		//Close scanner to avoid resource leak.
		s.close();
	}
	
	private static void displayArray(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[arr.length-1]+".");
	}
	
	private static void sortAscending(int[] arr)
	{
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Ascending Order:");
		displayArray(arr);
	}
	
	private static void sortDescending(int[] arr)
	{
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Descending Order:");
		displayArray(arr);
	}
}
