package step1_03.operator;

public class OpEx05 {
	public static void main(String[] args) {
		System.out.println(10 == 10 && 3 == 3); // 왼쪽, 오른쪽 둘 다 맞아야 true
		System.out.println(10 == 10 || 3 == 3); // 왼쪽, 오른쪽 둘 중 하나 이상 맞아야 true
		System.out.println(!(10 == 3));
	}
}
