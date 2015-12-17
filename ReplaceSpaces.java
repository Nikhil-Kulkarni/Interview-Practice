// Write a method to replace all spaces in a string with '%20'
public void replaceSpaces(char[] arr, int length) {
    int spaceCount = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] = ' ') {
            spaceCount++;
        }
    }
    int newLength = length + spaceCount * 2;
    for (int j = length - 1; j >= 0; j--) {
        if (arr[j] == ' ') {
            arr[newLength - 3] = '%';
            arr[newLength - 2] = '2';
            arr[newLength - 1] = '0';
            newLength -= 3;
        } else {
            arr[newLength - 1] = arr[j];
            newLength -= 1;
        }
    }
}
