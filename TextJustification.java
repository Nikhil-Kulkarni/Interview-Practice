import java.util.ArrayList;

public class TextJustification {
    public static void main(String[] args) {
        String[] arr =  {"This", "is", "an", "example", "of", "text", "justification."};
        ArrayList<String> test = textJustification(arr, 16);
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
    }

    public static ArrayList<String> textJustification(String[] arr, int length) {
        ArrayList<String> justified = new ArrayList<>();
        String currentLine = "";
        for (int i = 0; i < arr.length; i++) {
            if (currentLine.length() + (arr[i].length() + 1) <= length) {
                currentLine += arr[i] + " ";
            } else {
                currentLine = currentLine.substring(0, currentLine.length() - 1);
                justified.add(currentLine);
                currentLine = arr[i] + " ";
            }
        }
        currentLine = currentLine.substring(0, currentLine.length() - 1);
        justified.add(currentLine);
        return justified;
    }
}
