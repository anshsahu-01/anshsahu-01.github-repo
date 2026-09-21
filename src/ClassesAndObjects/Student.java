package ClassesAndObjects;

public class Student {
    String name;
    int age;

    Student(String name, int age) {     // Constructor Creation
        this.name = name;
        this.age = age;
    }
    Student(String name){               // Constructor Overloading
        this.name = name;
    }
    public void print(){
        System.out.println("[name :" + name + ", age :" + age + "]");
    }
}


class Temp{
    public static void main(String[] args) {
        Student s1 = new Student("Golu", 27);       // Object Creation
        s1.print();
        Student s2 = new Student("Polu", 21);       // Object Creation
        s2.print();
        Student s3 = new Student("Rohan");               // Object Creation
        s3.print();
    }
}
