package Interface;

@java.lang.FunctionalInterface
interface Arithmetic{
    int calculation(int num, int num2);
}

public class FunctionalInterface2 {
    public static void main(String[] args) {
        Arithmetic obj = (num, num2) -> num+num2;
        System.out.println(obj.calculation(12, 13));
        Arithmetic obj2 = (num, num2) -> num*num2;
        System.out.println(obj2.calculation(14, 2));
    }
}