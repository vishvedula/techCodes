/**
Sample Input 0

6
4 6 5 3 3 1

Sample Output 0

3

Explanation 0

We choose the following multiset of integers from the array: {4,3,3}
. Each pair in the multiset has an absolute difference (i.e.|4-3|, and |3-3| =0), so we print the number of chosen integers, 3, as our answer.

Sample Input 1

6
1 2 2 3 1 2 

Sample Output 1

5

Explanation 1

We choose the following multiset of integers from the array:{1,2,2,1,2}
. Each pair in the multiset has an absolute difference , so we print the number of chosen integers, , as our answer.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    List list = null;
    List finalList = new ArrayList<Integer>();
    Collections.sort(a); // 1 2 2 3 1 2 --> 1,1,2,2,2,3 
    					 // 4 6 5 3 3 1 --> 1,3,3,4,5,6

    for(int i=0; i< a.size()-1; i++){
    	list = new ArrayList<>();
    	list.add(a.get(i));
    	for(int j=i+1 ; j< a.size()-1; j++){
        	if(Math.abs(a.get(i)-a.get(j)) <=1){
        		list.add(a.get(j));
        	} else{
        		break;
        	}

    	}
    	finalList.add(list.size());
    }
    Collections.sort(finalList);
    //int output = Collections.max(finalList);
    return (int)finalList.get(finalList.size()-1);
    }
    
   

}

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.pickingNumbers(a);


        bufferedReader.close();
    }
}
