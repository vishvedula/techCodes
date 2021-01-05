/*
FaceBook interview question

Given an array of integers. 
We have to find the max element of the array, which is at multiple places in the array and return any one of the "indices" randomly.

So we need to modify the existing array , with the "Indexes" of the maximum value.

In this case 5 which is max : we need to have the array modified to [3,5,8]

*/

import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class MaxArrayAndRandom {

    public static void main(final String args[]) {
        final int[] a = { 0, 3, 2, 5, 4, 5, 1, 0, 5 };
        findMaxArrayAndRandomIndex(a);
    }

    static void findMaxArrayAndRandomIndex(final int[] a) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                count = 0;
                max = a[i];
                maxIndex = i;
                a[count++] = i;
            } else if (a[maxIndex] == a[i]) {
                a[count++] = i;
                a[i] = 0;
            } else {
                a[i] = 0;
            }
        }
        a[maxIndex] = 0;

       
        System.out.println("Count of manx element is " + count);
        System.out.println(Arrays.toString(a));

            Random random = new Random();
            int r = random.nextInt(count);
            System.out.println(a[r]);
        


    }

}
