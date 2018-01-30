
public class OverloadingTricks2 {
	
	public static void main(String...args) {
		System.out.println(glide("a"));
		System.out.println(glide("a","b"));
		System.out.println(glide("a","b","c"));
	}
	
	public static String glide(String s) {
		return "1";
	}
	public static String glide (String...s) {
		return "2";
	}
	public static String glide(Object o) {
		return "3";
	}
	public static String glide(String s, String t) {
		return "4";
	}
	
	public static String glide(Object s, Object t, Object u) {
		return "5";
	}
}
