/*
Alice is a kindergarten teacher. She wants to give some candies to the children in her class.  All the children sit in a line and each of them has a rating score according to his or her performance in the class.  Alice wants to give at least 1 candy to each child. If two children sit next to each other, then the one with the higher rating must get more candies. Alice wants to minimize the total number of candies she must buy.

For example, assume her students' ratings are [4, 6, 4, 5, 6, 2]. She gives the students candy in the following minimal amounts: [1, 2, 1, 2, 3, 1]. She must buy a minimum of 10 candies. */

public class MinCandies {
    public static void main(String args[]) {
        int a[] = {4, 6, 4, 5, 6, 2}; // --> [1, 2, 1, 2, 3, 1] --> 10
        //int a[]=       {3,6,5,7,8,9,2,1,3}; //--> [1, 2, 1, 2, 1, 2, 3, 4, 2, 1] --> 19
        minCandies(a);
        
    }
    
    static long minCandies(int a[]){
        int[] resultArray = new int[arr.length];
        resultArray[0] = 1;
  
        // First fill the resultArray with basic logic
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] < arr[i]) {
                resultArray[i] = resultArray[i-1] + 1;
            }

            if (arr[i-1] >= arr[i]) {
                resultArray[i] = 1;
            }
        }

        // Modify the array based on the edge case scenarios
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > arr[i+1]) {
                if (resultArray[i] <= resultArray[i+1]) {
                    resultArray[i] = resultArray[i+1] + 1;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < resultArray.length; i++) {
            sum = sum+ resultArray[i];
        }

        return new Long(sum);
    }
}
