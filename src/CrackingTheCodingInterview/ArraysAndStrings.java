package CrackingTheCodingInterview;

public class ArraysAndStrings {
	
	public static void main(String[] args){
		ArraysAndStrings as = new ArraysAndStrings();
		String str = "abcde1234567891";
		boolean resIsUnique = as.isUnique(str);
		System.out.println(resIsUnique);
		
		String str1 = "qwertyuiop", str2 = "poiuytrewq";
		boolean permutation = as.permutation(str1, str2);
		System.out.println(permutation);
		
		String str3 = "Mr John Smith      ";
		char[] char3 = str3.toCharArray();
		int len = 13;
		as.URLify(char3, len);
		System.out.println(new String(char3));
		
		
	}
	
	private void URLify(char[] str, int len){
		int spaceCount = 0, length = 0;
		for( int i = 0; i < len; i++){
			if(str[i] == ' '){
				spaceCount++;
			}	
		}
		length = spaceCount*2 + len;
		if( length < str.length) {str[length] = '\0';}
		for(int i = len-1; i >= 0; i--){
			if(str[i] == ' '){
				str[length-1]= '0';
				str[length-2]= '2';
				str[length-3]= '%';
				length = length - 3;
			}else {
				str[length-1]= str[i];
				length = length - 1;
			}
		}
	}
	
	private boolean permutation(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		int[]  checker = new int[128];
		char[] charArray = str1.toCharArray();
		for(char c : charArray){
			checker[c - 'a'] ++;
		}
		charArray = str2.toCharArray();
		for(char c : charArray){
			checker[c - 'a'] --;
			if(checker[ c - 'a'] < 0){
				return false;
			}
		}
		return true;
	}
	private boolean isUnique(String str){
		int checker = 0;
		for(int i = 0; i < str.length(); i++){
			int val = str.charAt(i) - 'a';
			if((checker & ( 1<< val)) > 0){
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}

	
	
}
