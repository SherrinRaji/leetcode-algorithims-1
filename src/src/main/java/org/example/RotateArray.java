package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/how-to-left-or-right-rotate-an-array-in-java/
 */

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums.length > 1 && k > 0) {
            k = k % nums.length;
            System.out.println(k);
            List<Integer> numsList = new ArrayList<Integer>();
            for (int i = nums.length - k; i < nums.length; i++) {
                numsList.add(nums[i]);
            }
            for (int i = 0; i < nums.length - k; i++) {
                numsList.add(nums[i]);
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = numsList.get(i);
            }
        }
    }

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        ra.rotate(nums, 10);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
