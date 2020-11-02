
public class LinkedListPalindrome {


/* Driver code*/
public static void main(String[] args)  
{  
   Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(2);
    head.next.next.next = new Node(1);
    //print(head);
   isPalindrome(head);
}

static void print(Node head){
    while(head!=null){
        System.out.print(head.data);
        head = head.next;
    }
}
 static boolean isPalindrome(Node head){
     String str = "";
        while(head!=null){
            str = str+String.valueOf(head.data);
           
            head= head.next;
        }

         System.out.println(str);
         
        StringBuffer str2 = new StringBuffer(str);
        String strFinal = str2.reverse().toString();
        System.out.println("====");
        System.out.println(strFinal);
        if(str.equals(strFinal)){
            System.out.print(true);
            return true;
        }
        System.out.print(false);
      return false;
}

}


 class Node{
    Node next;
    int data;
    
    Node(int data){
        this.data= data;
        next = null;
    }
}
