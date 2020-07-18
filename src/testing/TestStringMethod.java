package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utility.StringMethod;

public class TestStringMethod {
	StringMethod sm = new StringMethod();

	@Test
	public void testSetInputsMethod() {
		sm.setInput("Java");
		assertEquals("Java", sm.getInput());
		try {
			sm.setInput(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testLowerMethod() {
		assertEquals("hai", sm.lowerCase("HaI"));
		assertEquals("1234", sm.lowerCase("1234"));
		assertEquals("hai&hello", sm.lowerCase("hai&HELLO"));
		assertEquals("welcome", sm.lowerCase("welcome"));
		try {
			sm.lowerCase("");
		} catch (IllegalArgumentException e) {
			System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testUpperMethod() {
		assertEquals("HAI", sm.upperCase("HAI"));
		assertEquals("1234", sm.upperCase("1234"));
		assertEquals("HAI&HELLO", sm.upperCase("hai&HELLO"));
		assertEquals("WELCOME", sm.upperCase("welcome"));
		try {
			sm.upperCase("");
		} catch (IllegalArgumentException e) {
			System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testFirstCharacterMethod() {
		assertEquals("1", sm.firstChar("1.hai"));
		assertEquals("@", sm.firstChar("@hai"));
		assertEquals(" ", sm.firstChar(" hai"));
		assertEquals("h", sm.firstChar("hai"));
		try {
			sm.firstChar(" ");
		} catch (IllegalArgumentException e) {
			System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testLengthMethod() {
		assertEquals("0", sm.length(""));
		assertEquals("15", sm.length(" WelcomeToJava "));
		assertEquals("4", sm.length("123 "));
		assertEquals("1", sm.length("."));
		try {
			sm.length("");
		} catch (IllegalArgumentException e) {
			System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testTrimMethod() {
		assertEquals("Java", sm.trimStr(" Java "));
		assertEquals("Ja va", sm.trimStr("Ja va "));
		assertEquals("Java", sm.trimStr("  Java  "));
		try {
			sm.trimStr("");
		} catch (IllegalArgumentException e) {
			System.out.println("No input is given");
			e.printStackTrace();
		}
	}
}
