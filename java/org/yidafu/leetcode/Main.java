package org.yidafu.leetcode;

public class Main {
    public static void main(String args[]) {
        System.out.println( new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb")) ;
        System.out.println( new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring_slidingWindow("abcabcbb")) ;
        System.out.println( new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring_slidingWindow_optimized("abcabcbb")) ;
    }
}
