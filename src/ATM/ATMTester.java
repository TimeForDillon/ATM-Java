package ATM;
import java.util.Scanner;

/**
 * A class that tests the ATM class.
 */
public class ATMTester
{
	public static void main(String[] args)
	{
		ATM myATM = new ATM();
		Scanner in = new Scanner(System.in);
		int input = 0;
		String inp;
		
		do
		{
			System.out.print("Please enter your pin: ");
			inp = in.next();
			if(inp.contains("[a-zA-Z]+") == false)
			{
				try {
					   input = Integer.parseInt(inp);
					}
					catch (NumberFormatException e)
					{
						System.out.println("Please enter numbers only.");
						input = 0;
					}
			}
			else
				input = 0;
			
			if(input != 0)
			{
				if(!myATM.enterPin(input))
					System.out.println("Your PIN is incorrect.");
				else
					break;
			}
		}while(!myATM.isLockedOut());
		
		if(myATM.hasAccess()) System.out.println("Your PIN is correct.");
		if(myATM.isLockedOut()) System.out.println("Your bank card is blocked.");
		in.close();
	}
}
