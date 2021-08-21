class Solution:
    def twoSum(self, nums, target) :
        for i in nums :
            if target-i != i and target-i in nums :
                return [nums.index(i),nums.index(target-i)]
            else :
                for j in range (0,len(nums)):
                    if nums[j] == i and j != nums.index(i):
                        return [i,j]


n = [1,2,3,4,5,6,7]
a =Solution()
print(a.twoSum(n,12))
