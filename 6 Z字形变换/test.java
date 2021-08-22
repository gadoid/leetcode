
class Solution {
    public static String convert(String s, int numRows) {
        if (numRows==1 || s.length() <= numRows){
            return s;
        }
        int p = 0;
        int q = 0;
        //
        int n = s.length()/2+1;
        //
        //
        Character [][] Dlist = new Character [numRows][n];
        //
        for (int i = 0 ; i < s.length(); i++){
            if (q==0 || q%(numRows-1) ==0){
                Dlist[p][q]=s.charAt(i);
                p+=1;
            }else {
                while (p!=numRows){
                    if (q%(numRows-1)+p == numRows-1){
                        Dlist[p][q]=s.charAt(i);
                        p+=1;
                    }else {
                        Dlist[p][q]=null;
                        p+=1;
                }
                }
            }
            if (p == numRows){
                p =0   ;
                q+=1;
            }
        }
        String string = "";
        for(int i=0 ; i < Dlist.length;i++){
            for (int j=0 ; j< Dlist[0].length;j++){
                if (Dlist[i][j]!=null) 
                string = string.concat(Dlist[i][j].toString());
            }
        }
        return string;
    }
}
public class test{
    public static void main(String[] args){
        String jj = "ABC"; 
        String ob = Solution.convert(jj,2);
        System.out.print(ob);
    }
}