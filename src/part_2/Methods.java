package part_2;

public class Methods {

    public  int sum() {
        int a = 1020;
        int b = 1020;
        return  a + b;
    }
    public static void main(String[] args) {

        Methods obj = new Methods();
        System.out.println(obj.sum());
    }
}
