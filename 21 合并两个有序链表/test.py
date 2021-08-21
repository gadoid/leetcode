class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def mergeTwoLists(self, l1, l2) :
        s = ListNode()
        ans = s
        while l1 and l2 :
            if l1.val < l2.val :
                s.next = ListNode(l1.val)
                l1 = l1.next
            else :
                s.next = ListNode(l2.val)
                l2 = l2.next 
            s = s.next
        if l1 :
            s.next = l1
        elif l2 :
            s.next = l2 
        return ans.next


        

a = Solution()
l1 = [1,2,3]
l2 = [1,5,6]
print(a.mergeTwoLists(l1,l2))