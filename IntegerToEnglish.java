// write a function that takes in an int and returns a string
// that would be how one would say that number
import java.util.*;
public class IntegerToEnglish {
    public static void main(String[] args) {
        System.out.println(intToString(1234));
    }

    public static String intToString(int num) {
        StringBuilder str = new StringBuilder();
        HashMap<Integer, String> map = setup();

        int n = 1;
        while (num != 0) {
            int s = num % 10;
            int last = (num % 10) * n;
            if (n == 100) {
                str.append("hundred ");
            }
            if (n == 1000) {
                str.append("thousand ");
            }
            if (map.containsKey(s)) {
                str.append(map.get(s) + " ");
            }
            num /= 10;
            n *= 10;
        }
        return str.toString();
    }

    public static HashMap<Integer, String> setup() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(20, "twenty");
        map.put(30, "thirty");
        map.put(40, "fourty");
        map.put(60, "sixty");
        map.put(70, "seventy");
        map.put(80, "eighty");
        map.put(90, "ninety");
        return map;
    }
}
