// Given an array of interger, find three numbers, their sum is target.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, -4, 0, -5};
        ArrayList<ArrayList<Integer>> sol = allTriplets(arr, 0);
        for (int i = 0; i < sol.size(); i++) {
            for (int j = 0; j < sol.get(i).size(); j++) {
                System.out.print(sol.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> findInts(int[] arr, int target) {
        ArrayList<Integer> solution = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (set.contains(target - (-1 * arr[i] + -1 * arr[j]))) {
                    solution.add(arr[i]);
                    solution.add(arr[j]);
                    solution.add(target - (-1 * arr[i] + -1 * arr[j]));
                    return solution;
                }
            }
        }
        return solution;
    }

    // Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
    // Find all unique triplets in the array which gives the sum of zero.
    // O(n^2) solution;
    public static ArrayList<ArrayList<Integer>> allTriplets(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> s = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                int j = i + 1;
                int k = arr.length - 1;
                while (j < k) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ArrayList<Integer> l = new ArrayList<Integer>();
                        l.add(arr[i]);
                        l.add(arr[j]);
                        l.add(arr[k]);
                        s.add(l);

                        j++;
                        k--;

                        while (arr[j] == arr[j - 1]) {
                            j++;
                        }
                        while (arr[k] == arr[k - 1]) {
                            k--;
                        }
                    }
                    else if (arr[i] + arr[j] + arr[j] < 0) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
        return s;
    }
}
