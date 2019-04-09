package src.examSources;
/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */


import javafx.util.Pair;
import src.CommonHelperMethods;

public class AddTwoLinkedIntegerLists
{
	public static class ListNode
	{
		public int val;
		public ListNode next;
		public ListNode(int x) { val = x; }
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		ListNode beginning = null;
		ListNode current = beginning;
		Pair<Integer,Integer> onesDigitAndOverflow = CommonHelperMethods.addTwoSingleDigitIntegers(l1.val,l2.val);
		Integer onesValue = onesDigitAndOverflow.getKey();
		Integer overflowValue = onesDigitAndOverflow.getValue();



		return null;
	}
}
