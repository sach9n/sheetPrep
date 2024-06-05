package Strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static  int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for(int i = 0; i< s.length();i++){
            char current = s.charAt(i);
            int value =  map.get(current);

            if(i+1< s.length()) {
                char next = s.charAt(i + 1);
                if ((current == 'I' && (next == 'V' || next == 'X')) ||
                        (current == 'X' && (next == 'L' || next == 'C')) ||
                        (current == 'C' && (next == 'D' || next == 'M'))) {
                    value = map.get(next) - value;
                    i++;
                }
            }
            result+=value;
        }

        return  result;
    }

    public static void main(String[] args){
        System.out.println(romanToInt("III"));
    }
}
