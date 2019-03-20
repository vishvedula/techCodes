/**
 * lice is playing an arcade game and wants to climb to the top of the leaderboard and wants to track her ranking. The game uses Dense Ranking, so its leaderboard works like this:

    The player with the highest score is ranked number 

    on the leaderboard.
    Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.

For example, the four players on the leaderboard have high scores of
, , , and . Those players will have ranks , , , and , respectively. If Alice's scores are , and , her rankings after each game are , and . 

Sample Input: 
7
100 100 50 40 40 20 10
4
5 25 50 120

Sample Output 1
6
4
2
1
 * @author vivedula
 *
 */
import java.util.*;
public class ClimbingLeaderboard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<Integer>();
		list.add(100);
		list.add(100);
		list.add(50);
		list.add(40);
		list.add(40);
		list.add(20);
		list.add(10);
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		findLeaderBoardPosition(list, input);
	}
	
	static int findLeaderBoardPosition(List<Integer> list, int input){
		int count = 0;
		boolean traversed = false;
		Set set = new LinkedHashSet<Integer>();
		for(int i=0;i<list.size();i++){
			if(input < list.get(i)){
				traversed = true;
				if(!set.contains(list.get(i))){
					set.add(list.get(i));
					count++;
				}
			}else{
				traversed = false;
				count++;
				break;
			}
		}
		if(traversed){
			count++;
		}
		System.out.println(count);
		return count;
	}
}
