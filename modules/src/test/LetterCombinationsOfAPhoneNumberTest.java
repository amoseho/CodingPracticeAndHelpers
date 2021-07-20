package src.test;

import org.junit.jupiter.api.Test;
import src.examSources.LetterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfAPhoneNumberTest
{
    @Test
    void leetcode23Case()
    {
        String input = "23";
        List<String> output = LetterCombinationsOfAPhoneNumber.letterCombinations(input);
        List<String> expectedOutput = Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf");
        assertEquals(output, expectedOutput);
    }

    @Test
    void leetcodeEmptyStringCase()
    {
        String input = "";
        List<String> output = LetterCombinationsOfAPhoneNumber.letterCombinations(input);
        List<String> expectedOutput = new ArrayList<>();
        assertEquals(output, expectedOutput);
    }

    @Test
    void leetcode2Case()
    {
        String input = "2";
        List<String> output = LetterCombinationsOfAPhoneNumber.letterCombinations(input);
        List<String> expectedOutput = Arrays.asList("a","b","c");
        assertEquals(output, expectedOutput);
    }
}