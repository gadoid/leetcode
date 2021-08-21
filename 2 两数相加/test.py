# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        l3 = ListNode()
        value = 0
        c = l3 
        while l1 and l2 :
            c.next = ListNode((l1.val+l2.val+value)%10)
            value = (l1.val+l2.val+value)//10
            c = c.next
            l1 = l1.next
            l2 = l2.next
        if l1 :
            while l1 :
                c.next = ListNode((l1.val+value)%10)
                value = (l1.val+value)//10
                c = c.next
                l1 = l1.next
        elif l2:
            while l2 :
                c.next = ListNode((l2.val+value)%10)
                value = (l2.val+value)//10
                c = c.next
                l2 = l2.next
        if value :
            c.next=ListNode(value)
 
        return l3.next
