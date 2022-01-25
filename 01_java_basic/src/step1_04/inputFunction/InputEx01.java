package step1_04.inputFunction;

import java.util.Scanner;

public class InputEx01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int test = scan.nextInt();
		
		System.out.println(test);
		
		
		int test2 = scan.nextInt();
		int test3 = scan.nextInt();
		
		scan.close();
	}
}
