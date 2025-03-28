package ch04.sec08.practice;

public class Problem01 {

	public static void main(String[] args) {
		//1~100 정수에서 5의 배수이면서 7의 배수인 것만 출력
		
		for (int i =1; i<=100; i++) {
			if(i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
	}

}
}
}