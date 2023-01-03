package org.example;

// Big O(logn)
public class BinarySearch {
/**   Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *    You must write an algorithm with O(log n) runtime complexity. **/
    private int searchInsert(int[] nums, int target) {
        int mid=0,left=0,right = nums.length-1;

        while(left<=right){
            mid = (left+right)/2; // avoid integer overflow -> left + (right - left)/2

            if(target == nums[mid])
                return mid;
            else if(target>nums[mid])
                left = mid + 1;
            else
                right = mid - 1;

        }
        return left;
    }
    private int search(int[] nums, int target) {
        int mid,left=0,right = nums.length-1;

        while(left<=right){
            mid = (left+right)/2; // avoid integer overflow -> left + (right - left)/2

            if(target == nums[mid])
                return mid;
            else if(target>nums[mid])
                left = mid + 1;
            else
                right = mid - 1;

        }
        return 0;
    }
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(new int[]{-1,0,3,5,9,12},9));
    }
}