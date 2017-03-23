import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
   public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode temp = head;
        while(temp != null || temp.next != null) {
            if(set.contains(temp)) 
            	return true;
            else 
                set.add(temp);
            temp = temp.next;
        }
        return false;
    }
   


	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	 }
    
}
