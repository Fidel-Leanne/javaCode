package DataStructuresAndAlgorithms;

import java.util.Scanner;
import java.util.Stack;

public class stacks {

    public static void main(String[] args) {

        Scanner random = new Scanner(System.in);

        System.out.println("enter noun");
        String noun1 = random.nextLine();

        System.out.println("enter verb");
        String verb1 = random.nextLine();

        System.out.println("enter adjective");
        String adjective1 = random.nextLine();

        System.out.println("enter noun");
        String noun2 = random.nextLine();

        System.out.println("enter verb");
        String verb2 = random.nextLine();

        System.out.println("enter adjective");
        String adjective2 = random.nextLine();

        // uses LIFO
        Stack<String> stack = new Stack<>();
        stack.push(noun1);
        stack.push(noun2);
        stack.push(adjective2);
        stack.push(adjective1);
        stack.push(verb1);
        stack.push(verb2);

        System.out.println(stack.empty());

        System.out.println(stack);
        System.out.println(stack.peek());

        // uses of stacks
        // 1. undo / redo
        // 2. moving back/forward browser history
        // 3. backtracking algorithms
        // 4. calling functions

    }

}
