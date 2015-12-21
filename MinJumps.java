public class MinJumps {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr, 0, arr[0], 0));
    }

    public static int minJumps(int[] arr, int curr, int dist, int n) {
        if (curr == arr.length - 1) {
            return n;
        }
        int ways = Integer.MAX_VALUE;
        if (dist != 0) {
            for (int i = 1; i <= dist && curr + i < arr.length; i++) {
                int numJumps = minJumps(arr, curr + i, arr[curr + i], n + 1);
                if (numJumps < ways) {
                    ways = numJumps;
                }
            }
        } else {
            return 0;
        }
        return ways;
    }

    public static int minJumpsDP(int[] arr) {
            int[] grid = new int[arr.length];
            for (int i = 0; i < grid.length; i++) {
                int min = Integer.MAX_VALUE;
                int steps = 0;
                for (int j = 1; j <= arr[i]; j++) {
                    
                }
            }
    }
}
