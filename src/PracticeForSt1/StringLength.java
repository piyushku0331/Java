package PracticeForSt1;

@java.lang.FunctionalInterface
interface Length{
    int len(String str);
}

public class StringLength {
    public static void main(String[] args) {
        Length obj = (str) -> str.length();
        System.out.println(obj.len("LambdaExpression"));
    }
}
