public class FizzBuzz {
    public static void main(String[] args) {
        String[] arr = fizzBuzz(2, 16);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static String[] fizzBuzz(int start, int end) {
      String[] arr = new String[end - start];
      int i = start;
      while (i < end) {
         if (i % 3 == 0 && i % 5 == 0) {
             arr[i - start] = "FizzBuzz";
         }
         else if (i % 5 == 0) {
             arr[i - start] = "Buzz";
         }
         else if (i % 3 == 0) {
             arr[i - start] = "Fizz";
         } else {
             arr[i - start] = "" + i;
         }
         i++;
      }
      return arr;
    }
}
