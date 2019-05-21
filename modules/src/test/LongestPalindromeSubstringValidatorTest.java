package src.test;

import org.junit.jupiter.api.Test;
import src.examSources.FruitCollectionValidator;
import src.examSources.LongestPalindromeSubstringValidator;

import java.util.ArrayList;
import java.util.List;

class LongestPalindromeSubstringValidatorTest
{
	@Test
	void defaultHappyCase()
	{
		//Input: "babad"
		//Output: "bab"
		String s = "babad";
		String output = LongestPalindromeSubstringValidator.getLongestPalindromeSubstring(s);
		System.out.println(output);
		assert output.equals("bab");
	}

	@Test
	void testDoubles()
	{
		String s = "cbbd";
		String output = LongestPalindromeSubstringValidator.getLongestPalindromeSubstring(s);
		System.out.println(output);
		assert output.equals("bb");
	}

	@Test
	void testOddCase()
	{
		String s = "aaaabaaa";
		String output = LongestPalindromeSubstringValidator.getLongestPalindromeSubstring(s);
		System.out.println(output);
		assert output.equals("aaabaaa");
	}

	@Test
	void timeLimitExceeded()
	{
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String output = LongestPalindromeSubstringValidator.getLongestPalindromeSubstring(s);
		System.out.println(output);
	}
}