package chap99_etc;

public class CountKor {

	public static void main(String[] args) {
		String str = "가A나마라D";
		char ch;
		int kCnt = 0;
		int sum = 0;
		int i = 0;
		for (; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch >= 65 && ch <= 122)
				kCnt++;
		}
		sum = i - kCnt;
		System.out.println(sum);
	}

}
