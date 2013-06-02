package a8testing;

import org.junit.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testHangmanLogic {
	char t = 't';
	private static String keyPhrase = "test";
	private int numberOfGuesses = 5;



	@Test
	public void testGuessCharacter() throws InvalidInputException, AlreadyGuessedException {
		Assert.assertEquals(false, HangmanLogic.guessCharacter(t));
	}


}