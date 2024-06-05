package Strings;

public class lengthOflast {
    // O(N) but can be optimized
    public static int getlastLength(String str ){
        String s = str.trim();
        int n = s.length();
          String temp = "";
          int required = 0;
          for(char ch: s.toCharArray()){
              if(ch!=' '){
                  temp += ch;
              } else {
                 required = 0;
              }
              required += temp.length();
              temp="";
          }

          return required;
    }

    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println(getlastLength(str));
    }
}
