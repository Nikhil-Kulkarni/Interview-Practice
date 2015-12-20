import java.util.*;
public class Pascals {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int n = 4;
        generate(n, list, 0);
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.get(j).size(); i++) {
                System.out.print(list.get(j).get(i) + " ");
            }
            System.out.println();
        }
    }

    public static void generate(int n, ArrayList<ArrayList<Integer>> list, int k) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        if (k == n) {
            return;
        }
        if (k == 0) {
            row.add(1);
            list.add(row);
            generate(n, list, k + 1);
        } else {
            ArrayList<Integer> temp = list.get(k - 1);
            row.add(1);
            for (int i = 1; i < k; i++) {
                row.add(temp.get(i - 1) + temp.get(i));
            }
            row.add(1);
            list.add(row);
            generate(n, list, k + 1);
        }
    }

    public static ArrayList<ArrayList<Integer>> generateDP(int n) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    }
}
