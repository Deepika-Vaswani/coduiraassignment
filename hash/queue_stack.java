import java.util.*;
public class queue_stack{
   private Stack stack1 = new Stack<>();
   private Stack stack2 = new Stack<>();
   public void enqueue(int element) {
      stack1.push(element);
      System.out.println(element + " inserted");
   }
   public void dequeue() {
      if(stack2.isEmpty()) {
         while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
         }
      }
      System.out.println("removed element is " + stack2.pop());
      System.out.println("removed element is " + stack2.pop());
   }
   public static void main(String args[]) {
    queue_stack test = new queue_stack();
      test.enqueue(20);
      test.enqueue(50);
      test.enqueue(90);
      test.enqueue(40);
      test.enqueue(65);
      
      test.dequeue();
   }
}
   