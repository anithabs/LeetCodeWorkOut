package Feb;

public class LongestCommonPrefix {
	public static void main( String[] args){
		String strs[] = new String[5];
		strs[0] = "asdfjkl";
		strs[1] = "asdjkl";
		strs[2] = "asdfjkl";
		strs[3] = "ajkl";
		strs[4] = "asdfjkl";
	
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String result = lcp.longestCommonPrefix(strs);
		System.out.println(result);	
	}
	
	public String longestCommonPrefix(String[] strs){	
		if(strs == null || strs.length ==0){
			return "";
		}
		String pre = strs[0];
		for(int i = 1 ; i < strs.length ; i++){
			System.out.println(strs[i].indexOf(pre) + "outer loop");
			while(strs[i].indexOf(pre) != 0){
				System.out.println(strs[i].indexOf(pre));
				pre = pre.substring(0, pre.length()-1);
			}
		}
		return pre;		
	}
}
