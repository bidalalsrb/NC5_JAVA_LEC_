package chap99_etc;

public class _01_printReverse {

	public static void main(String[] args) {
		String str = "AbcDeF";
		String capStr = ""; // 대소문자 변환 된 문자열
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print(ch);
			System.out.println("");
			char capCh = ch >= 'A' && ch <= 'Z' ? 
					(char) ((int) ch + 32) : 
					(char) ((int) ch - 32);
				capStr = capCh + capStr; // capStr = a; >> capStr =aBCdEf
		
		}
//		for(int i= capStr.length()-1; i>=0; i--) {
//			System.out.print(capStr.charAt(i));
//		}
		System.out.println(capStr);
	}
}