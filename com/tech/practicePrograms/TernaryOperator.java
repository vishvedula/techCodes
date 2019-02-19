/**
 * Weird and important behavior of Java Ternary Operator
 * @author vivedula
 *
 */

public class PracticeChar {
	public static void main(String args[]){
		char x = 'X';
		int i=0;
		System.out.print(true ? x: 0 ); // prints X
		System.out.print(false ? i: x); // prints 88
		
		// When a false ternary condition is met, the output would be the input representation of the Character
		// int(x) --> 88
	}
	
}
