import java.util.HashMap;

public class base {
    public static void main(String[] args){
        int a =romanInt("MCMXCIV");
        System.out.println(a);
    }   
    public static int romanInt(String s){
        HashMap<Character , Integer > hMap=
        new HashMap< Character, Integer>();
        hMap.put('I',1);
        hMap.put('V',5);
        hMap.put('X',10);
        hMap.put('L',50);
        hMap.put('C',100);
        hMap.put('D',500);
        hMap.put('M',1000);
        int num = 0 ;
        for (int i=0 ; i<s.length();i++){
            if (s.length()-1>i && hMap.get(s.charAt(i))<hMap.get(s.charAt(i+1))){
                num-=hMap.get(s.charAt(i));
            }else{
                num+=hMap.get(s.charAt(i));
            }
        }
        return num ;
    }  
}
