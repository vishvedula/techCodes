import java.util.Stack; 
/**
 * Consider the following SpecialStack
16  --> TOP
15
29
19
18

When getMin() is called it should return 15, which is the minimum 
element in the current stack. 

If we do pop two times on stack, the stack becomes
29  --> TOP
19
18

When getMin() is called, it should return 18 which is the minimum 
in the current stack.  
 * @author vivedula
 *
 */
/* A class that supports all the stack operations and one additional 
operation getMin() that returns the minimum element from stack at 
any time. This class inherits from the stack class and uses an 
auxiliarry stack that holds minimum elements */
  
class SpecialStack extends Stack<Integer> 
{ 
    Stack<Integer> min = new Stack<>(); 
      
    /* SpecialStack's member method to insert an element to it. This method 
    makes sure that the min stack is also updated with appropriate minimum 
    values */
    void push(int x) 
    { 
        if(isEmpty() == true) 
        { 
            super.push(x); 
            min.push(x); 
        } 
        else
        { 
            super.push(x); 
            int y = min.pop(); 
            //min.push(y); 
            if(x < y) 
                min.push(x); 
            else
                min.push(y); 
        } 
    } 
  
    /* SpecialStack's member method to insert an element to it. This method 
    makes sure that the min stack is also updated with appropriate minimum 
    values */
    public Integer pop() 
    { 
        int x = super.pop(); 
        min.pop(); 
        return x; 
    } 
  
    /* SpecialStack's member method to get minimum element from it. */
    int getMin() 
    { 
        int x = min.pop(); 
        min.push(x); 
        return x; 
    } 
  
    /* Driver program to test SpecialStack methods */
    public static void main(String[] args)  
    { 
        SpecialStack s = new SpecialStack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.getMin()); 
        s.push(5); 
        System.out.println(s.getMin()); 
    } 
} 