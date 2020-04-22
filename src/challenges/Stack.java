package challenges;

import java.util.Arrays;

/**
 * The Implement a Stack challenge:
 *   <p/><p>Write a class to implement a stack (LIFO). Provide the following API's:</p>
 *   <p>- push(item) to push an item onto the stack.</p>
 *   <p>- pop() to pop an item off the stack (the last item pushed).</p>
 *   <p>- peek() to look at the item on the top of the stack.</p>
 *
 * @author Renay Earnshaw
 */public class Stack {
     private final int MAX_SIZE;
     private int tail = -1;
     private int[] stack;

     public Stack(final int size) {
         MAX_SIZE = size;
         stack = new int[size];
     }

     public void push(final int i) {
         if (tail < MAX_SIZE - 1) {
             stack[++tail] = i;
         } else {
             System.out.println("You have reached the maximum capacity of your stack, which is " + MAX_SIZE);
         }
     }

     public int pop() {
         if (tail >= 0) {
             return stack[tail--];
         } else {
             return -1;
         }
     }

     public int peep() {
         if (tail >= 0) {
             return stack[tail];
         } else {
             return -1;
         }
     }

     public void print() {
         if (tail >= 0) {
             System.out.printf("Your stack contents are: [ ");
             for (int i = 0; i <= tail; i++) {
                 if (i != tail) {
                     System.out.printf("%d, ", stack[i]);
                 } else {
                     System.out.printf("%d ]\n", stack[i]);
                 }
             }
         } else {
             System.out.println("The stack is empty");
         }
     }
}
