package Strings;

public class Palindrome_String {
    public static void main(String[] args) {
        String s = "madam";
        int n = s.length();
        char[] arr = s.toCharArray();
        int start = 0;
        int end = n-1;

        while (start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String rev = "";
        for(char ch : arr){
            rev += ch;
        }
        System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
    }
}
