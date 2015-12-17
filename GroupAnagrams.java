// Given a list of anagrams, return a list of anagrams grouped together

public ArrayList<ArrayList<String>> groupAnagrams(String[] words) {
    HashMap<String, ArrayList<String>> map = new ArrayList();
    for (int i = 0; i < words.length; i++) {
        char[] arr = words[i].toCharArray();
        Array.sort(i);
        String sorted = new String(arr);
        if (!map.containsKey(sorted)) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(words[i]);
            map.put(sorted, list);
        } else {
            ArrayList<String> list = map.get(sorted);
            list.add(words[i]);
        }
    }
    return map.values();
}
