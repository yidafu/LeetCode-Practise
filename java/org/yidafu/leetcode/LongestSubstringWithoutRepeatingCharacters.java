package org.yidafu.leetcode;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if( s.length() == 0) {
            return 0;
        }
        ArrayList<Character> list = new ArrayList<Character>();
        list.add(  s.charAt( 0 ) );
        int index = 1,
            maxLength = 0;
        while( index < s.length() ) {
            Character _char_ = s.charAt( index );
            if( list.contains( _char_ ) ) {
                maxLength = Math.max( maxLength, list.size() );
                Iterator<Character> it = list.iterator();
                while( it.hasNext() ) {
                    Character now = it.next();
                    it.remove();
                    if ( now.equals( _char_ ) ) {
                        break;
                    }
                }
            }
            list.add( _char_ );
            index ++;
        }
        return Math.max( maxLength, list.size() );
    }

    public int lengthOfLongestSubstring_slidingWindow(String s){
        int length = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0 , j = 0;
        while( i < length && j < length ) {
            if( ! set.contains( s.charAt(j) ) ) {
                set.add( s.charAt( j ++ ) );
                ans = Math.max( ans, j - i );
            } else {
                set.remove( s.charAt( i ++ ) );
            }
        }
        return ans;
    }
    public int lengthOfLongestSubstring_slidingWindow_optimized(String s) {
        int length = s.length(),
            ans = 0;

        Map< Character, Integer > map = new HashMap<>();

        for( int index = 0, strPos = 0; index < length; ++ index ) {
            if( map.containsKey( s.charAt(index) ) ) {
                strPos = Math.max( map.get( s.charAt(index) ), strPos );
            }
            ans = Math.max(ans, index - strPos + 1 );
            map.put( s.charAt(index), index + 1);
        }
        return ans;
    }
}

