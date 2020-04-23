package challenges;

/**
 * The Implement a Stack challenge:
 *   <p/><p>Write a class to implement a stack (LIFO). Provide the following API's:</p>
 *   <p>- push(item) to push an item onto the stack.</p>
 *   <p>- pop() to pop an item off the stack (the last item pushed).</p>
 *   <p>- peek() to look at the item on the top of the stack.</p>
 *
 * @author Renay Earnshaw
 */
public class Stack {
     private final int MAX_SIZE;
     private int tail = -1;
     private final int[] stack;

     public Stack(final int size) {
         MAX_SIZE = size;
         stack = new int[size];
     }

     public void push(final int i) {
         if (!isFull()) {
             stack[++tail] = i;
         } else {
             System.out.println("You have reached the maximum capacity of your stack, which is " + MAX_SIZE);
         }
     }

     public int pop() {
         if (!isEmpty()) {
             return stack[tail--];
         } else {
             return -1;
         }
     }

     public int peep() {
         if (!isEmpty()) {
             return stack[tail];
         } else {
             return -1;
         }
     }

     public void print() {
         if (!isEmpty()) {
             System.out.print("Your stack contents are: [ ");
             for (int i = 0; i <= tail; i++) {
                 printElement(i);
             }
         } else {
             System.out.println("The stack is empty");
         }
     }

    private void printElement(final int i) {
        if (i != tail) {
            System.out.printf("%d, ", stack[i]);
        } else {
            System.out.printf("%d ]\n", stack[i]);
        }
    }

    private boolean isFull() {
         return tail >= MAX_SIZE - 1;
     }

     private boolean isEmpty() {
         return tail < 0;
     }
}
