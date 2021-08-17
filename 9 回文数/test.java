class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false ;
        }
        int cur = 0 ;
        int number = x ;
        while (number > 0){
            cur = cur*10+number%10;
            number = number/10 ;
        }
        return cur == x;
    }
}