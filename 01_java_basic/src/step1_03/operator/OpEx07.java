package step1_03.operator;

public class OpEx07 {
	public static void main(String[] args) {
		int test = 100;
		test = test + 5;
		test += 5;
		test -= 5;
		test *= 5;
		test /= 5;
		test %= 5;
		
		test++; // test = test + 1
		++test; // test = test + 1
		
		test--; // test = test - 1
		--test;
		
		int x = 0;
		System.out.println(x++); // 여기서는 0 출력
		System.out.println(++x);
		System.out.println(x);
	}
}
