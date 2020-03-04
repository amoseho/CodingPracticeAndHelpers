package src.test;

import org.junit.jupiter.api.Test;
import src.examSources.PrimeNumberValidator;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberValidatorTest
{

	@Test
	void isPrimeBasic()
	{
		assert PrimeNumberValidator.isPrime(17);
		assert !PrimeNumberValidator.isPrime(16);
	}
}