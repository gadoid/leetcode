public class test {

    public static void main(String[] args){
        int ss ;
        ss = reverse(1534236469);
        System.out.println(ss);
    } 
    public static int reverse (int x ){
        int pos = 1 ;
        if (x<0 ){
            pos = -1 ;
            x = -x ;
        }
        String a = "" ;
        String sx = String.valueOf(x);
        String [] f = sx.split("");
        for (int i =sx.length()-1 ; i >= 0 ; i --){
            a+=f[i];
        }
        try {
        int s = Integer.valueOf(a);
        }catch (NumberFormatException nnn){return 0; };
        if  (s >= 2147483647 || s < - 2147483648){
            return 0 ;
        } 
        else {
        return s;
        }
    }
}
