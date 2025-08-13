package dsa_intro.DSA_files;
import java.util.Stack;             // Stack: Last-in First-out

public class stacks {
    public static void main(String[] args) {

        /* --- Stacks --- */

        /**
         * Last-In First-Out
         * 
         * add     ->  push()
         * remove  ->  pop()
         */

        Stack<String> stack = new Stack<String>();

        stack.push("Arda");     // add items to the stack with  push()  method
        stack.push("Ayda");
        stack.push("Metehan");
        stack.push("Azra");
        stack.push("Fatih");
        stack.push("Kerem");
        stack.push("Hasan");

        stack.pop();                 // pop()  method removes the top-most item ("Hasan")

        // System.out.println(stack.peek());

        System.out.println(stack);

        System.out.println(stack.search("Ayda"));

    }
}