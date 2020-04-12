package moderate;


public class RiceBag {

	// big = 5kg
	// small = 1kg
	
	public static void main(String[]args) {
		System.out.println(packageRice(2, 1, 5));
	}
	
	
	public static Boolean packageRice(Integer big, Integer small, Integer goal) {
		int x = goal % (big * 5);
		if(x == 5) {
			return true;
		}else {
		Integer proof = x - (small * 1);
		if (proof > 0){
			return false;
		}else {
			return true;
		}
		}
		
	}
}
