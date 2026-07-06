package part_2;

public class Methods {

    public  int sum(int a, int b) {
        return  a + b;
    }
    public static void main(String[] args) {

        Methods obj = new Methods();
        System.out.println(obj.sum(3,2));
    }
}
