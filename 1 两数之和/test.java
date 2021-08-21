import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0 ; i < nums.length; i++){
            int j = 0 ;
            while (j < nums.length){
                if (nums[i]+nums[j] != target)j++;
                else {
                    if (j == i){
                        j++ ;
                    }
                    else {
                        int [] num = {i,j};
                        return num ;
                    }
                }

            } 
        }
    return nums;
    }
}

public class test{
    int [] m= {1,2,3,4,5,6,7};
    int [] n = Solution.twoSum(m,13);
}