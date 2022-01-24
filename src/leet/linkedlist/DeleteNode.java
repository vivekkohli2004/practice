package leet.linkedlist;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/
public class DeleteNode {

	public static void main(String[] args) {

		ListNode n1 = new ListNode(1);
		 ListNode n2 = new ListNode(2); ListNode n3 = new ListNode(3); /*
		 *ListNode n4 =
		 * new ListNode(4); ListNode n5 = new ListNode(5);
		 */
		n1.next = n2;n2.next = n3; n3.next=null;
		/*
		 * n2.next = n3; n3.next = n4; n4.next = n5; n5.next = null;
		 */
		
		ListNode head=n1;
		ListNode l=removeNthFromEnd(n1, 2);
		if(l==null) {
			System.out.println("EMPTY LList");
		}
		while(l !=null) {
			System.out.println(l.val);
			l=l.next;
		}
	}

    public static ListNode removeNthFromEnd(ListNode head, int n) {
	    ListNode dummy = new ListNode(0);
	    dummy.next = head;
		int size = 0;
		ListNode first = dummy;
		while (first != null) {
			first = first.next;
			size++;
		}
		first = dummy;
		int x = 1;
		size -= n;
		//size++;

		while (x < size) {
			x++;
			first = first.next;
		}

		first.next = first.next.next;
		return dummy.next;}
    

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
