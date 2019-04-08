package src.examSources;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

		You may assume that each input would have exactly one solution, and you may not use the same element twice.

		Example:

		Given nums = [2, 7, 11, 15], target = 9,

		Because nums[0] + nums[1] = 2 + 7 = 9,
		return [0, 1].
*/

import java.util.Arrays;

public class ReturnSumIndicies
{
	public static int[] twoIndiciesToEqualTarget(int[] numbers, int target)
	{
		int[] resultSet = new int[2];
		Integer operandIndex1 = 0;
		Integer operandIndex2 = 0;

		//logic


		resultSet[0] = operandIndex1;
		resultSet[1] = operandIndex2;
		return resultSet;
	}
}
