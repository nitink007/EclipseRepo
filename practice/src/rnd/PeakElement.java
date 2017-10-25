package rnd;

import java.util.*;
import java.lang.*;
import java.io.*;
 
class PeakElement
{
    public static void main(String[] args) {
        int[] array = new int[]{5,2,9,3,1,1,1,2,234,12,8,999};

        System.out.println(nPeaks(array, 2));
    }

    static int nPeaks(int[] array, int range) {

        // Check for special cases
        if (array == null) {
            return 0;
        }

        int result = 0, l, r;

        // Check main body
        for (int i = 0; i < array.length; i++) {
            boolean isPeak = true;
            // Check from left to right
            l = Math.max(0, i - range);
            r = Math.min(array.length - 1, i + range);
            for (int j = l; j <= r; j++) {
                // Skip if we are on current
                if (i == j) {
                    continue;
                }
                if (array[i] < array[j]) {
                    isPeak = false;
                    break;
                }
            }

            if (isPeak) {
                System.out.println("Peak at " + i + " = " + array[i]);
                result++;
                i += range;
            }
        }

        return result;
    }
}