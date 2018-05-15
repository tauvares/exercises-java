import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UpperCaseTest {

	@Test
	public void whenStringIsEmptyThenReturnEmptyMessage() {	    
	    assertEquals("The String should have at least one letter", UpperCase.upperCase(""));
	}
	
	@Test
	public void whenALetterIsEnteredThenReturnItsUpperCaseVersion() {	    
		assertEquals("A", UpperCase.upperCase("a"));
		assertEquals("B", UpperCase.upperCase("b"));
	}
	
	@Test
	public void whenALowerCaseStringIsEnteredThenReturnItsUpperCaseVersion() {	    
		assertEquals("ABC", UpperCase.upperCase("abc"));
		assertEquals("BETTERTHANBEFORE", UpperCase.upperCase("betterthanbefore"));
	}
	
	@Test
	public void whenAStringIsWithSpacesThenIgnoreTheCharacter() {	    
		assertEquals("ABC IS ALREADY CHECKED", UpperCase.upperCase("abc is already checked"));
		assertEquals("BETTER THAN BEFORE", UpperCase.upperCase("better than before"));
		//assertEquals("HOW BETTER IS THIS CODE", Exercises.upperCase("How Better Is This Code"));
	}
	
	@Test
	public void whenAStringIsUpperCaseThenIgnoreTheString() {	    
		assertEquals("ABC IS ALREADY CHECKED", UpperCase.upperCase("Abc Is Already Checked"));
		assertEquals("BETTER THAN BEFORE", UpperCase.upperCase("Better Than Before"));
		assertEquals("HOW BETTER IS THIS CODE", UpperCase.upperCase("How Better Is This Code"));
	}

}
