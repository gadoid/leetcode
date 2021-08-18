import java.util.HashMap;

public class test{
    public static void main(String[] args){
        String[] b = {"flower","flow","flight"};
        String c = a(b);
        System.out.print(c);
    }
    public static String a(String[] strs ){
        if (strs[0]==null){
            return "";
        }
        if (strs.length <= 1){
            return strs[0];
        }
        else {
            int i = 0 ;
            while (i < strs[0].length()+1){
                for (int j = 0 ; j < strs.length ; j++){
                    
                    //if (strs[0].substring(0,i) == null) continue;
                    //System.out.println(strs[0].substring(0,1));
                    if( !strs[j].startsWith(strs[0].substring(0,i))){
                        if (i==1) return "";
                        else return strs[0].substring(0,i-1);
                    }
                }
            i ++ ; 
            }
        }
        return strs[0];
    }
}