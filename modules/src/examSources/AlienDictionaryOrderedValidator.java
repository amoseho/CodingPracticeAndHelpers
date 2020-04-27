package src.examSources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Leetcode passed.
/*
	In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order.
	The order of the alphabet is some permutation of lowercase letters.

	Given a sequence of words written in the alien language, and the order of the alphabet, return true
	if and only if the given words are sorted lexicographicaly in this alien language.



	Example 1:

	Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
	Output: true
	Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
	Example 2:

	Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
	Output: false
	Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
	Example 3:

	Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
	Output: false
	Explanation: The first three characters "app" match, and the second string is shorter (in size.)
	According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character
	which is less than any other character (More info).
 */
public class AlienDictionaryOrderedValidator
{
	public static boolean isAlienDictionaryOrderedIntegerListApproach(List<String> dictionary, String languageOrder)
	{
		if(dictionary == null || dictionary.size() <= 1)
		{
			return true;
		}

		Map<String, Integer> letterValueMapping = stringToOrderedHashMap(languageOrder);
		List<List<Integer>> dictionaryAsValues = convertListOfStringToListOfListOfIntGivenMappings(dictionary, letterValueMapping);
		dictionaryAsValues = assertEveryIntegerAsAListIsEqualInSize(dictionaryAsValues);
		return isListOfIntegerListsOrdered(dictionaryAsValues);
	}

	private static Map<String, Integer> stringToOrderedHashMap(String languageOrder)
	{
		Map<String, Integer> letterValueMapping = new HashMap<>();

		char[] languageOrderAsArray = languageOrder.toCharArray();
		for(int value = 1; value <= languageOrderAsArray.length; value++)
		{
			String letter = String.valueOf(languageOrderAsArray[value-1]);
			letterValueMapping.put(letter, value);
		}

		return letterValueMapping;
	}

	private static List<List<Integer>> convertListOfStringToListOfListOfIntGivenMappings(List<String> strings, Map<String, Integer> letterValueMapping)
	{
		List<List<Integer>> integers = new ArrayList<>();

		for(String s : strings)
		{
			List<Integer> thisWordBrokenIntoNumbers = new ArrayList<>();
			for(int i = 0; i < s.length(); i++)
			{
				String currentLetter = String.valueOf(s.charAt(i));
				Integer valueOfCurrentLetter = letterValueMapping.get(currentLetter);
				thisWordBrokenIntoNumbers.add(valueOfCurrentLetter);
			}
			integers.add(thisWordBrokenIntoNumbers);
		}

		return integers;
	}

	private static List<List<Integer>> assertEveryIntegerAsAListIsEqualInSize(List<List<Integer>> twoDIntList)
	{
		List<List<Integer>> returnList = new ArrayList<>();
		returnList.addAll(twoDIntList);

		Integer maxSize = 0;
		for(List<Integer> list : returnList)
		{
			if(list.size() > maxSize)
			{
				maxSize = list.size();
			}
		}

		for(List<Integer> list : returnList)
		{
			while(list.size() < maxSize)
			{
				list.add(0);
			}
		}

		return returnList;
	}

	private static boolean isListOfIntegerListsOrdered(List<List<Integer>> inputMap)
	{
		for(int i = 0; i < inputMap.size()-1; i++)
		{
			List<Integer> leftList = inputMap.get(i);
			List<Integer> rightList = inputMap.get(i+1);
			if(!integerListsInOrder(leftList, rightList))
			{
				return false;
			}
		}

		return true;
	}

	//Both lists guaranteed to be same size
	private static boolean integerListsInOrder(List<Integer> leftList, List<Integer> rightList)
	{
		for(int i = 0; i < leftList.size(); i++)
		{
			Integer leftNumber = leftList.get(i);
			Integer rightNumber = rightList.get(i);
			if(leftNumber > rightNumber)
			{
				return false;
			}
			else
			if(leftNumber < rightNumber)
			{
				return true;
			}
			//else it's a tie and we don't care
		}

		//in case of tie, it's fine
		return true;
	}
}
