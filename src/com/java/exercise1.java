package com.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class exercise1 {
    public static void main(String[] args) {
        int a = 100;
        byte b1 = 100;
        byte b2 = 100;
        int b3 = b1 + b2;
        System.out.println(a);
    }
}

class Solution {
    public int flipLights(int n, int presses) {

    }
}

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] abc = new int[26];
        int maxDifLen = -1;
        for (int i = 0; i < s.length(); i++) {
            abc[s.charAt(i) - 'a']++;
            if (abc[s.charAt(i) - 'a'] > 1) {
                maxDifLen = Math.max(maxDifLen, i - 1 - s.indexOf(s.charAt(i)));
            }
        }
        return maxDifLen;
    }
}


class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer[] tmp=new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i] , 0) + 1);
            tmp[i]=nums[i];
        }
        Arrays.sort(tmp,(a, b)-> map.get(a).equals(map.get(b)) ?Integer.compare(b,a):map.get(a)- map.get(b));
        for(int i = 0; i < nums.length; i++){
            nums[i]=tmp[i];
        }
        return nums;
    }
}