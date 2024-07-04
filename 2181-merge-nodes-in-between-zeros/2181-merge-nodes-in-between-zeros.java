/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        
        // if(head==null || head.next==null)
        //     return new
        
        ListNode temp = head.next;
        int count=0;
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(temp!=null)
        {
            count += temp.val;
            if(temp.val==0)
            {
               
               curr.next = new ListNode(count);
                curr = curr.next;
                count=0;
            }
            temp = temp.next;
            
        }
        
        return dummy.next;
    }
}