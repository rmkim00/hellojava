package ch04.sec04;

public class MultiplicationTableExample {
	public static void main(String[] args) {
//		for (int m=2; m<=9; m++) {
//			System.out.println("*** " + m + "단 ***");
//			for (int n=1; n<=9; n++) {
//				System.out.println(m + " x " + n + " = " + (m*n));
//			}
//		
		for (int m = 2; m <= 9; m++) {
			System.out.print("*** " + m + " 단 " + "***" + "\t");
		} 
		System.out.println();
		for (int n = 1; n <= 9; n++) {   	//n:곱해지는 수 -> 1~9까지 1씩 증가
			for (int m = 2; m <= 9; m++) {      // m: 단 -> 2단~9단까지 1단씩 증가
                System.out.print(m + " x " + n + " = " + (m * n) + "\t"); 	//출력문 ("\t"로 정렬)
            }
            System.out.println(); 	//줄 바꿈

		}
		}
	}

	