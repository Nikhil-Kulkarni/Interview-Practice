import java.util.*;
public class OddNumbers {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        arr[3] = 1;
        arr[4] = 7;
        countOddNumber(arr, set);
        for (int n : set) {
            System.out.println(n);
        }
    }

    public static void countOddNumber(int[] arr, HashSet<Integer> set) {
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                set.remove(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
    }
}
