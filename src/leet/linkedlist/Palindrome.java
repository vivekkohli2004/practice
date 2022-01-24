package leet.linkedlist;

public class Palindrome {

	public static void main(String[] args) {
		ListNode one= new ListNode(1);
		ListNode two= new ListNode(2);
		ListNode three= new ListNode(3);
		ListNode threee= new ListNode(3);
		ListNode twoo= new ListNode(2);
		ListNode onee= new ListNode(1);
		one.next=two;two.next=three;three.next=threee;
		threee.next=twoo;twoo.next=onee;
		System.out.println(isPalindrome(one));


}
	
	public static boolean isPalindrome(ListNode head) {
		ListNode fast= head;
		ListNode slow=head;
		while(fast!= null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		
		slow= reverse(slow);
		fast=head;	
		
		while(slow!=null) {
			if(slow.val!=fast.val) {
				return false;
			}
			slow=slow.next;
			fast=fast.next;
				
		}
		return true;
		
	}

	private static ListNode reverse(ListNode slow) {
		ListNode prev= null;
		ListNode curr= slow;
		ListNode next= slow;
		
		while(next!=null) {
			next=next.next;
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