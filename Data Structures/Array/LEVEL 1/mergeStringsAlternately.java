public class mergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int ptr1 = 0;
        int ptr2 = 0;
        int index = 0;
        char[] result = new char[word1.length() + word2.length()];

        while (ptr1 < word1.length() || ptr2 < word2.length()) {
            if (ptr1 < word1.length()) {
                result[index++] = word1.charAt(ptr1++);
            }
            if (ptr2 < word2.length()) {
                result[index++] = word2.charAt(ptr2++);
            }
        }

        return new String(result);
    }
}


