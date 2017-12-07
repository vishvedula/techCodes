/**
 * Chef’s girlfriend's birthday is near, so he wants to surprise her by making a special cake for her. 
 * Chef knows that his girlfriend likes cherries on the cake, so he puts cherries on the top of the cake, but he was not satisfied. Therefore, he decided to replace some of the cherries to make a beautiful pattern. However, Chef has a lot of other work to do so he decided to ask for your help.

The cherries are of two colors red and green. Now Chef wants the cherries to be placed in such a 
way that each cherry of one color must be adjacent to only cherries of the other color, 
two cherries are adjacent if they share a side. Now Chef has asked for your help in making that pattern on the cake.

You can replace any cherry of given color with the other color. 
But there is a cost for each replacement: if you replace a red cherry with a green one, the cost is 5 units 
and if you replace a green cherry with a red one, the cost is 3 units.

Help your friend Chef by making the cake special with minimum cost.
Input

    The first line of the input contains a single integer T denoting the number of test cases. 
    The description of T test cases follows.
    The first line of each test case contains two space-separated integers N and M, where N × M are the dimensions of the cake.
    Each of the next N lines contains a string of length M.

Output

For each test case, output the minimum cost required to make the cake special.
Constraints

    1 ≤ T ≤ 100
    1 ≤ N, M ≤ 100
    each string consists only of letters 'R' and 'G' denoting red and green cherries respectively 

Example

Input:

2
4 5
RGRGR
GRGRG
RGRGR
GRGRG
2 3
RRG
GGR

Output:

0
8


 * @author vivedula
 *
 */
public class ChefsCake {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//char chefCakeSpoilt[][] = {{'R','R','G'}, {'G','G','R'}}; // 3x3 matrix
		//char chefCakeSpoilt[][] = {{'R','G','G','R','G','R'},{'G','R','G','R','G','R'},{'R','R','G','G','R','G'},{'G','R','G','R','G','R'}}; // 6x6 matrix
		char chefCakeSpoilt[][] = {{'R','G','R','R','G'},{'R','G','G','R','R'},{'R','R','G','R','G'}};
		arrangeCake(chefCakeSpoilt);
	}

		private static 	void arrangeCake(char[][] cake){
			int row = cake.length+1;
			int column= cake[0].length;
			int unit = 0;
			boolean isNeeded = false;
			for(int i=0; i<row-1; i++){
				for(int j=0; j < column-1; j++){
					if(cake[i][j]==cake[i][j+1]){
						if(cake[i][j] == 'R'){
							unit = unit + 5;
						} else{
							unit = unit +3;
						}
						cake[i][j+1] = cake[i][j+2];
						cake[i][j+2] = cake[i][j];
						j--;
						isNeeded = true;
					} 
				}
				
			}
			
			if(isNeeded){
				System.out.println("Total cost unit is "+ unit);
				System.out.println("Changes Done !!");
			} else {
				System.out.println("Change not needed");
			}
		}
		
}
