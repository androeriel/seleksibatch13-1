public class Main {

	public static boolean validation(String name, int umur, String username) {
		String regex1 = "[a-z]*";
		String regex2 = "[.|_]";
		String regex3 = "[0-9]*";
		if(name.length() < 3 || name != name.toUpperCase()) {
			return false;
		}
		if(umur < 10 || umur > 99) return false;
		
		if(username.substring(0,4).matches(regex1) && username.substring(4, 5).matches(regex2)
				&& username.substring(5, 8).matches(regex3)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(validation("JANG", 99 , "toledada_333"));
	}
	
}