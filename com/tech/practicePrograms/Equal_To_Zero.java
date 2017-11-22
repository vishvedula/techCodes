/*Equal To Zero (100 Marks)
You will be given an array and you need to find those three elements whose sum are equal to 0. If found print True to the stdout else print False.

Note: The length of the array should not be less than 3.

Input Format
You will be taking a number as an input stdin which tells about the length of the array. On another line, array elements should be there with single space between them.

Constraints
1 <= L <= 1000
1 <= Ai <= 1000

Output Format
You need to print True if found those numbers else print False.

Sample TestCase 1
Input

6
70 69 44 -28 -16 79

Output

True*/


import java.util.ArrayList;
import java.util.List;

public class SumOfZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Integer> list = new ArrayList<Integer>(){{
			 add(70);
			 add(69);
			 add(44);
			 add(1);
			 add(-28);
			 add(-17);
			 add(79);
			 	
		 }};
		 
		 List<Integer> negList = new ArrayList<>();
		 
		 int sum =0;
		 int sum1 = 0;
		 boolean isTrue = false;
		 
		 for(int i=0 ; i<list.size(); i++){
			 if(list.get(i) < 0){
				 sum+= list.get(i);
				 negList.add(list.get(i));
				 list.remove(list.get(i));
				 i--;
			 }
		 }
		 sum = Math.abs(sum); // Marking -ve to +ve for below code 
		 for(int j=0; j<list.size()-1; j++){
				if(list.get(j) <= sum ){
					if(list.get(j) == sum){
						isTrue = true;
						break;
					} else{
						sum1+= list.get(j);
					}
				}
					
			}
		 if(isTrue){
			 System.out.println("true");
		 } else if(sum == sum1){
			 System.out.println("true");
		 } else {
			 System.out.println("false");
		 }
		 
	}

}
