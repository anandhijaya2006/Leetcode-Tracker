// Last updated: 7/11/2026, 6:18:38 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode swapPairs(ListNode head) {
13        ListNode dummy = new ListNode(0, head);
14        ListNode prev = dummy;
15
16        while (prev.next != null && prev.next.next != null) {
17            ListNode first = prev.next;
18            ListNode second = first.next;
19
20            first.next = second.next;
21            second.next = first;
22            prev.next = second;
23
24            prev = first;
25        }
26
27        return dummy.next;
28    }
29}