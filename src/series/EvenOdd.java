package series;

import javax.swing.JOptionPane;

public class EvenOdd {

	public static void main(String[] args) {
		
		while(true)
		{
			try
			{
				int option = Integer.parseInt(JOptionPane.showInputDialog("Select an option (Number)"
						+ " \n 1: Check if an entered number if even or odd"
						+ "\n 2: Display entire series of even and odd numbers"
						+ "\n 3: Exit"));
				
				if(option==1)
				{
					evenOdd();
				}
				else if(option==2)
				{
					displayEvenSeries();
					displayOddSeries();
				}
				else
				{
					break;
				}
			}catch(NumberFormatException ne)
			{
				JOptionPane.showMessageDialog(null, "Number input only", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	//function to check if entered number is even or odd
	private static void evenOdd()
	{
		while(true)
		{
			try {
				int conf;
				int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
				if(num%2==0)
				{
					JOptionPane.showMessageDialog(null, num+" is an even number","EVEN NUMBER",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, num+" is an odd number","EVEN NUMBER",JOptionPane.INFORMATION_MESSAGE);
				}
				
				conf = JOptionPane.showConfirmDialog(null, "Do you want to check next number?","Contiue?",JOptionPane.YES_NO_OPTION);
				if(conf==0)
				{
					continue;
				}
				else
				{
					break;
				}
				
			}catch(NumberFormatException ne)
			{
				JOptionPane.showMessageDialog(null, "Number input only", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	//Function to display even / odd series on console.
	private static void displayEvenSeries()
	{
		try {
			int limit = Integer.parseInt(JOptionPane.showInputDialog("Enter a limit to the even number series"));
			JOptionPane.showMessageDialog(null, "Check console for series output", "Console Output", JOptionPane.INFORMATION_MESSAGE);
			System.out.println("");
			System.out.println("All even numbers from 0 till "+ limit + " mentioned below");
			for(int i=0; i<=limit; i++)
			{
				if(i%2==0)
				{
					System.out.print(i + " ");
				}
			}
		}catch(NumberFormatException ne)
		{
			JOptionPane.showMessageDialog(null, "Number input only", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private static void displayOddSeries()
	{
		try {
			int limit = Integer.parseInt(JOptionPane.showInputDialog("Enter a limit to the odd number series"));
			JOptionPane.showMessageDialog(null, "Check console for series output", "Console Output", JOptionPane.INFORMATION_MESSAGE);
			System.out.println("");
			System.out.println("All odd numbers from 0 till "+ limit + " mentioned below");
			for(int i=0; i<=limit; i++)
			{
				if(i%2!=0)
				{
					System.out.print(i + " ");
				}
			}
		}catch(NumberFormatException ne)
		{
			JOptionPane.showMessageDialog(null, "Number input only", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
}
