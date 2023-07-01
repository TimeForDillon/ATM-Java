package ATM;
/**
 * An ATM that is PIN protected.
 */
public class ATM
{
	private static final int pin = 1234;
	private boolean lockedOut;
	private boolean hasAccess;
	private int invalidPin;
	
	/**
	 * Constructs an ATM that is PIN protected.
	 */
	public ATM()
	{
		lockedOut = false;
		hasAccess = false;
		invalidPin = 0;
	}
	
	/**
	 * Checks to see if entered pin matches.
	 * @param pin user entered pin.
	 * @return true if pin is correct.
	 */
	public boolean enterPin(int pin)
	{
		if(pin == ATM.pin)
		{
			hasAccess = true;
		}
		else
		{
			invalidPin++;
			if(invalidPin>=3) lockedOut = true;
			hasAccess = false;
		}
		return hasAccess;
	}
	
	/**
	 * Checks to see if user is locked out.
	 * @return true if locked out.
	 */
	public boolean isLockedOut()
	{
		return this.lockedOut;
	}
	
	/**
	 * Checks to see if user entered correct pin.
	 * @return true if correct pin was entered.
	 */
	public boolean hasAccess()
	{
		return this.hasAccess;
	}
}
