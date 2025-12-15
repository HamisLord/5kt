package Алгосы;

public class SecondMinimum {
    public static int findSecondMin(int[] nums) {
        if (nums.length < 2) {
            return Integer.MAX_VALUE;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin || num != min) {
                secondMin = num;
            }
        }
        return secondMin;
    }

    public static void main(String[] args) {
        int[] nums = {5, 8, 12, 43, 68, 100, 54, 67, 15, 7};
        System.out.println(SecondMinimum.findSecondMin(nums));
    }
}
