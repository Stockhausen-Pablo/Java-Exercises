package challenging;

import java.util.ArrayList;

public class LargestPrimeFactor {
	
	public static Integer largestPrimeFactor(Integer n) {
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		ArrayList<Integer> factorsList = new ArrayList<Integer>();
		Integer workwithausgangswert = n;
		Integer largestfactor = n;
		workwithausgangswert--;
		
		for (;workwithausgangswert > 1;) {
			if(workwithausgangswert % 2 == 0) {
				workwithausgangswert--;
			}else if(workwithausgangswert % 2 == 1) {
				primeList.add(workwithausgangswert);
				workwithausgangswert--;
			}
		}
		primeList.add(2);
		System.out.println(primeList);
		for (int i = primeList.size()-1; i >= 0;i--) {
			int temp_calc = largestfactor % primeList.get(i);
				if(temp_calc == 0) {
					factorsList.add(primeList.get(i));
					largestfactor = (largestfactor/primeList.get(i));
					i++;
				}

		}
		Integer solution = factorsList.get(factorsList.size()-1);

		return solution;	
	}
	
	public static void main(String[]args) {
		largestPrimeFactor(13195);
	}
}
