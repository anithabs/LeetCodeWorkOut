package Feb;

public class AddDigits {
	public static void main(String arg[]){
		EncodeAndDecodeTinyURL edtURL = new EncodeAndDecodeTinyURL();
		String encode = edtURL.encode("https://leetcode.com/problems/design-tinyurl");
		String decode = edtURL.decode(encode);
		System.out.println(encode + " " + decode);
	}
	
}
