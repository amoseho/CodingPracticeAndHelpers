package src;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CommonHelperMethods
{
	/***
	 *     +-+-+-+-+-+-+-+-+-+-+-+-+ +-+-+ +-+-+-+ +-+-+-+-+-+
	 *     |I|n|i|t|i|a|l|i|z|e|r|.| |D|o| |N|o|t| |A|l|t|e|r|
	 *     +-+-+-+-+-+-+-+-+-+-+-+-+ +-+-+ +-+-+-+ +-+-+-+-+-+
	 */
	private CommonHelperMethods(){}

	private static class SingletonHelper
	{
		private static final CommonHelperMethods INSTANCE = new CommonHelperMethods();
	}

	public static CommonHelperMethods getInstance()
	{
		return SingletonHelper.INSTANCE;
	}
	/***
	 *     +-+-+-+-+-+-+-+-+-+-+-+-+ +-+-+ +-+-+-+ +-+-+-+-+-+
	 *     |I|n|i|t|i|a|l|i|z|e|r|.| |D|o| |N|o|t| |A|l|t|e|r|
	 *     +-+-+-+-+-+-+-+-+-+-+-+-+ +-+-+ +-+-+-+ +-+-+-+-+-+
	 */

	/***
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 */

	public static List<String> returnStringAsList(String input)
	{
		List<String> output = new ArrayList<>();

		for(int i = 0; i < input.length(); i++)
		{
			output.add(String.valueOf(input.charAt(i)));
		}
		return output;
	}

	public static String reverseString(String s)
	{
		String reversedString = "";
		//reverse the string
		for (int i = s.length()-1; i >= 0; i--)
		{
			char c = s.charAt(i);
			//Process char
			reversedString += c;
		}
		return reversedString;
	}

	public static String integerToBinary(Integer input)
	{
		Integer num = input;
		String str = "";
		for(int a = 0; a < 8; a++)
		{
			if(num % 2 == 1)
			{
				str = "1" + str;
			}
			if(num % 2 == 0)
			{
				str = "0" + str;
			}
			num = num / 2;
		}
		return str;
	}

	public static Integer summationOfSquares(List<Integer> numbers)
	{
		Integer sum = 0;
		for(Integer integer : numbers)
		{
			sum += integer * integer;
		}

		return sum;
	}

	public static List<Integer> separateDigitsIntoList(int n)
	{
		List<Integer> returnList = new ArrayList<>();

		while(n != 0)
		{
			int temp = n%10;
			Integer digit = temp;
			returnList.add(0,digit);
			n = n/10;
		}

		return returnList;
	}

	public static Pair<Integer,Integer> addTwoSingleDigitIntegers(Integer a, Integer b)
	{
		return addTwoSingleDigitIntegers(a,b,10);
	}

	public static Pair<Integer,Integer> addTwoSingleDigitIntegers(Integer a, Integer b, Integer base)
	{
		Integer sum = a+b;

		Pair<Integer, Integer> onesDigitAndOverflowPair = new Pair<>((sum % base), (sum / base));
		return onesDigitAndOverflowPair;
	}
}
