// Find the missing number from pairs of numbers
public class FindElem {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 5, 7, 7, 4};
        System.out.println(findElem(arr));
    }

    public static int findElem(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total ^= arr[i];
        }
        return total;
    }
}
