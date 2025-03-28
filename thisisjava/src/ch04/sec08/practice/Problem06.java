package ch04.sec08.practice;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int i = 0;
//		int oddSum = 0;
//		int evenSum = 0;
//
//		System.out.print("숫자를 입력하세요");
//		System.out.println();
//
//		int cnt = scanner.nextInt();
//
//		for (i = 1; i <= cnt; i++) {
//
//			if (i % 2 == 1) {
//				oddSum += i;
//
//			} else {
//				evenSum += i;
//
//			}
//
//		}
//		if (cnt % 2 == 1) {
//
//			System.out.println("결과값: " + oddSum);
//		} else {
//			System.out.println("결과값: " + evenSum);
//
//		}
//	}
//}
		
		System.out.print("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
			
		if(num%2==0) {
			for (int i = 0; i <= num; i+=2 ) {
				
			} else {
				for (int i = 1; <= num; i+=2 ) {
					
			}
		}
		System.out.println("결과값" + sum);
	}
	}
}
