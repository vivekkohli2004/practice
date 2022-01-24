package leet.linkedlist;

public class MergeSortedLists {
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) { 
		
		ListNode dummy=new ListNode(0);
		ListNode head= dummy;

		while(l1!=null && l2!=null) {
			if(l1.val<l2.val) {
				dummy.next=l1;
				l1=l1.next;
				
			}else {
				dummy.next=l2;
				l2=l2.next;
			}
			
			dummy=dummy.next;
		}
		if(l1==null) {
			dummy.next=l2;
		}else {
			dummy.next=l1;
		}
		
		return head.next;

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
	
	public static void main(String[] args) {
		ListNode one= new ListNode(1);
		ListNode two= new ListNode(2);
		ListNode three= new ListNode(4);
		
		ListNode four= new ListNode(1);
		ListNode five= new ListNode(3);
		ListNode six= new ListNode(4);
		one.next=two;two.next=three;three.next=null;
		
		four.next=five;five.next=six;six.next=null;
		ListNode l=mergeTwoLists(one, four);
		
		while(l!=null) {
			System.out.println(l.val);l=l.next;
		}


}
}
