/*
FaceBook interview question

To print the max element and , get its indexes from the array, 

then print any random index by using Random class.

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
