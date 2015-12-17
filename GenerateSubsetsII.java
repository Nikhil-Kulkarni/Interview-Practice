public class GenerateSubsetsII {
    public static void main(String[] args) {

    }

    public ArrayList<ArrayList<Integer>> generateSubsets(ArrayList<Integer> list) {
        ArrayList<ArrayList<Integer>> sets  = new ArrayList<>();
        sets.add(new ArrayList<Integer>());
        for (int i = 0; i < list.size(); i++) {
        	int size = sets.size();
        	for (int j = 0; j < size; j++) {
            	ArrayList<Integer> curr = new ArrayList<>(sets.get(j));
            	curr.add(list.get(i));
            	sets.add(curr);
            }
        }
        return sets;
        }
}
