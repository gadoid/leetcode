class Solution:
    def twoSum(self, nums, target) :
        dic = dict()
        for i in range (0,len(nums)):
            if target-nums[i] in dic.values():
                return [list(dic.values()).index(target-nums[i]),i]
            else :
                dic[i] = nums[i]

        
    
a = Solution()
c = [1,2,3,3]
print(a.twoSum(c,6))
        