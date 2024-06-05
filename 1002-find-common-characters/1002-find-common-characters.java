class Solution {
    public List<String> commonChars(String[] A) {
        int[] count = new int[26]; 
        Arrays.fill(count, Integer.MAX_VALUE);
        for (String str : A) {
            int[] cnt = new int[26];
            str.chars().forEach(c -> ++cnt[c - 'a']); // count each char's frequency in string str.
            IntStream.range(0, 26).forEach(i ->  count[i] = Math.min(cnt[i], count[i])); // update minimum frequency.
        }
        List<String> ans = new ArrayList<>();
        IntStream.range('a', 'z' + 1).forEach(c ->  ans.addAll(Collections.nCopies(count[c - 'a'], "" + (char)c)));
        return ans;
    }
}