class Solution {
    public static int myAtoi(String s) {
        s= s.replace(" ","");
        if (s.length() == 0) return 0 ;
        String po = String.valueOf(s.charAt(0));
        int n = 0 ;
        double num ;
        String nums = "1234567890";
        if (s.length() == 1) {
            if (nums.toString().contains(po)) return Integer.parseInt(po);
            else return 0 ;
        }
        if (nums.toString().contains(String.valueOf(po)) || po.equals("+") || po.equals("-")){
            if ( po.equals("+") || po.equals("-")){
                n+=1;
            }
            // 符号判断
            while ( n<s.length()){
                if (nums.toString().contains(String.valueOf(s.charAt(n)))){
                    n+=1;
                }
                else break;
            }
            String a = s.substring(0, n);
            if (a.length()==1 &&  ! nums.contains(a)) return 0 ;
            if (n == s.length()-1){
                num = Double.parseDouble(s.substring(0));
            }
            else {
                num =  Double.parseDouble(s.substring(0, n));
            }
            if (num>Integer.MAX_VALUE || num<Integer.MIN_VALUE){
                return num > 0 ? Integer.MAX_VALUE:Integer.MIN_VALUE ;
            }
            return (int)num ;
        }
        else  return 0;

    }
}


public class test {
    public static void main(String[]  args){
        int nnn ;
        String s = "    +0.123";
        nnn = Solution.myAtoi(s);
        System.out.println(nnn);
    }
}