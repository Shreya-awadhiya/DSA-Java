import java.util.LinkedList;


public class CycleOrNot {
    

    public static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public boolean hasCycle(ListNode head) {
    
     ListNode slow = head;
     ListNode fast = head;

     while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            return true;
        }
     }       
     return false;
    }

    public static void main(String[] args) {
         ListNode head = new ListNode(1);
         head.next = new ListNode(2);
         head.next.next = new ListNode(5);
         head.next.next.next = new ListNode(8);
         
         head.next.next.next.next =  head.next;

         CycleOrNot obj = new CycleOrNot();

         System.out.println(obj.hasCycle(head));
    }
}
