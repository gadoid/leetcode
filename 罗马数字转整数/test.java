
public class test{
    public static void main(String[] args){
        int a = romanInt("MCMXCIV");
        System.out.println(a);
    }
    public static int romanInt(String s){
        String [] num = new String [s.length()];
        int [] n = new int [num.length];
        num = s.split("");
        for (int i = 0 ; i<num.length;i++){
            if (num[i].equals("I")) n[i] = 1 ;
            else if (num[i].equals("V")) n[i] = 5 ;
            else if (num[i].equals("X")) n[i] = 10 ;
            else if (num[i].equals("L")) n[i] = 50;
            else if (num[i].equals("C")) n[i] = 100;
            else if (num[i].equals("D")) n[i] = 500;
            else if (num[i].equals("M")) n[i] = 1000;       
            if (i>0&&n[i-1]<n[i]){
                n[i-1] = -n[i-1];
            }
            
        } 
        int cur = 0 ;
        for (int i = 0 ; i<n.length;i++){
            cur += n[i];
        }          
        return cur ;
    }
        
    }
