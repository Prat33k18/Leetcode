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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val ==val){
            head = head.next;
        }
        if (head == null) return null;
            ListNode prev = head;
            ListNode k = head.next;
            while(k!=null){
                if(k.val == val){
                    prev.next = k.next;
                }else{
                    prev = k;
                }
                k = k.next;
            }
            return head;
    }
    public static void main(String[]args){
        Solution s =new Solution();
        ListNode head =  new ListNode(1,
                        new ListNode(2,
                            new ListNode(6,
                                new ListNode(3))));
        int val = 6;
        System.out.println(s.removeElements(head,val));
    }
}