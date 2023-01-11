package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedSquaredArray {

    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums)
                .map(x -> x * x)
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        SortedSquaredArray ss = new SortedSquaredArray();
        var ans = ss.sortedSquares(new int[]{-1, 0, 3, 5, 9, 12});
        for (int j = 0; j < ans.length; j++) {
            System.out.println(ans[j]);
        }
    }
}
