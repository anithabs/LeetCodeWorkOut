package Feb;

public class IntToRoman {
	public static void main(String arg[]){
		int x = 3999;
		IntToRoman ir = new IntToRoman();
		String result = ir.intToRoman(x);
		System.out.println(result);
	}
	public String intToRoman(int x){
		
		// M = 1000, D = 500, C = 100, L = 50, X = 10, V = 5, I = 1 
		String I[] = { "", "I", "II", "III", "V1", "V", "VI", "VII", "VIII", "IX"}; 
		String X[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String C[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String M[] = { "", "M", "MM", "MMM"};
		
		return ( M[x/1000] + C[(x%1000)/100] + X[(x%100)/10] + I[x%10]);
	}
}
