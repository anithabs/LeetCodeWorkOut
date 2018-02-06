package Feb;

public class PalindromeNumber {
	public static void main(String arg[]){
		int x = 123454321;
		PalindromeNumber pn = new PalindromeNumber();
		boolean result = pn.isPalindromNumber(x);
		System.out.println(result);
	}
	public boolean isPalindromNumber(int x){
		if(x < 0)return false;
		int rev = 0;
		while(x > rev){
			rev = rev * 10 + x % 10;
			x = x/10;
		}
		return (x == rev || x == rev/10);
	}

}
