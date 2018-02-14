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
}
