public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 8, 3, 8, 9, 8};
        System.out.println(majority(arr));
    }

    public static int majority(int[] arr) {
        int votes = 0;
        int majorityElement = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != majorityElement) {
                votes--;
                if (votes == 0) {
                    majorityElement = arr[i];
                    votes++;
                }
            } else {
                votes++;
            }
        }
        return majorityElement;
    }
}
