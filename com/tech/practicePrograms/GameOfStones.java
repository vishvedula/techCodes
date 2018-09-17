import java.util.Scanner;

/*
 * Two players called and are playing a game with a starting number of stones. 
 * Player always plays first, and the two players move in alternating turns. The game's rules are as follows:

    In a single move, a player can remove either 2,3 or 5 stones from the game board.
    If a player is unable to make a move, that player loses the game.

Given the starting number of stones, find and print the name of the winner. 
is named First and is named Second. Each player plays optimally, meaning they will not make a move that
 causes them to lose the game if a winning move exists.

For example, if , can make the following moves:

    removes stones leaving . will then remove stones and win.
    removes stones leaving . cannot move and loses.

would make the second play and win the game.

Input Format

The first line contains an integer , the number of test cases.
Each of the next lines contains an integer , the number of stones in a test case.

Constraints

Output Format

On a new line for each test case, print First if the first player is the winner. Otherwise print Second.

Sample Input

8
1
2
3
4
5
6
7
10

Sample Output

Second
First
First
First
First
First
Second
First

 */
public class GameOfStones {
	public static void main(String[] args) {
		System.out.println("Enter the number");
     Scanner scan = new Scanner(System.in);
		gamesOfStones(scan.nextInt());
	}

	static void gamesOfStones(int n){
		int counter =0;
		while (n != 0) {
			if(counter >=0 && n==1){
				break;
			}
			if (n >= 5) {
				n = n - 5;
				counter++;
			} else if (n >= 3) {
				n = n - 3;
				counter++;
			} else if (n >= 2) {
				n = n - 2;
				counter++;
			}
		}
		
		if(counter%2==0){
			System.out.println("Second");
		} else {
			System.out.println("First");
		}
	}
}
