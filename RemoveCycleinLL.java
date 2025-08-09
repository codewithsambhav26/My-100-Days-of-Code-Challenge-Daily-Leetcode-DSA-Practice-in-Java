public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return null;
        }

        //find meeting point
        slow=head;
        ListNode prev=null;
        while(fast!=slow){
            slow=slow.next; //+1
            fast=fast.next; //+1
            prev=fast;
        }

        // remove cycle
        return fast;
    }
}
