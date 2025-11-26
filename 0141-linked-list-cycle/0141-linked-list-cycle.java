/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        } 
        return false;
    }
    public static void main(String[]args){
        ListNode head = new ListNode(3,new ListNode(2, new ListNode(0, new ListNode(-4))));
        Solution s = new Solution();
        System.out.print(s.hasCycle(head));
    }
}