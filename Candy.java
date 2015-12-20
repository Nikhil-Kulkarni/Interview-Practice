public class Candy {
    public static void main(String[] args) {
        int[] ratings = {4, 2, 1, 5, 3};
        System.out.println(candy(ratings));
    }

    public static int candy(int[] ratings) {
        int[] arr = new int[ratings.length];
        arr[0] = 1;
        int prev = arr[0];
        for (int i = 1; i < ratings.length; i++) {
            if (arr[i] > prev) {
                arr[i] = arr[i - 1] + 1;
            } else {
                arr[i] = 1;
            }
        }
        int result = ratings[ratings.length - 1];
        for (int i = ratings.length - 2; i >= 0; i--) {
    		int cur = 1;
    		if (ratings[i] > ratings[i + 1]) {
    			cur = arr[i + 1] + 1;
    		}
    		result += Math.max(cur, arr[i]);
    		arr[i] = cur;
        }
        return result;
    }
}
