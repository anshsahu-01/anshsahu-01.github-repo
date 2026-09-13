package Array;

import java.util.Arrays;

public class Var_Len_Arg {
    public static void main(String[] args) {
        solve(1, 1,2,3,4,5);
    }

    private static void solve(int age, int ...arr) {
        System.out.println(age);
        System.out.println(Arrays.toString(arr));
    }
}
