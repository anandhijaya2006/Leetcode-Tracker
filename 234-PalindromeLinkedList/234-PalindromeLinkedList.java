// Last updated: 7/9/2026, 3:09:22 PM
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
    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        int i = 0, j = values.size() - 1;
        while (i < j) {
            if (!values.get(i).equals(values.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}