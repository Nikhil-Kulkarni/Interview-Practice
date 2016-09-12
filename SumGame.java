/**
 * Given an array of numbers, find all possible combinations that sum to target
 */
public class SumGame {

    public static int numWays(int[] arr, int target, int uses) {
        int totalWays = 0;
        if (target == 0) {
            totalWays += 1;
        }
        if (target < 0) {
            int minElem = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < minElem) {
                    minElem = arr[i];
                }
            }
            if (target - minElem * uses < 0) {
                return 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                totalWays += numWays(arr, target - arr[i], uses);
            }
            else {
                if (uses > 0) {
                    totalWays += numWays(arr, target - arr[i], uses - 1);
                }
            }
        }
        return totalWays;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 1};

        System.out.println(numWays(arr, 1, 1));
    }
}
