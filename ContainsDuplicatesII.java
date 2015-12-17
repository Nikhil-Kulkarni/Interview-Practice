// Given an array of integers and an integer k, return true if and only
// if there are two distinct indices i and j in the array such that nums[i] = nums[j]
// and the difference between i and j is at most k.

public boolean containsDuplicates(int[] arr, int k) {
    //     <Value,   Index>
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < arr.length; i++) {
        if (map.containsKey(arr[i])) {
            int tIndex = map.get(arr[i]);
            if (i - tIndex <= k) {
                return true;
            }
        }
        map.put(arr[i], i);
    }
    return false;
}
