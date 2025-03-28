package ch04.sec08.practice;

import java.util.Scanner;

public class practice7 {
	public static void main(String[] args) {
//		 Scanner scanner = new Scanner(System.in);
//		 int deposit;
//		 int withdraw;
//		 int total = 0;
//		 
//		while(true) {
//			System.out.println("---------------------");
//			System.out.println("1.예금 " +"2.출금 " + "3.잔고 " + "4. 종료 ");
//			System.out.println("---------------------");
//			System.out.println("선택> ");
//			int input = scanner.nextInt();
//           
//            if(input ==1){
//                System.out.println("예금액>" );
//                deposit = scanner.nextInt();
//                total += deposit;
//                
//            } else if(input ==2){
//                System.out.println("출금액> ");
//                withdraw = scanner.nextInt();
//                total -= withdraw;
//                
//            } else if (input ==3){
//                System.out.println("잔고> " + total);
//               
//                
//            }  else if (input == 4) { 
//                System.out.println("프로그램 종료");
//                break;
//                
//            }
//	
//		}
//	}}
		
		Scanner scanner = new Scanner(System.in);
		 int balance = 0; //잔액
		 int request = 0; //요청금액
		 String temp = ""; //
		 
		 System.out.println("-------------------------------------");
		 System.out.println("1.예금 " +"2.출금 " + "3.잔고 " + "4.종료");
		 System.out.println("-------------------------------------");
		 System.out.println("선택> ");
		
		 //1. 메뉴선택 입력
		 temp = scanner.nextLine();
		 if("1".equals(temp)) { //예금
			 //잔액 변수에 요청값 누적
			System.out.println(	"예금액>	" );
			request = Integer.parseInt(scanner.nextLine());
			balance +=request;
			
		 }else if ("2".equals(temp)) { //출금
			//잔액변수에서 요청값 차감
			 System.out.println("출금액> ");
			request = Integer.parseInt(scanner.nextLine());
			balance -= request;
			
		 }else if ("3".equals(temp)) { //잔고출력
			 System.out.println("잔액	> " + balance);
			 
		 }else if ("4".equals(temp)) {
				break; //종료

		 }
	}
		

//잔액 부족한 경우 & 충분한 경우. 
	//import java.util.Scanner;
//
//public class Bank {
//
//  public static void main(String[] args) {
//    // 예금, 출금, 조회, 종료 기능을 제공하는 프로그램작성
//    int balance = 0; // 잔액
//    int request = 0; // 요청금액
//    String temp = ""; // 임시저장 숫자
//    Scanner sc = new Scanner(System.in);
//    
//    while(true) {
//      System.out.println("----------------------------------");
//      System.out.println("1.예금  |  2.출금  |  3.잔고  |  4.종료");
//      System.out.println("----------------------------------");
//      System.out.print("선택>");
//      
//      // 메뉴 선택 입력
//      temp = sc.nextLine();
//      
//      // 예금
//      if("1".equals(temp)) {
//        // 잔액 변수에 요청값 누적
//        System.out.print("예금액>");
//        request = Integer.parseInt( sc.nextLine() );
//        balance += request;
//      }else if("2".equals(temp)) { // 출금
//        // 잔액 변수에서 요청값 차감
//        System.out.print("출금액>");
//        request = Integer.parseInt( sc.nextLine() );
//		 
//	}