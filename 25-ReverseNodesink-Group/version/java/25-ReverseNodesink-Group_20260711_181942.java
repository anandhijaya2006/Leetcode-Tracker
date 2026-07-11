// Last updated: 7/11/2026, 6:19:42 PM
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
12    private ListNode reverse(ListNode curr, ListNode end) {
13        ListNode prev = null;
14        while(curr != end) {
15            ListNode temp = curr.next;
16            curr.next = prev;
17            prev = curr;
18            curr = temp;
19        }
20        return prev;
21    }
22
23    public ListNode reverseKGroup(ListNode head, int k) {
24        if(head == null) return null;
25        ListNode tail = head;
26        for(int i = 0; i < k; i++) {
27            if(tail == null) return head;
28            tail = tail.next;
29        }
30        ListNode newHead = reverse(head, tail);
31        head.next = reverseKGroup(tail, k);
32        return newHead;
33    }
34}