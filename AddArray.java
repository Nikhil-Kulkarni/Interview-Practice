public class AddArray {
    public static void main(String[] args) {
        int[] a = {9, 9, 9};
        int[] b = {2};
        int[] result = addArray(a, b);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
    }

    public static int[] addArray(int[] a, int[] b) {
        int i = a.length - 1;
        int j = b.length - 1;
        int[] arr = new int[Math.max(a.length, b.length)];
        int k = arr.length - 1;
        int carry = 0;
        int sum = 0;
        while (k >= 0) {
            int x = 0;
            int y = 0;
            if (i >= 0) {
                x = a[i];
                i--;
            }
            if (j >= 0) {
                y = b[j];
                j--;
            }
            sum = (x + y + carry) % 10;
            carry = (x + y + carry) / 10;
            arr[k] = sum;
            k--;
        }
        if (carry != 0) {
            arr = resize(arr);
            arr[0] = carry;
        }
        return arr;
    }

    public static int[] resize(int[] arr) {
        int[] newArr = new int[arr.length + 1];
        int k = newArr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--, k--) {
            newArr[k] = arr[i];
        }
        return newArr;
    }
}
