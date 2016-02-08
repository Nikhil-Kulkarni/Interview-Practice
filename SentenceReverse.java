public class SentenceReverse {
    public static void main(String[] args) {
        System.out.println(reverse("Hello world".toCharArray()));
    }

    public static char[] reverse(char[] sentence) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] == ' ' || i == sentence.length - 1) {
                int m = start;
                int n = end;
                while (m < n) {
                    char swap = sentence[m];
                    sentence[m] = sentence[n];
                    sentence[n] = swap;
                    m++;
                    n--;
                }
                start = end + 1;
                end++;
            } else {
                end++;
            }
        }
        return sentence;
    }
}
