// Given an array of integers, find two numbers that sum to the given target

public int[] twoSum(int[] arr, int target) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>
    int[] ret = new int[2];
    for (int i = 0; i < arr.length; i++) {
        if (map.containsKey(arr[i])) {
            ret[0] = i;
            ret[1] = map.get(arr[i]);
            return ret;
        } else {
            map.put(target - arr[i], i);
        }
    }
    return ret;
}
