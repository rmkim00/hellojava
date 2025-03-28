package ch04.sec08.practice;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) { 
		//정수 다섯개 입력, 가장 큰 수 출력
		Scanner scanner = new Scanner (System.in);
		int i ; //반복문을 위한 변수
		int max = 0; //최대값을 저장할 변수
		int cnt; // 사용자가 입력할 변수
		
		System.out.println("숫자를 입력하세요");
		
			for (i = 0; i < 5; i++) { //5개의 정수 -> 5번 반
				System.out.print("숫자:	"); //사용자에게 숫자 입력 요청
				cnt = scanner.nextInt(); //사용자 입력 받기
			
				 
				 if (cnt > max) { //현재 입력값 cnt이 max보다 크면 
				  max = cnt; // max 값 업데이트
				
				  
			}
		
		}
			System.out.println("최대값은" + max + "입니다");
	}

}

//T
//Scanner scanner = new Scanner (System.in);
//
//System.out.println("숫자를 입력하세요");
//
//int max= 0;
//
//	for (int i = 1; i < 5; i++) { 
//		System.out.print("숫자:	"); 
//		int num = scanner.nextInt();
//		if(max < num) {
//			max = num;
//		}
//	}
//	System.out.println("최대값은" + max + "입니다");
//	}
//	}
//	


//Chatgpt 
//int max = Integer.MIN_VALUE; // 가장 작은 값으로 초기화
//
//System.out.println("정수 5개를 입력하세요:");
//
//for (int i = 0; i < 5; i++) {
//    System.out.print("입력 " + (i + 1) + ": ");
//    int num = scanner.nextInt();
//
//    if (num > max) { // 가장 큰 값 찾기
//        max = num;
//    }
//}