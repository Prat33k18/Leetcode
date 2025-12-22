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
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast!= null){
            slow = slow.next;
        } 
            ListNode half = reverse(slow);
            ListNode firstHalf = head;
        while(half!=null){
            if (firstHalf.val != half.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            half = half.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    public static void main(String[]args){
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        Solution s = new Solution();
        System.out.print(s.isPalindrome(head)); 
    }
}