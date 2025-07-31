package PracticeForSt1;

import java.util.Scanner;

public class CustomExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator and denominator : ");
        int num = sc.nextInt();
        int den = sc.nextInt();
        try{
            int result = num/den;
            System.out.println("The Result is : "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception : Division by zero caught");
        }
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements : ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        try {
            System.out.println("Enter the element index to search for : ");
            int target = sc.nextInt();
            System.out.println("The array element is "+arr[target]);
        }
        catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index is out of bound");
        }
    }
}