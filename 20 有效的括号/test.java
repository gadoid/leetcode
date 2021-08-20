public class test {
    public static void main(String[] args){
        String s = "{()()[]}";
        Boolean d = isValid(s);
        System.out.println(d);
    }
    public static boolean isValid (String s) {
        while (s.contains("{}") || s.contains("[]") || s.contains("()")){
            s.replaceAll("[{}]", "");
            //s.replaceAll("[[]]", "");
            s.replaceAll("[()]", "");
            System.out.println(s);
        }
        return s.equals("") ;
    }
}
