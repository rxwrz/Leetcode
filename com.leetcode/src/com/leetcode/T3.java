package com.leetcode;

public class T3 {
    public static void main(String[] args) {
	T3 T = new T3();
	String s = new String();
	s = "abba";
	int a = T.lengthOfLongestSubstring(s);
	System.out.println(a);
    }
    
    public int lengthOfLongestSubstring(String s) {
	if (s.length()==0) return 0;
	int max = 0;
	int start = 0;
	int temp=0;
	int[] position = new int[232];
	char[] s2 = s.toCharArray();
	position[Integer.valueOf(s2[0])]=0;
	
	for (int i = 0; i < 232; i++) {
	    position[i] = 0;
	}
	
	for (int i = 0; i < s.length(); i++) {	
	    if (s.substring(start,i).contains((CharSequence)s.substring(i,i+1))){
		max = max>temp? max : temp;
		temp=i-position[Integer.valueOf(s2[i])];
		System.out.println(s.substring(i,i+1));
		start=position[Integer.valueOf(s2[i])]+1;
		position[Integer.valueOf(s2[i])]=i;	

	    } else {
		System.out.println(s.substring(i,i+1));
		System.out.println(temp);
		temp++;
		position[Integer.valueOf(s2[i])]=i;
	    }
	}
	
	return max>temp? max : temp;
    }
}
