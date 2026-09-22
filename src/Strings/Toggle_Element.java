package Strings;

import java.util.Arrays;

public class Toggle_Element {
    public static void main(String[] args) {
        String s = "NotYourCollege";
        int n = s.length();
        char[] arr = s.toCharArray();

        for (int i = 0; i < n; i++) {
            char ch = arr[i];
            if (ch >= 'a' && ch <= 'z'){
                arr[i] = (char)(arr[i] - 32);
            }else{
                arr[i] = (char)(arr[i] + 32);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
