import java.util.*;
public class Derivative {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 4};
        System.out.println(derivation(arr));
    }

    public static String derivation(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i)*arr[i];
        }
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 1) {
                if (i != arr.length - 1) {
                    ret.append(arr[i] + " + ");
                } else{
                    ret.append(arr[i]);
                }
            } else if (i != 0) {
                if (i == arr.length - 1) {
                    ret.append(arr[i] + "x^" + (i-1));
                } else {
                    ret.append(arr[i] + "x^" + (i-1) + " + ");
                }
            }
        }
        return ret.toString();
    }

}
