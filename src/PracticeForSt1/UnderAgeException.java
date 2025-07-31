package PracticeForSt1;

import java.util.Scanner;

class UnderException extends Exception{
    public UnderException(String message){
        super(message);
    }
}

public class UnderAgeException {
    public static void registerUser(int age) throws UnderException {
        if(age < 18){
            throw new UnderException("You are underage and cannot vote");
        }
        else{
            System.out.println("You can vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        try{
            age = sc.nextInt();
            registerUser(age);
        }
        catch (UnderException ex){
            System.out.println("Error Message : "+ex.getMessage());
        }
        catch(Exception e){
            System.out.println("Enter valid age");
        }
    }
}
