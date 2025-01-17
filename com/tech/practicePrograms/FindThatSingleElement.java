/**Given an array where every element occurs three times, 
#except one element which occurs only once. 
#Find the element that occurs once.

# Note: Expected time complexity is O(n) and O(1) extra space.

# Examples:

# Input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3} 
# Output: 2 
# In the given array all element appear three times except 2 which appears once.


# Input: arr[] = {10, 20, 10, 30, 10, 30, 30} 
# Output: 20 
# In the given array all element appear three times except 20 which appears once. 


# Input: arr[] = {10} 
# Output: 10
**/
import java.util.*;

public class findSingleElement {
    public static void main(String args[]){
        int[] arr = {1,2,3,3,3,12,12,12} ;//{12, 1, 12, 3, 12, 1, 1, 2, 3, 3} ;
        int result = findThatElement(arr);
        }
        
    private static int findThatElement(int arr[]){ 
        Arrays.sort(arr);
        int count = 0;
        if(arr.length > 1){
            count = 1;
            }
        // {1,1,1,2,3,3,3,12,12,12} ; {1,2,3,3,3,12,12,12} ;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
                continue; 
            } else if(count>1){
                count=1;
                continue;
            } else {
                return arr[i];   
            }
                
        }
        return 1;
    }
}
