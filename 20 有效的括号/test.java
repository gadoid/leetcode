public class test {
    public static void main(String[] args){
        String s = "{()()[]}";
        Boolean d = isValid(s);
        System.out.println(d);
    }
    public static boolean isValid (String s) {
        while (s.contains("{}") || s.contains("[]") || s.contains("()")){
            s = s.replaceAll("\\{\\}", "");
            s = s.replaceAll("\\[\\]", "");
            s = s.replaceAll("\\(\\)", "");
        }
        return s.equals("") ;
    }
}
