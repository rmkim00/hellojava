package ch04.sec08.practice;

public class practice5 {
	
	public static void main(String[] args) {
		
		for (int x = 1; x<=10; x++) {
			for (int y =1; y<=10; y++) {
				
				int total = 4*x + 5*y;
				if(total == 60) {
				System.out.print("(" + x + "," + y + ")  ");
				System.out.println("" + total + " ");
			}
				
			} 
		}
		
	}

}

//중첩 for문을 이용, 방정식 4x + 5y = 60의 모든 해를 구해서 (x,y)형태로 출력하는 코드 작성.(x와 y는 10이하의 자연수)
// ChatGPT ANSWER
//System.out.println("방정식 4x + 5y = 60의 모든 해:");
//
//for (int x = 1; x <= 10; x++) { // x는 1~10의 자연수
//    for (int y = 1; y <= 10; y++) { // y는 1~10의 자연수
//        if (4 * x + 5 * y == 60) { // 방정식 조건 확인
//            System.out.println("(" + x + ", " + y + ")");
//        }
//    }
//}
//}
//}