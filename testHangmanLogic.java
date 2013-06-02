/**********
 * I need to set up tests for the following methods
 * public HangmanLogic(String keyPhrase, int numberOfGuesses) throws InvalidConfigurationException
 * public String getKnownKeyPhrase()
 * public String guessCharacter(char guess)
 * *********/


package a8testing;

import org.junit.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class testHangmanLogic {
	char t = 't';
	private static String keyPhrase = "test";
	private int numberOfGuesses = 5;
	
	@Rule
	public ExpectedException exception = ExpectedException.none();


	@Test
	public void testHangmanLogicInvalidPhrase() throws InvalidConfigurationException  {
		HangmanLogic hglt = new HangmanLogic(" ", 10);
	    exception.expect(InvalidConfigurationException.class);
	    
	}
	
	
	@Test
	public void testGuessCharacter() throws InvalidInputException, AlreadyGuessedException, InvalidConfigurationException {
		HangmanLogic hggc = new HangmanLogic(keyPhrase, 10);
		Assert.assertEquals(true, hggc.guessCharacter(t));
	}
	

	 @Test
	  public void doStuffThrowsIndexOutOfBoundsException() throws InvalidConfigurationException, InvalidInputException, AlreadyGuessedException {
		HangmanLogic hgkp = new HangmanLogic(keyPhrase, 10);

	    exception.expect(InvalidInputException.class);
		Assert.assertEquals(true, hgkp.guessCharacter('8'));
	 }
	 
}
