import java.util.Random;
public class Stack {
    // Top of the Stack
    private int tos;
    // Array of Elements
    private int[] array;
    // Size of the Stack
    final private int size;
    /**
     * Public Constructor for Stack Objects
     *
     * @param size Size of the Stack
     */
    public Stack(int size) {
        this.tos = -1;
        this.size = size;
        this.array = new int[this.size];
    }
    /**
     * Push an element to the top of the stack
     *
     * @param e Element to be pushed
     * @throws StackException Stack Overflow
     */
    public void push(int e) throws StackException {
        if (tos == size - 1)
            throw new StackException("Stack Overflow: could not push " + e);
        else
            this.array[++this.tos] = e;
    }
    /**
     * Pop an element from the stack
     *
     * @return Object on top of the stack
     * @throws StackException Stack Underflow
     */
    public int pop() throws StackException {
        if (this.tos < 0) {
            throw new StackException("Stack Underflow:could not pop");
        } else
            return this.array[this.tos--];
    }
    /**
     * Index of the element at the top of the stack
     *
     * @return Index of Generic Element
     */
    public int getTOS() {
        return this.tos;
    }
    /**
     * Representation of Stack Object
     *
     * @return String Representation
     */
    @Override
    public String toString() {
        return "Stack<size=" + this.size + ">";
    }
}
/**** StackException.java ****/
class StackException extends Exception {
    final private String message;
    public StackException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
/**** Main.java ****/

class Main3 {
    public static void main(String[] args) {
        int r;
        Stack stack = new Stack(10);
        Random random = new Random(1337);
        System.out.println("Created stack of size 10");
        System.out.println("Pushing integers onto stack...");
        while (true) {
            r = random.nextInt(100);
            System.out.println("Pushing " + r + "...");
            try {
                stack.push(r);
                System.out.println(
                        "Elements in Stack = " + (stack.getTOS() + 1)
                );
            } catch (StackException e) {
                System.err.println(e.getMessage());
                break;
            }
        }
    }
}
