// Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.
// Input:
// 1 2 3
// 4 5 6
// 7 8 9
// Return the following :
// [
//   [1],
//   [2, 4],
//   [3, 5, 7],
//   [6, 8],
//   [9]
// ]

public ArrayList<ArrayList<Integer>> antiDiagonals(int[] arr) {
    ArrayList<ArrayList<Integer>> result = new ArrayList();
	    int i = 0;
	    int j = 0;

	    int n = a.size();

	    int x = 0;
	    int y = 0;

	    while(x <= n - 1 && y <= n - 1) {
	        i = x;
	        j = y;
	        ArrayList<Integer> temp = new ArrayList();
    	    while (i < n && j >= 0) {
    	        temp.add(a.get(i).get(j));
    	        i++;
    	        j--;
    	    }
    	    result.add(temp);
    	    if (y == n - 1) {
	            x++;
	        } else {
	            y++;
	        }
	    }
	    return result;
}
