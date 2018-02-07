package Feb;
import java.util.HashMap;
import java.util.Map;
public class EncodeAndDecodeTinyURL {
    Map<String, String> index = new HashMap<String, String>();
    Map<String, String> revIndex = new HashMap<String, String>();
    static String BASE_HOST = "http://tinyurl.com/";
	public static void main(String arg[]){
		EncodeAndDecodeTinyURL edtURL = new EncodeAndDecodeTinyURL();
		String encode = edtURL.encode("https://leetcode.com/problems/design-tinyurl");
		String decode = edtURL.decode(encode);
		System.out.println(encode + " " + decode);
	}
    public String encode(String longURL) {
        if (revIndex.containsKey(longURL)) 
        	return BASE_HOST + revIndex.get(longURL);
        String charSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String key = null;
        do {
            StringBuilder sb = new StringBuilder();
            for	(int i = 0; i < 6; i++) {
                int r = (int) (Math.random() * charSet.length());
                sb.append(charSet.charAt(r));
            }
            key = sb.toString();
        } while (index.containsKey(key));
        index.put(key, longURL);
        revIndex.put(longURL, key);
        return BASE_HOST + key;
    }
    public String decode(String shortURL) {
    	 return index.get(shortURL.replace(BASE_HOST, ""));
    }
}