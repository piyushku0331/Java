package PracticeForSt1;

import java.util.*;

public class MenuDrivenStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        boolean run = true;
        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push Element in Stack");
            System.out.println("2. Pop Element from Stack");
            System.out.println("3. Peek Element from Stack");
            System.out.println("4. Display all Elements");
            System.out.println("5. Exit The Program");
            System.out.print("Enter your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    System.out.println("Element added successfully.");
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        int removed = stack.pop();
                        System.out.println("Popped element: " + removed);
                    } else {
                        System.out.println("Stack is empty. Nothing to pop.");
                    }
                    break;

                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Top element: " + stack.peek());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;

                case 4:
                    if (!stack.isEmpty()) {
                        System.out.println("Stack elements: " + stack);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;

                case 5:
                    run = false;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        sc.close();
    }
}