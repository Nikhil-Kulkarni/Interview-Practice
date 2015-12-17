// Given a collection of numbers, return all possible permutations.
import java.util.*;
public class Permutations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        permute(arr, list, new ArrayList<Integer>());
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.get(j).size(); i++) {
                System.out.print(list.get(j).get(i));
            }
            System.out.println();
        }
    }

    public static void permute(int[] arr, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> newList) {
        if (newList.size() == arr.length) {
            list.add(new ArrayList<Integer>(newList));
        }
        for (int i = 0; i < arr.length; i++) {
            newList.add(arr[i]);
            permute(arr, list, newList);
            newList.remove(new Integer(arr[i]));
        }
    }
}
