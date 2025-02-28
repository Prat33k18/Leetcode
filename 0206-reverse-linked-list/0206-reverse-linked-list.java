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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        

        while(curr != null){
            ListNode next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
        
        } 
        return prev;
    }

    public static void main(String[] args){
         Solution s = new Solution();
         ListNode head = new ListNode(1, 
                        new ListNode(2, 
                        new ListNode(3, 
                        new ListNode(4, 
                        new ListNode(5, null)))));

        System.out.print(s.reverseList(head));
    }
}