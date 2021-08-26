class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = 0
        l =sorted(set(nums))
        for i in l :
            nums[n] = i
            n+=1
        return len(l)