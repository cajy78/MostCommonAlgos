package arrays;

import javax.swing.JOptionPane;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr;
		int size;
		try{
			size = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the size of the array"));
			arr = new int[size];
			fillArray(arr);
		}
		catch(NumberFormatException ne)
		{
			JOptionPane.showMessageDialog(null, "Please enter a number", "Number Format Error", JOptionPane.ERROR_MESSAGE);}
	}
	
	//function to fill the array
	private static void fillArray(int[] arr)
	{
		int ctr = 0;
		for(int i = 0; i < arr.length; i++)
		{
			try
			{
				int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number to be added into the array"));
				arr[i] = num;
				ctr++;
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Please enter a number", "Number Format Error", JOptionPane.ERROR_MESSAGE);
				break;
			}
		}
		if(ctr==arr.length)
		{
			JOptionPane.showMessageDialog(null, "Check console for output", "Numbers added into array", JOptionPane.DEFAULT_OPTION);
			System.out.println("Array contains: ");
			displayArray(arr);
			searchValue(arr);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Error occured in input, program will now exit", "Number Format Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	//function to display array.
	private static void displayArray(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[arr.length - 1]+".");
	}
	
	//function to search.
	private static void searchValue(int[] arr)
	{
		int num, countofElements = 0;
		boolean found = false;
		while(true)
		{
			try
			{
				num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a value to be searched"));
				for(int i = 0; i < arr.length; i++)
				{
					if(num == arr[i])
					{
						found = true;
						countofElements++;
					}
				}
				if(found)
				{
					JOptionPane.showMessageDialog(null, "Entered value exists in the array and has been entered "+countofElements+" times", "Number Found", JOptionPane.PLAIN_MESSAGE);
					countofElements=0;
					int cont = JOptionPane.showConfirmDialog(null, "Do you wish to find next element?", "Continue?", JOptionPane.YES_NO_OPTION);
					if(cont==0)
					{
						found = false;
						continue;
					}
					else
					{
						break;
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Entered value does not exist in the array","Number Not Found",JOptionPane.WARNING_MESSAGE);
					int cont = JOptionPane.showConfirmDialog(null, "Do you wish to find next element?", "Continue?", JOptionPane.YES_NO_OPTION);
					if(cont==0)
					{
						found = false;
						continue;
					}
					else
					{
						break;
					}
				}
			}
			catch(NumberFormatException ne)
			{
				JOptionPane.showMessageDialog(null, "Please enter a number", "Number Format Error", JOptionPane.ERROR_MESSAGE);
				break;
			}
			catch(Exception e)
			{
				break;
			}
		}
	}
}
