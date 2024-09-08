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
    public ListNode[] splitListToParts(ListNode head, int k) {
    int size = 0;
    ListNode temp = head;
    while(temp != null) {
        temp = temp.next;
        size++;
    }

    final int avg = size / k;
    final int remain = size % k;

    final ListNode[] result = new ListNode[k];
    int index = 0;
    int remainIndex = 0;
    while(head != null) {
        int expectedSize = avg + (remainIndex < remain ? 1 : 0);
        final ListNode v = new ListNode();
        v.next = head;
        ListNode prev = v;
        ListNode current = head;
        while(current != null && expectedSize > 0) {
            prev = current;
            current = current.next;
            expectedSize--;
        }
        prev.next = null;
        result[index] = head;
        head = current;
        index++;
        remainIndex++;
    }
    return result;
}
}