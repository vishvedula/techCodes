/**
 * After getting her PhD, Christie has become a celebrity at her university, and her facebook profile is full of friend requests. Being the nice girl she is, Christie has accepted all the requests.

Now Kuldeep is jealous of all the attention she is getting from other guys, 
so he asks her to delete some of the guys from her friend list.

To avoid a 'scene', Christie decides to remove some friends from her friend list, 
since she knows the popularity of each of the friend she has, she uses the following algorithm to delete a friend.

Algorithm Delete(Friend):
    DeleteFriend=false
    for i = 1 to Friend.length-1
         if (Friend[i].popularity < Friend[i+1].popularity)
            delete i th friend
            DeleteFriend=true
            break
    if(DeleteFriend == false)
        delete the last friend

Input:
First line contains T number of test cases. First line of each test case contains N, 
the number of friends Christie currently has and K ,the number of friends Christie decides to delete. 
Next lines contains popularity of her friends separated by space.

Output:
For each test case print N-K numbers which represent popularity of Christie friend's after deleting K friends.

Constraints
1<=T<=1000
1<=N<=100000
0<=K< N
0<=popularity_of_friend<=100

NOTE:
Order of friends after deleting exactly K friends should be maintained as given in input.
SAMPLE INPUT

3
3 1
3 100 1
5 2
19 12 3 4 17
5 3
23 45 11 77 18

SAMPLE OUTPUT

100 1 
19 12 17 
77 18 


 * @author vivedula
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RemoveFriends {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t=0;t<testCases;t++){
			int noFrndsHave = scan.nextInt();
			int noFrndsRemove = scan.nextInt();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] str= br.readLine().split(" ");
			int[] a = new int[str.length];
			List<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<str.length; i++){
				list.add(Integer.parseInt(str[i]));
			}
			int count =0;
			removeFriends(list,noFrndsHave, noFrndsRemove, count);
		}
		

	}
	
	private static void removeFriends(List<Integer> list, int noFrndsHave, int noFrndsRemove, int count){
		List<Integer> finalList = new ArrayList<Integer>();
		for(int i=0;i<list.size()-1;i++){
				if(list.get(i) < list.get(i+1)){ 
					finalList.add(list.get(i));
					count++;
				}
				if(count == noFrndsRemove){
					break;
				}
		}
		list.removeAll(finalList);
		if(count != noFrndsRemove){
			removeFriends(list, noFrndsHave,  noFrndsRemove, count);
		}
		int result[] = new int[list.size()]; 
		for(int j=0;j<list.size(); j++){
				result[j] = list.get(j);
				System.out.print(result[j]);
				System.out.print(" ");

		}
		//return result;
	}

}
