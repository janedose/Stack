import java.util.*;
/**
 * This class implements the ILifo interface and stores integers into the collection.
 * It also has the ability to pop integers out of the collection.
 */
public class IntStack implements ILifo {
    public static final int SENTINEL = -9999;      //sentinel integer for the array
    private int[]stack;
    /**
     * Constructs an IntStack object with the specified initial capacity.
     * @param initialCapacity Capacity of the object
     */
    public IntStack (int initialCapacity) {
        stack=new int[initialCapacity];
        for (int i=0; i<stack.length; i++) {
            stack[i]=SENTINEL;
        }
    }
    /**
     * Constructs an IntStack object with the default capacity, 5.
     */
    public IntStack () {
        this(5);
    }
    /**
     * This method returns the data in the IntStack object.
     * @return the string representation of this ILifo data structure
     */
    public String toString() {
        int[]currentStack=Arrays.copyOf(stack,getLength());       
        return Arrays.toString(currentStack);
    }
    /**
     * This method returns the number of integers currently in the data structure.
     * @return the length of the IntStack object
     */
    public int getLength() {
        int count =0;
        for (int i=0; i<stack.length; i++) {
            if (stack[i]!=SENTINEL) count++;
        }
        return count;
    }
    /**
     * This method determines whether the data structure is currently empty.
     * @return true if the collection is empty
     */
    public boolean isEmpty() {
        return stack[0]==SENTINEL;
    }
    /**
     * This method adds the passed-in integer to the collection.
     * @param num the desired integer
     */
    public void push(int num) {
        if (stack.length>getLength()) {
            for (int i=0; i<stack.length; i++) {
                if (stack[i]==SENTINEL) {
                    stack[i]=num;
                    break;
                }  
            }
        }   else {
            System.out.println("Container is full. No integer is pushed.");
        }
    }
    /**
     * This method removes the most recently added integer from the collection.
     * @return the integer that was just removed
     */
    public int pop() {
        if (getLength()>=1) {
            for (int i=stack.length-1; i>=0; i--) {
                if (stack[i]!=SENTINEL) {
                    int popped = stack[i];
                    stack[i]=SENTINEL;
                    return popped;
                }
            }
        } else {
            System.out.println("Container is empty. No integer is popped.");
        } return -1;
    }
    /**
     * This method returns the maximum amount of integers the data structure can hold.
     * @return the capacity of the data structure
     */
    public int getCapacity() {
        return stack.length;
    }
    /**
     * This method is used to expand the current data structure for increasing its capacity.
     * @param newCapacity the desired capacity
     * @return the new capacity of the data structure
     */
    public int setCapacity(int newCapacity) {
        int firstLength=stack.length;
        if (newCapacity>=firstLength) {
        stack=Arrays.copyOf(stack, newCapacity);
        for (int i=newCapacity-1; i>=firstLength; i--) {
            stack[i]=SENTINEL;
        }
        return newCapacity;
        } else {
            System.out.println("Cannot shrink capacity.");
        } return stack.length;
    }
}