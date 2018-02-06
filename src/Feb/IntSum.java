package Feb;

public class IntSum {
	public static void main(String arg[]){
		int x = 8, y = 9;
		IntSum is = new IntSum();
		int result = is.intSum(x , y);
		System.out.println(result);
	}
	public int intSum(int x, int y){
		
		if(x == 0) return y;
		if(y == 0) return x;
		while( x != 0){
			int carry = x & y;
			y = x ^ y;
			x = carry << 1;
		}
		return y;
	}
}


