package leetcode;

public class ReverseWords {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String source="hello,world";
        String dst=reverseWords(source);
        System.out.println(dst);
    }

    public static String reverseWords(String s) {
        int i, len = s.length();
        StringBuffer dest = new StringBuffer(len);
        for (i = (len - 1); i >= 0; i--)
            dest.append(s.charAt(i));
        return dest.toString();
    }

}
