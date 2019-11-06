package src.test;

import org.junit.jupiter.api.Test;
import src.examSources.TwoStringIsRotationOfOtherValidator;

import static org.junit.jupiter.api.Assertions.*;

class TwoStringIsRotationOfOtherValidatorTest
{

	@Test
	void stringIsRotationOfOtherSimplePositive()
	{
		String one = "waterbottle";
		String two = "terbottlewa";

		assert TwoStringIsRotationOfOtherValidator.stringIsRotationOfOther(one, two) == true;
	}

	@Test
	void stringIsRotationOfOtherTrick()
	{
		String one = "wwaterbottle";
		String two = "waterbottlew";

		assert TwoStringIsRotationOfOtherValidator.stringIsRotationOfOther(one, two) == true;
	}

	@Test
	void stringIsRotationOfOtherSimpleNegative()
	{
		String one = "waterbottle";
		String two = "NotAtAll";

		assert TwoStringIsRotationOfOtherValidator.stringIsRotationOfOther(one, two) == false;
	}
}