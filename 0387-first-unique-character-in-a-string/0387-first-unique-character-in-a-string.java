class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] strArr = s.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            char current = strArr[i];
            if (map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }
        }

        for (int i = 0; i < strArr.length; i++) {
            char c = strArr[i];
            if (map.get(c) == 1) {
                return (i);
            }
        }
        return (-1);

    }
}