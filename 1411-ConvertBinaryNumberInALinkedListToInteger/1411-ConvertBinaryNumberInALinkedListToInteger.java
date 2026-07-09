// Last updated: 7/9/2026, 3:07:05 PM
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
    public int getDecimalValue(ListNode head) {
        int num = 0;
        while(head != null){
            num = (num << 1) | head.val;
            head = head.next;
        }
        return num;
    }
}