package src.test;

import org.junit.jupiter.api.Test;
import src.examSources.PalindromableValidator;

import static org.junit.jupiter.api.Assertions.*;

class PalindromableValidatorTest
{
	@Test
	void basicHappyCase()
	{
		assert PalindromableValidator.isPalindromable("aabb") == true;
	}

	@Test
	void complexHappyCase()
	{
		assert PalindromableValidator.isPalindromable("dadazcbxcbaza") == true;
	}

	@Test
	void unhappyCase()
	{
		assert PalindromableValidator.isPalindromable("abbc") == false;
	}
}