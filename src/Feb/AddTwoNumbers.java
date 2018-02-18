package Feb;

public class AddTwoNumbers {
	
	public static void main(String[] args){
		AddTwoNumbers twn = new AddTwoNumbers();
		ListNode l1 = new ListNode(3);
		ListNode p1 = l1;
		l1.next = new ListNode(6);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(1);
		ListNode p2 = l2;
		l2.next = new ListNode(1);
		l2.next.next = new ListNode(1);
		ListNode res = twn.addTwoNumbers(p1, p2);
		for(ListNode t =res;  t != null; t = t.next){
			System.out.print(t.val + "     ");
		}
		System.out.println();
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
        ListNode head = result;
	    int carryIn = 0;
	    while(l1 != null || l2 != null ||  carryIn != 0){
	    	ListNode cur = new ListNode(0);
	        int val = (l1 != null? l1.val : 0 )+ (l2 != null? l2.val : 0) + carryIn;
	        carryIn = val / 10;
	        cur.val = val % 10;
	        result.next =cur;
	        result = cur;
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
	    }
        return head.next;             
	}
}
