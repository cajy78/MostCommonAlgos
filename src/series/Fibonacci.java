package series;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		
		try
		{
			int limit = Integer.parseInt(JOptionPane.showInputDialog("Enter the limit for the Fibonacci series"));
			JOptionPane.showMessageDialog(null, "Check console for output", "Series displayed on console", JOptionPane.INFORMATION_MESSAGE);
			displaySeries(limit);
		}catch(NumberFormatException ne)
		{
			JOptionPane.showMessageDialog(null, "Only numbers to be entered", "Number Format Exception", JOptionPane.ERROR_MESSAGE);
		}
	}

	private static void displaySeries(int limit)
	{
		int num = limit;
		int element1 = 0, element2 = 1, next = 0;
		System.out.println("");
		System.out.println("Fibonacci series:");
		System.out.println("");
		System.out.print(element1 + " " + element2 + " ");
		for (int i = 1 ; i < num ; i++ )
		{
			if ( i <= 1 )
				next = i;
		    else{
		    	next = element1 + element2;
		    	element1 = element2;
		    	element2 = next;
		    }
			System.out.print(element2 + element1 + " ");
		}
	}
}
