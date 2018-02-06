package Feb;

public class ZigZag {
	
	public static void main( String[] args){
		String str = "abcdefghifklmnopqrstvwxyz";
		int rowNo = 5;
		ZigZag zz = new ZigZag();
		String result = zz.zigZagConversion(str, rowNo);
		System.out.println(result);
		
	}
	public String zigZagConversion(String str, int rowNo){
		
		char[] cstr = str.toCharArray();
		StringBuffer[] sb = new StringBuffer[rowNo];
		
		for(int i = 0; i < sb.length ; i++){
			sb[i] = new StringBuffer();
		}
		int i = 0 , len = cstr.length;
		while ( i < len ){
			for(int j = 0; j < rowNo &&  i < len;  j++) {
				sb[j].append(cstr[i++]);
				
			}
			for(int j = rowNo - 2; j >= 1 &&  i < len;  j--) {
				sb[j].append(cstr[i++]);
				
			}
		}
		for(int j = 1; j < sb.length ; j++ ){
			sb[0].append(sb[j]);
		}
		return sb[0].toString();		
	}

}
