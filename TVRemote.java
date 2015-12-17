// Given a TV remote with characters and n columns, print out direction to
// input a string.
public class TVRemote {
    public static void main(String[] args) {
        String str =  "feed";
        int n = 3;
        remote(str, n);
    }

    public static void remote(String str, int n) {
        int startRow = 0;
        int startCol = 0;
        for (int i = 0; i < str.length(); i++) {
            int endRow = (str.charAt(i) - 'a') / n;
            int endCol = (str.charAt(i) - 'a') % n;
            if (startCol != endCol || startRow != endRow) {
                while (startCol < endCol) {
                    System.out.print("RIGHT ");
                    startCol++;
                }
                while (startRow < endRow) {
                    System.out.print("DOWN ");
                    startRow++;
                }
                while (startCol > endCol) {
                    System.out.print("LEFT ");
                    startCol--;
                }
                while (startRow > endRow) {
                    System.out.print("UP ");
                    startRow--;
                }
            }
            System.out.print("PRESS ");
        }
    }
}
