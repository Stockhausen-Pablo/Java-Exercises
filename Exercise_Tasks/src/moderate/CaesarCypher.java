package moderate;

public class CaesarCypher {
	//The Ceasar cipher is a basic encryption technique used by Julius Ceasar to securely communicate with his generals. Each letter is replaced by another letter N positions down the english alphabet. For example, for a rotation of 5, the letter 'c' would be replaced by an 'h'. In case of a 'z', the alphabet rotates and it is transformed into a 'd'.
	//Implement a decoder for the Ceasar cipher where N = 5.
	//TIP: Use code.toCharArray() to get an array of characters.v
	
	public static String decode(String code) {
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] input = code.toCharArray();
		String solution = "";
		int verschiebung = 5;
		
		
		for(int i = 0; i < input.length;i++) {
			char temp_actual = input[i];

			for(int j = 0;j < alphabet.length;j++) {
				char temp_alphab = alphabet[j];
				
					if (temp_actual == temp_alphab) {
						int negativ_ausgleich = j+verschiebung;
						if (negativ_ausgleich >= 26 ) {	
							char versch_char = alphabet[negativ_ausgleich - 26];
							solution = solution + versch_char;
							break;
							
						}else {
							
							char versch_char = alphabet[negativ_ausgleich];
							solution = solution + versch_char;
							break;
						}
					}
					
			}
			
		}
		
		return solution;
	
	}
	
	public static void main(String[]args) {
		System.out.println(decode("a"));
	}
	
}
