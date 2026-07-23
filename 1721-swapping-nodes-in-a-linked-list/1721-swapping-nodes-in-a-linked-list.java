/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;
        ListNode fast = head;

        // Move to the kth node from the beginning
        for (int i = 1; i < k; i++) {
            first = first.next;
            fast = fast.next;
        }

        ListNode second = head;

        // Find the kth node from the end
        while (fast.next != null) {
            fast = fast.next;
            second = second.next;
        }

        // Swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}