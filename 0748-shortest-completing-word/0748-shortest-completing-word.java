import java.util.Arrays;

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        // Step 1: Normalize the license plate
        String str = licensePlate.toLowerCase();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                s.append(str.charAt(i));
            }
        }
        char[] arr1 = s.toString().toCharArray();
        Arrays.sort(arr1);

        String result = null;

        // Step 2: Check each word in the words array
        for (String word : words) {
            String sub = word.toLowerCase();
            char[] ch = sub.toCharArray();
            Arrays.sort(ch);

            int k = 0;
            for (int j = 0; j < ch.length && k < arr1.length; j++) {
                if (arr1[k] == ch[j]) {
                    k++;
                }
            }

            // Step 3: If the word can complete the license plate and is the shortest so far
            if (k == arr1.length) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }
}
