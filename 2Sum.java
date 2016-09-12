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

static int numberOfPairs(int[] a, long k) {
    int numberPairs = 0;
    Map<Integer, Integer> contentsA = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
        contentsA.put(a[i], i);
    }

    Map<Integer, Integer> pairs = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
        int b = (int)(k - a[i]);
        if (contentsA.containsKey(b) && contentsA.get(b) != i) {
            if ((!pairs.containsKey(a[i]) && !pairs.containsKey((int)(k - a[i])))) {
                numberPairs++;
                pairs.put(a[i], (int)(k - a[i]));
                pairs.put((int)(k - a[i]), a[i]);
            }
        }
    }
    return numberPairs;
}
