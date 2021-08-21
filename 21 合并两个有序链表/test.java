class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode s = l3;
        while (l1!=null && l2!=null ){
            if (l1.val < l2.val ){
                s.next = l1 ;
                s = s.next ;
                l1 = l1.next ;
            }else {
                s.next = l2 ;
                s = s.next ;
                l2 = l2.next ;
            }
        }
        if (l1 == null){
            s.next = l2;
        }else{
            s.next = l1;
        }
        return l3.next;
    }
}