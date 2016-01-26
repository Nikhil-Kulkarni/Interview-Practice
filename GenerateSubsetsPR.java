import java.util.*;
public class GenerateSubsetsPR {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<ArrayList<Integer>> l = generateSubsets(list);
        for (ArrayList<Integer> li : l) {
            for (int num : li) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> generateSubsets(ArrayList<Integer> list) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<Integer>());
        for (int i = 0; i < list.size(); i++) {
            int size = subsets.size();
            for (int j = 0; j < size; j++) {
                ArrayList<Integer> current = new ArrayList<Integer>(subsets.get(j));
                current.add(list.get(i));
                subsets.add(current);
            }
        }
        return subsets;
    }
}
