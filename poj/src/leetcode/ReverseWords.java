package leetcode;

public class ReverseWords {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String source="hello  ssss   ";
        String dst=reverseWords(source);
        System.out.println(dst);
    }

    public static String reverseWords(String s) {
       if(s.trim().equals("")||s==null) return "";
        
        String[] words = s.split(" "); //Get every single word.
        StringBuilder sb = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            if (!"".equals(words[i])) {
                sb.append(words[i] + " ");
            }
        }
        
        return sb.length() == 0 ? "" : sb.toString().substring(0, sb.length() - 1);
    }

}
