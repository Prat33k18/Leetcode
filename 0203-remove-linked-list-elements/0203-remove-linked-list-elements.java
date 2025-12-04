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
        if(head == null) return null;
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode k = dummy.next;
            ListNode prev = dummy;
            while(k!=null){
                if(k.val == val){
                    prev.next = k.next;
                }else{
                    prev = k;
                }
                k = k.next;
            }
            return dummy.next;
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