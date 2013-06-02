/*************************
 * Program: assignment8.java
 * Author: Carlos Cuesta - carloscuesta@gmail.com
 * Description: Assignment 8
 * Input: Tests methods from HangmanLogic
 * Output: Runs JUnit tests on methods HangmanLogic. Outputs the results 
 **************************/

package a8testing;

import java.util.ArrayList;

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
	private static ArrayList<Character> guessedCharacters;


	
	@Rule
	public ExpectedException exception = ExpectedException.none();

	//Tests HangmanLogic() to see what happens when a proper set of values 
	//is passed in the constructor 
	@Test
	public void testHangmanLogicCorrectIntialization() throws InvalidConfigurationException {
		exception.expect(InvalidConfigurationException.class);	
		HangmanLogic hg = new HangmanLogic(keyPhrase, 10);
	}

	//Tests HangmanLogic() to see what happens when only a space is passed instead of a word 

	@Test
	public void testHangmanLogicInvalidPhrase() throws InvalidConfigurationException {
		exception.expect(InvalidConfigurationException.class);	
		HangmanLogic hg = new HangmanLogic(" ", 10);
	}
	
	//Tests HangmanLogic() to see what happens when a negative #of guesses is passed

	@Test
	public void testHangmanLogicInvalidInt() throws InvalidConfigurationException {
		exception.expect(InvalidConfigurationException.class);	
		HangmanLogic hg = new HangmanLogic(keyPhrase, -10);
	}
	
	//Tests guessCharacter() to see what happens when a proper character is passed 

	@Test
	public void testGuessCharacter() throws InvalidInputException, AlreadyGuessedException, InvalidConfigurationException {
		HangmanLogic hg = new HangmanLogic(keyPhrase, 10);
		Assert.assertEquals(true, hg.guessCharacter(t));
	}
	
	//Tests guessCharacter() to see what happens when an invalid character is passed 

	 @Test
	  public void testGuessCharacterException() throws InvalidConfigurationException, InvalidInputException, AlreadyGuessedException {
		HangmanLogic hg = new HangmanLogic(keyPhrase, 10);
	    exception.expect(InvalidInputException.class);
		Assert.assertEquals(true, hg.guessCharacter('8'));
	 }
	 
	 //Tests getKknownKeyPhrase() to see if the method works properly at the beginning with no guesses
	 @Test
	 public void testgetKnownKeyPhrase1() throws InvalidConfigurationException, InvalidInputException, AlreadyGuessedException  {
	 HangmanLogic hg = new HangmanLogic(keyPhrase, 10);
	 Assert.assertEquals("----", hg.getKnownKeyPhrase());
	 }
	 
	 //Tests getKknownKeyPhrase() to see if the method works properly with a right guess 

	 @Test
	 public void testgetKnownKeyPhrase2() throws InvalidConfigurationException, InvalidInputException, AlreadyGuessedException  {
	 HangmanLogic hg = new HangmanLogic(keyPhrase, 10);
	 hg.guessCharacter(t);
	 Assert.assertEquals("t--t", hg.getKnownKeyPhrase());
	 }
	 
	 //Tests getKknownKeyPhrase() to see if the method works properly with a wrong guess 
	 @Test
	 public void testgetKnownKeyPhrase3() throws InvalidConfigurationException, InvalidInputException, AlreadyGuessedException  {
	 HangmanLogic hg = new HangmanLogic(keyPhrase, 10);
	 hg.guessCharacter('n');
	 Assert.assertEquals("----", hg.getKnownKeyPhrase());
	 }
	 
	 
}
