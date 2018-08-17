package LinkedListDS;

public class TwoNumberSum
{
	public static void main(String[] args)
	{
		TwoNumberSum twoSum = new TwoNumberSum();
		ListNode addition = twoSum.computeAddition();
		while(addition!=null)
		{
			System.out.print(addition.val + ",");
			addition = addition.next;
		}
		System.out.println();
	}
	
	private ListNode computeAddition()
	{
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode l3 = addTwoNumbers(l1, l2);
		return l3;
	}

	private ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		ListNode head = null;
		ListNode curr = head;
		int carryOver = 0;
		while (l1 != null || l2 != null)
		{
			int digitSum = 0;
			if (l1 != null && l2 != null)
			{
				digitSum = l1.val + l2.val + carryOver;
				l1 = l1.next;
				l2 = l2.next;
			}
			else if (l1 != null)
			{
				digitSum = l1.val + carryOver;
				l1 = l1.next;
			}
			else if (l2 != null)
			{
				digitSum = l2.val + carryOver;
				l2 = l2.next;
			}
			if (digitSum / 10 >= 1)
			{
				carryOver = digitSum / 10;
				digitSum = digitSum % 10;
			}
			else
			{
				carryOver = 0;
			}
			if(head == null)
			{
				head = new ListNode(digitSum);
				curr = head;
			}
			else
			{
				curr.next = new ListNode(digitSum);
				curr = curr.next;
			}
		}
		return head;
	}

	private class ListNode
	{
		int val;
		ListNode next;

		ListNode(int x)
		{
			val = x;
		}
	}
}
