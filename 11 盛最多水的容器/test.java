class Solution {
    public static int maxArea(int[] height) {
        int low  = 0 ;
        int high = height.length-1 ;
        int area = 0 ;
        int len = height.length-1;
        while (low < high){
            int l = height[high]>height[low] ? height[low]:height[high] ;
            area = area > len*l ? area:len*l;
            if (height[high]>height[low]) low++ ;
            else  high-- ;
            len -- ;
        } 
        return area ;
    }
}

public class test {
    public static void main (String[] args){
        int []  longs = new int [] {2,3,4,5,18,17,6};
        int s = Solution.maxArea(longs);
        System.out.println(s);
        
    }
}