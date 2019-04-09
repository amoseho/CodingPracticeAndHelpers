package src.test;

import org.junit.jupiter.api.Test;
import src.examSources.AddTwoLinkedIntegerLists;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoLinkedIntegerListsTest
{
	@Test
	void leetcodeExamplePositiveCase()
	{
		//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
		//Output: 7 -> 0 -> 8
		//Explanation: 342 + 465 = 807

		AddTwoLinkedIntegerLists.ListNode listNode1 = new AddTwoLinkedIntegerLists.ListNode(2);
		listNode1.next = new AddTwoLinkedIntegerLists.ListNode(4);
		listNode1.next.next = new AddTwoLinkedIntegerLists.ListNode(3);
		AddTwoLinkedIntegerLists.ListNode listNode2 = new AddTwoLinkedIntegerLists.ListNode(5);
		listNode2.next = new AddTwoLinkedIntegerLists.ListNode(6);
		listNode2.next.next = new AddTwoLinkedIntegerLists.ListNode(4);

		AddTwoLinkedIntegerLists.ListNode resultNode = AddTwoLinkedIntegerLists.addTwoNumbers(listNode1, listNode2);
		assert resultNode.val == 7;
		assert resultNode.next.val == 0;
		assert resultNode.next.next.val == 8;
	}
}