package edu.pitt.cs;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class SquareTest {

	/**
	 * Write an integration test for setSquared.
	 * 
	 * <pre>
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 * </pre>
	 */
	@Test
	public void testSetSquaredIntegration() {
		// TODO: Fill in!
		Square square = new Square();
		Number number = new Number();
		square.setSquared(number, 3);
		assertEquals(9, square);
	}

	/**
	 * Write a unit test for setSquared.
	 * 
	 * <pre>
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 * </pre>
	 */
	@Test
	public void testSetSquaredUnit() {
		// TODO: Fill in!
		Square square = new Square(); 
		Number mockNumber = Mockito.mock(Number.class);
		square.setSquared(mockNumber, 3);
		when(mockNumber.getVal()).thenReturn(9);
		assertEquals(mockNumber, 9);
		verify(mockNumber.getVal());
	}
}
