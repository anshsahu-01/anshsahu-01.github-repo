package Strings;

public class Frequency {
    public static void main(String[] args) {
        String s = "aabbbccddew";
        int[] freq = new int[26];
        int n = freq.length;

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            if (freq[i] != 0) {
                System.out.println((char)(i+97) + "-" + freq[i]);
            }
        }
    }
}
