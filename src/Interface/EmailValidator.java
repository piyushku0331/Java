package Interface;

@java.lang.FunctionalInterface
interface EmailValidatorFunctional{
    boolean isValidEmail(String email);
}

public class EmailValidator {
    public static void main(String[] args) {
       EmailValidatorFunctional obj = (email) -> email.contains("@") && email.endsWith(".com");
        System.out.println(obj.isValidEmail("Piyushku0331@gmail.com"));
        System.out.println(obj.isValidEmail("invalid.com"));
    }
}