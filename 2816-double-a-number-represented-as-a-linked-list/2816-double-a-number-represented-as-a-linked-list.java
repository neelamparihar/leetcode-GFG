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
    public ListNode doubleIt(ListNode head) {
       ListNode temp = head;
        ListNode prev = null;
        ListNode nextNode;

        while (temp != null) {
            nextNode = temp.next; 
            temp.next = prev;     
            prev = temp;          
            temp = nextNode;     
        }
      int carry =0;
    temp =prev;
        while(prev!=null)
        {
            if(prev.val+prev.val+carry>=10)
            {
                prev.val = prev.val+prev.val+carry-10;
                carry=1;
            }
            else
            {
                prev.val = prev.val+prev.val+carry;
                carry=0;
            }
            prev = prev.next;
        }
        ListNode dummy = new ListNode(1);
        prev = null;
        while(temp!=null)
        {
            ListNode curr = temp.next;
            temp.next=prev;
            prev=temp;
            temp = curr;
        }
        if(carry==1)
        {
            dummy.next=prev;
        return dummy;
        }
        return prev;
    }
}