package Strings;

public class Count_Elements {
    public static void main(String[] args) {
        String s = "Hello me";
        int n = s.length();
        int v = 0;
        int sp = 0;
        int c = 0;

        for (char ch : s.toCharArray()) {
            switch (ch){
                case 'a', 'e', 'i', 'o', 'u' -> v++;
                case ' ' -> sp++;
                default -> c++;
            }
        }
        System.out.println("Vowel :" + v);
        System.out.println("Space :" + sp);
        System.out.println("Consonant :" + c);
    }
}
