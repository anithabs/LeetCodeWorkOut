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
		
		String str4 = "Tact coa";
		boolean palindromePermutation = as.palindromePermutation(str4);
		System.out.println(palindromePermutation);
		
		String str5 = "Tact";
		String str6 = "Tatt";
		boolean oneWayEdit = as.oneWayEdit(str5, str6);
		System.out.println(oneWayEdit);
		
	}
	private boolean oneWayEdit(String str1, String str2){
		if(Math.abs(str1.length() - str2.length()) > 1) return false;
		boolean result;
		if(str1.length()== str2.length()){
			result = oneWayEditReplace(str1,str2);
		}else{
			result = oneWayEditInsert(str1,str2);
		}
		return result;
	}
	private boolean oneWayEditReplace(String str1, String str2){
		boolean diff = false;
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		for(int i = 0 ; i < str1.length() ; i++){
			if(char1[i] != char2[i]){
				if(diff){
					return false;
				}
				diff = true;
			}
		}
		return true;
	}
	private boolean oneWayEditInsert(String str1, String str2){
		String first = str1.length() > str2.length()? str1 : str2;
		String second = str1.length() > str2.length()? str2 : str1;
		int index1 = 0, index2 = 0;

		while( index1 < first.length() && index2 < second.length()){
			if(first.charAt(index1) != second.charAt(index2)){
				if(index1 != index2){
					return false;
				}
				index1++;
			}else{
				index1++;
				index2++;
			}
		}
		return true;
	}
	private boolean palindromePermutation(String str){
		int[] table = new int[ Character.getNumericValue('z')-Character.getNumericValue('a') +1];
		int count = 0;
		for(char c:str.toCharArray()){
			int x = getNumeric(c);
			if( x != -1){
				table[x]++;
				if( table[x] % 2 == 1){
					count++;
				}else {
					count--;
				}
			}
		}
		return count <= 1;
		
	}
	
	private int getNumeric(Character c){
		int val = Character.getNumericValue(c);
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		if( a <= val && val <= z){
			return val - a;
		}
		return -1;
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
