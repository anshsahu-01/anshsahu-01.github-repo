package Strings;

import java.util.Arrays;

public class Reverse_String {
    public static void main(String[] args) {
        String s = "hello";
        int n = s.length();
        char[] ch = s.toCharArray();
        int start = 0;
        int end = n-1;

        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(ch));
    }
}
