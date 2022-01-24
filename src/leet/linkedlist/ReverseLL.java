package leet.linkedlist;

public class ReverseLL {

	public static void main(String[] args) {

		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		
		/*
		 * while (n1 != null) { System.out.println(n1.val); n1 = n1.next; }
		 */
		
		ListNode l = reverse(n1);
		if (l == null) {
			System.out.println("EMPTY LList");
		}
		while (l != null) {
			System.out.println(l.val);
			l = l.next;
		}
	}

	public static ListNode reverse(ListNode head) {
		ListNode prev=null;
		ListNode curr=head;ListNode next=head;
		
		
		while(next!=null) {
			next= next.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		return prev;
	}

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
