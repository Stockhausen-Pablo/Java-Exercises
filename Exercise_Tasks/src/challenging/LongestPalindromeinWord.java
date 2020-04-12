package challenging;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;



public class LongestPalindromeinWord {

	
	/*A palindrome is a word which reads the same backward or forward.
	'abcba' is a palindrome.
	Write a method that returns the longest palindrome substring of a given string.*/
	
	public static String findLongestPalindrome(String word) {

		LinkedList<String> cl = new LinkedList<String>(); 
		
		String finalList = "";
	    int j = 0;


	    for(;j < word.length();j++){
	    	for(int k=j+1;k < word.length();k++) { 
	    		if(word.charAt(j) == word.charAt(k)){	
	    			String temp = "" + word.substring(j, k+1);
	    			cl.add(temp);
	    			k++; 
	    		}else if (word.charAt(j) == word.charAt(k) && (k+1 == word.length())) {
	    			String temp = "" + word.substring(j, k+1);
	    			cl.add(temp);
	    			k = word.length(); 
	    		}

	    	}
	    }

	   	if(cl.size() == 0) {
	   		finalList = "" + word.charAt(0);
	   	}else {
		    for(int i = 0;i < cl.size();i++) {
		   
		    	for(int k = 0; k < cl.get(i).length();) {

		    		if(cl.get(i).charAt(k) == cl.get(i).charAt((cl.get(i).length()-1)-k)) {
			    		k++;
			    	}else {
			    		cl.remove(i);
			    		i--;
			    		break;
			    	}
		    	}
		    }
		    
		    Collections.sort(cl, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					return o1.length() - o2.length();
				}
			});
		    
		    finalList = "" + cl.get(cl.size()-1);
		    
	   	}
 
	    System.out.println(finalList);
	    return finalList;

	}
	public static void main(String[]args) {
		findLongestPalindrome("abattd");
		findLongestPalindrome("abc");
		findLongestPalindrome("abcba");
		findLongestPalindrome("fgfcvfgftestregallager");
	}
	
}
