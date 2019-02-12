package clientilifo;

/**
 *
 * @author Yolanda
 */
public class TestFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try { //Case1: test defacult constructor
         IntStack stk = new IntStack();
         System.out.println("Case#1: capacity = " + stk.getCapacity() +
                            " ; length = " + stk.getLength());
      } catch(Exception e) {
         System.out.println("Case#1 crashed: " + e.toString());
      }
      try { //Case2: test non-default constructor
         IntStack stk = new IntStack(5);
         System.out.println("Case#2: capacity = " + stk.getCapacity() +
                            " ; length = " + stk.getLength());
      } catch(Exception e) {
         System.out.println("Case#2 crashed: " + e.toString());
      }
      try { //Case3: test push
         IntStack stk = new IntStack(5);
         stk.push(2001); stk.push(2002); stk.push(2003);
         System.out.println("Case#3: contents = " + stk.toString() +
                            " ; length = " + stk.getLength());
      } catch(Exception e) {
         System.out.println("Case#3 crashed: " + e.toString());
      }
      try { //Case4: test push with overflow
         IntStack stk = new IntStack(5);
         for (int i = 0; i <= 6; i++) 
            stk.push(2001 + i);
         System.out.println("Case#4: contents = " + stk.toString() +
                            " ; length = " + stk.getLength());
      } catch(Exception e) {
         System.out.println("Case#4 crashed: " + e.toString());
      }
      try { //Case5: test push and pop
         System.out.println("Case#5 ");
         IntStack stk = new IntStack(5);
         stk.push(2001); stk.push(2002); stk.push(2003);
         System.out.println("   pushing " + stk.toString());
         System.out.println("   popping " + stk.pop());
         System.out.println("   popping " + stk.pop());
         System.out.println("   stack= " + stk.toString());       
      } catch(Exception e) {
         System.out.println("Case#5 crashed: " + e.toString());
      }
      try { //Case6: test popping all
         System.out.println("Case#6 ");
         IntStack stk = new IntStack(5);
         stk.push(2001); stk.push(2002); stk.push(2003);
         stk.pop();
         stk.push(99);
         System.out.print("   popping all remainings: ");
         while (!stk.isEmpty()) 
            System.out.print(" " + stk.pop() + " ");
         System.out.println("\n   stack= " + stk.toString());       
      } catch(Exception e) {
         System.out.println("Case#6 crashed: " + e.toString());
      }
      try { //Case7: test setCapacity
         IntStack stk = new IntStack(5);
         stk.push(2001); stk.push(2002); stk.push(2003);
         stk.setCapacity(10);
         System.out.println("Case#7: capacity = " + stk.getCapacity() +
                            " ; length = " + stk.getLength() +
                            " ; stack = " + stk.toString());
      } catch(Exception e) {
         System.out.println("Case#7 crashed: " + e.toString());
      }
    }
    
}
