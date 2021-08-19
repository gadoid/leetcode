import java.util.HashMap;
import java.lang.String;

public class test {
    public static void main(String[] args) {
        String sss = "abba";
        int d=tes(sss);
        //System.out.println(d);
    }
    public static int tes(String s ){
        HashMap <Character,Integer> hMap = new HashMap<Character,Integer>();
        int max_len = 0;
        String ss = "";
        int cut = 0 ;
        if (s.length()<=1) return s.length();
        for (int i=0;i<s.length();i++){
            if ( hMap.get(s.charAt(i))==null){
                ss=ss.concat(String.valueOf(s.charAt(i)));
            } 
            else {
                int n =hMap.get(s.charAt(i));
                n = n < cut ? cut:n;
                cut = n ; 
                ss=s.substring(n,i);
                //System.out.println(ss);
            }
            System.out.println(ss);
            max_len =  ss.length()>max_len? ss.length():max_len;
            hMap.put(s.charAt(i),i);
            System.out.println(max_len);
        }
        return max_len;
    }
}