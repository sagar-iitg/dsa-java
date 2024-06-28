package com.sagar.string;/*package whatever //do not write package name here */

class CountDistinctChracterInString {
	public static int countDistinct(String str)
	{
		int freq = 0;
		// If the position of zeroth bit is set which means
		// we have seen letter 'a' If the position of 25th
		// bit is set which means we have seen letter 'z'
		int n = str.length();
		for (int i = 0; i < n; i++) {
			int curr_pos = str.charAt(i) - 'a';
			// setting the curr_pos using left shift
			// operator
			freq = freq | (1 << curr_pos);
			// Already if we have seen that character we are
			// making it again 1
		}
		// Couting how many characters are there by counting
		// set bits in the freq
		int ans = 0;
		while (freq != 0) {
			if ((freq & 1) == 1)
				ans++;
			freq = freq >> 1;
		}
		return ans;
	}
	public static void main(String[] args)
	{
		String str = "geeksforgeeks";
		int ans = countDistinct(str);
		System.out.println(ans);
	}
}
