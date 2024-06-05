package Strings;

import java.util.HashSet;
import java.util.Set;

public class Assignment1Dupicate {

     // this only works for sorted one not the others
      public static String Subset(String str){
          int n  = str.length();
          String ans = "";
          String temp = "";
          if(str.isEmpty()) return null;

          for(int i = 0;i< n;i++){
              if(i == n - 1 || str.charAt(i)!=str.charAt(i+1)){
                  ans += str.charAt(i);

              } else {
                  temp += str.charAt(i);
              }
          }
          return  ans;
      }

      // using has Set approach
    public static String Subset1(String str ){
          if(str.isEmpty()) return null;
        Set<Character> unique = new HashSet<>();
        StringBuilder temp = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(unique.add(ch)){
                temp.append(ch);
            }
        }
        return temp.toString();
    }

    public static void main(String[] args) {
        String str = "aabbccxfsdgdgxdfdssesfdfdssagsgdfgxfsrzyd";
        System.out.println(Subset(str));
        System.out.println(Subset1(str));
    }
}
