// Last updated: 8/14/2026, 6:10:04 PM
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
12    public ListNode insertionSortList(ListNode head) {
13		if( head == null ){
14			return head;
15		}
16		
17		ListNode helper = new ListNode(0); //new starter of the sorted list
18		ListNode cur = head; //the node will be inserted
19		ListNode pre = helper; //insert node between pre and pre.next
20		ListNode next = null; //the next node will be inserted
21		//not the end of input list
22		while( cur != null ){
23			next = cur.next;
24			//find the right place to insert
25			while( pre.next != null && pre.next.val < cur.val ){
26				pre = pre.next;
27			}
28			//insert between pre and pre.next
29			cur.next = pre.next;
30			pre.next = cur;
31			pre = helper;
32			cur = next;
33		}
34		
35		return helper.next;
36	}
37}