package ch04.sec08.practice;

import java.util.Scanner;

public class Problem07_homework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int randomNum = (int) (Math.random() * 100) + 1;

		System.out.println("===========================");
		System.out.println("     [숫자맞추기게임 시작]     ");
		System.out.println("===========================");

		while (true) {
			System.out.print(">> ");
			int userNum = input.nextInt();
			input.nextLine();
			if (userNum > randomNum) {
				System.out.println("더 낮게");
			} else if (userNum < randomNum) {
				System.out.println("더 높게");
			} else {
				System.out.println("맞았습니다.");
				System.out.print("게임 종료하시겠습니까?(y/n) >>");
				String str = input.nextLine();

				if (str.equals("y")) {
					System.out.println("===========================");
					System.out.println("     [숫자맞추기게임 종료]     ");
					System.out.println("===========================");
					input.close();
					break;

				}

			}
		}

	}

}
