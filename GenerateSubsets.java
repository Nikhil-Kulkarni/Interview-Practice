// Given a set of distinct integers, S, return all possible subsets.

// O(n*2^2) -- Inefficient solution
public ArrayList<Integer> powerSet(int[] arr, int n) {
    int setSize = Math.pow(2, arr.length);
    int counter = 0;
    ArrayList<Integer> result = new ArrayList();
    for (counter = 0; counter < setSize; counter++) {
        for (int j = 0; j < n; j++) {
            if (counter & 1 << j) {
                result.add(arr[j]);
            }
        }
    }
    return result;
}

// Better solution
public ArrayList<ArrayList<Integer>> subsets(int[] S) {
	if (S == null)
		return null;
	Arrays.sort(S);
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	for (int i = 0; i < S.length; i++) {
		ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
		//get sets that are already in result
		for (ArrayList<Integer> a : result) {
			temp.add(new ArrayList<Integer>(a));
		}
		//add S[i] to existing sets
		for (ArrayList<Integer> a : temp) {
			a.add(S[i]);
		}
		//add S[i] only as a set
		ArrayList<Integer> single = new ArrayList<Integer>();
		single.add(S[i]);
		temp.add(single);
		result.addAll(temp);
	}
	//add empty set
	result.add(new ArrayList<Integer>());
	return result;
}
