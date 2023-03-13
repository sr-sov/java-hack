package test;

import static org.junit.jupiter.api.Assertions.*;

import javahack.JUnit;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void twoPlusTwoShouldEqualFour() {
		//var is implicit and works since Java version 10
		var junit = new JUnit();
		assertEquals(4,junit.add(2, 2));
	}

	@Test
	void threePlusSevenShouldEqualTen() {
		JUnit junit = new JUnit();
		assertTrue(junit.add(3, 7) == 10);
	}

}
