package app_java_3;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        int length = findLongestConsecutiveSubsequence(arr);
        System.out.println("Length of the longest consecutive subsequence: " + length);
    }

    public static int findLongestConsecutiveSubsequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int longestStreak = 0;

        // Step 1: Add all elements to the HashSet
        for (int num : arr) {
            set.add(num);
        }

        // Step 2: Iterate through the array and find the longest streak
        for (int num : arr) {
            // Check if 'num' is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count the length of the sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
