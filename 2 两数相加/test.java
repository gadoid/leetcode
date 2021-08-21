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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        int value = 0;
        ListNode s = l3 ;
        while (l1!=null && l2!=null){
            s.next = new ListNode((l1.val+l2.val+value)%10);
            value = (l1.val+l2.val+value)/10;
            s = s.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1!=null){
            while (l1!=null){
                s.next = new ListNode((l1.val+value)%10);
                value = (l1.val+value)/10;
                s = s.next;
                l1 = l1.next;
            }
        }
        else if (l2!=null){
            while (l2!=null){
            s.next = new ListNode((l2.val+value)%10);
            value =(l2.val+value)/10;
            s = s.next;
            l2 = l2.next;
            }
        }
        if (value == 1){
            s.next = new ListNode(value);
        }
        return l3.next;
    }
}