import java.util.*;
public class SecondHighestRepeat {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 6;
        arr[2] = 5;
        arr[3] = 5;
        arr[4] = 6;
        System.out.println(secondHighest(arr));
    }

    public static int secondHighest(int[] arr) {
        HashSet<Integer> map = new HashSet<>();
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (map.contains(arr[i])) {
                if (arr[i] > highest) {
                    int temp = highest;
                    highest = arr[i];
                    secondHighest = temp;
                }
                else if (arr[i] > secondHighest) {
                    secondHighest = arr[i];
                }
            } else {
                map.add(arr[i]);
            }
        }
        return secondHighest;
    }
}
