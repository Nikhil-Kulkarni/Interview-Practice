public class ConvertBases {
    public static void main(String[] args) {
        System.out.println(convertBase(10, 9));
    }

    public static String convertBase(int num, int newBase) {
        String str = "";
        while (num != 0) {
            int n = num % newBase;
            str = n + str;
            num = num / newBase;
        }
        return str;
    }
}
