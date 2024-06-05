package Strings;

public class FirstIndex {

    public static  int strStr(String haystack, String needle) {

        for(int i = 0; i < needle.length()-1;i++){
          String check = haystack.substring(0,needle.length());
            if(check.equals(needle)){
                return i;
            }
            i++;
        }

        return -1;
    }

    public static void main(String[] args) {
       String haystack = "leetcode", needle = "leeto";
        System.out.println(strStr(haystack,needle));
    }
}