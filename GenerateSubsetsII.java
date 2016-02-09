import java.util.*;
public class GenerateSubsetsII {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int[] arr = new int[3];
        arr[0] = 1;
        arr[2] = 3;
        arr[1] = 2;
        ArrayList<ArrayList<Integer>> l = powerSet(arr, arr.length);
        for (ArrayList<Integer> li : l) {
            for (int num : li) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> generateSubsets(ArrayList<Integer> list) {
        ArrayList<ArrayList<Integer>> sets  = new ArrayList<>();
        sets.add(new ArrayList<Integer>());
        for (int i = 0; i < list.size(); i++) {
        	int size = sets.size();
        	for (int j = 0; j < size; j++) {
            	ArrayList<Integer> curr = new ArrayList<>(sets.get(j));
            	curr.add(list.get(i));
            	sets.add(curr);
            }
        }
        return sets;
    }

    public static ArrayList<ArrayList<Integer>> powerSet(int[] arr, int n) {
        int setSize = (int)Math.pow(2, arr.length);
        int counter = 0;
        ArrayList<ArrayList<Integer>> sets = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> result = new ArrayList();
        for (counter = 0; counter < setSize; counter++) {
            for (int j = 0; j < n; j++) {
                if ((counter & 1 << j) != 0) {
                    result.add(arr[j]);
                }
            }
            sets.add(new ArrayList<Integer>(result));
            result.clear();
        }
        return sets;
    }
}
