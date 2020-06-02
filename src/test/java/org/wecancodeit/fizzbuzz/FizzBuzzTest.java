package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
	@Test
	public void shouldInstantiate() {
		FizzBuzz underTest = new FizzBuzz();
	
}
	
	@Test
	public void shouldConvertIntegerIntoString() {
		FizzBuzzConverter fizzbuzz = new FizzBuzzConverter();
		assertEquals("1", fizzbuzz.convert(1));
	}
}
