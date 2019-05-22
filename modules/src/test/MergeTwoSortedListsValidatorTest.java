package src.test;

import org.junit.jupiter.api.Test;
import src.ListNode;
import src.examSources.MergeTwoSortedListsValidator;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsValidatorTest
{

	@Test
	void mergeTwoListsTest()
	{
		ListNode listNode1 = new ListNode(1);
		listNode1.next = new ListNode(2);
		listNode1.next.next = new ListNode(4);
		ListNode listNode2 = new ListNode(1);
		listNode2.next = new ListNode(3);
		listNode2.next.next = new ListNode(4);

		ListNode output = MergeTwoSortedListsValidator.mergeTwoLists(listNode1, listNode2);
	}
}