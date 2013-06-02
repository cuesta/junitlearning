package a8testing;

/**  @Author Joseph Jess
 *	 @version 0.1, 01/29/2013
 *   This is an exception intended for being thrown when invalid input is used to create a HangmanLogic object
 **/
public class InvalidConfigurationException extends Exception 
{	
    public InvalidConfigurationException(String message)
    {
		super(message);
    } 
}
