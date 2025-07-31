package PracticeForSt1;

@java.lang.FunctionalInterface
interface Add{
    int add(int num1, int num2);
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        Add obj = (num1, num2) -> num1 + num2;
        System.out.println(obj.add(10, 12));
    }
}
