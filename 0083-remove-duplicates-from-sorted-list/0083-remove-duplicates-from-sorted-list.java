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
    public ListNode deleteDuplicates(ListNode head) {
       
        if (head == null) {
            return null;
        }
        
       
        ListNode current = head;
        
       
        while (current != null && current.next != null) {
            
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        return head;
    }
    public static void main(String[]args){
        Solution s= new Solution();
       ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));

       
        ListNode result = s.deleteDuplicates(head);

      
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
