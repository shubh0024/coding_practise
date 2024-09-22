package com.company;



class Solution
{
    long substrCount (String S, int K) {
        // your code here
        int n = S.length();
        int[] count = new int[26]; // Assuming the input contains lowercase English letters

        int left = 0; // Left boundary of the window
        int distinctCount = 0; // Number of distinct characters in the current window
        long result = 0; // Count of substrings with exactly K distinct characters

        for (int right = 0; right < n; right++) {
            char charRight = S.charAt(right);
            if (count[charRight - 'a'] == 0) {
                distinctCount++;
            }
            count[charRight - 'a']++;

            // Adjust the left boundary of the window if the distinct count exceeds K
            while (distinctCount > K) {
                char charLeft = S.charAt(left);
                count[charLeft - 'a']--;
                if (count[charLeft - 'a'] == 0) {
                    distinctCount--;
                }
                left++;
            }

            // If distinctCount is exactly K, increment the result by the length of the valid substring
            if (distinctCount == K) {
                result += (right - left )+ 1;
            }
        }

        return result;
    }
}
public class solution{
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String S1 = "aba";
        int K1 = 2;
        long result1 = solution.substrCount(S1, K1);
        System.out.println("Example 1 Output: " + result1); // Output: 3

        // Example 2
        String S2 = "abaaca";
        int K2 = 1;
        long result2 = solution.substrCount(S2, K2);
        System.out.println("Example 2 Output: " + result2); // Output: 7
    }
}