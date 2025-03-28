package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) throws Exception {
		for(int i=1; i<=10; i++) { //6
			if(i%2 != 0) { //0
				continue;
			}
			System.out.print(i + " "); //2, 4, 6
		}
	}
}


// p.140 확인문제 2 
//package ch04.sec08.practice;
//
//public class Example2 {
//  public static void main(String[] args) throws Exception {
//    String grade = "B";
//    int score1 = 0;
//    switch (grade) {
//      case "A" {
//        score1 = 100;
//      }
//      case "B" {
//        int result = 100 - 20;
//        score1 = result;
//      }
//      default {
//        score1 = 60;
//      }
//    }
//    System.out.println("점수는 :" + score1 + "등급은 :" + grade + "입니다");
//  }
//}
