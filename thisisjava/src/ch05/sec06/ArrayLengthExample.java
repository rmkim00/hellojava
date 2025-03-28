package ch05.sec06;

import java.util.Scanner;

public class ArrayLengthExample {
	public static void main(String[] args) {
//		//배열 변수 선언과 배열 대입
//	//	int[] scores = { 84, 90, 96 };
//		
//		int[] scores = new int [3];
//		System.out.println("총합과 평균을 구할 정수 3가지를 입력하세요");
//		Scanner scanner = new Scanner(System.in);
//		scanner.nextInt();
//	
//		
//		//배열 항목의 총합 구하기
//		int sum = 0;
//		for(int i=0; i<3; i++) { //i<=scores.length 등호 주의!
//			sum += scores[i];
//		}
//		System.out.println("총합 : " + sum);
//		
//		//배열 항목의 평균 구하기
//		double avg = (double) sum / scores.length;
//		System.out.println("평균 : " + avg);
//	}
//}

	

		        // 배열 선언 (크기 3)
		        int[] scores = new int[3];

		        // Scanner 객체 생성
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("총합과 평균을 구할 정수 3가지를 입력하세요");

		        // 사용자 입력을 배열에 저장
		        for (int i = 0; i < scores.length; i++) {
		            System.out.print("");
		            scores[i] = scanner.nextInt();
		        }

		        // 총합 계산
		        int sum = 0;
		        for (int i = 0; i < scores.length; i++) {
		            sum += scores[i];
		        }
		        System.out.println("총합: " + sum);

		        // 평균 계산
		        double avg = (double) sum / scores.length;
		        System.out.println("평균: " + avg);

		        // Scanner 닫기
		        scanner.close();
		    }
		}
	
