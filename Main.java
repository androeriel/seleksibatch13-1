import java.math.BigInteger;
import java.util.Arrays;

public class Main {
	public static long divideAndSort(long input) {
		String convert = String.valueOf(input);
		String temp = "";
		String hasil = "";
		for(int i=0;i<convert.length();i++) {
			if(convert.charAt(i) == '0') {
				char a[] = temp.toCharArray();
				Arrays.sort(a);
				hasil += String.valueOf(a);
				temp = "";
			}else{
				temp+= convert.charAt(i);
			}
			if(i == convert.length() - 1) {
				char a[] = temp.toCharArray();
				Arrays.sort(a);
				hasil += String.valueOf(a);
			}
		}

		return Long.valueOf(hasil);
	}
	
	
	public static void main(String[] args) {
		long val = 5956560159466056L;
		System.out.println(divideAndSort(val));
	}
}