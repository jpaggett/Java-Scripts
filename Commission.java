import java.util.Scanner;
public class Commission
{
	public static void main(String arg[])	
	{
		double sales = 0.0;
		double payout = 0.0;
		double commission = 0.0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Sales amount: ");
		sales = keyboard.nextDouble();
		keyboard.nextLine();	// remove extra CR-LF
		
		if (sales > 50000)
			commission = 0.05;
		else if (sales > 40000)
			commission = 0.04;
		else if (sales > 30000)
			commission = 0.03;
		else if (sales > 20000)
			commission = 0.02;
		else if (sales > 10000)
			commission = 0.015;
		else if (sales >= 5000)
			commission = 0.01;
		else
			commission = 0;
		
		if (sales > 60000)
			payout = sales * commission + 500;
		else
			payout = sales * commission;

		System.out.println("Commission amount = " + payout);
		
	}
}