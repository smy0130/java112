package com.acorn;

import java.util.Scanner;

public class Study03 {

	public static void main(String[] args) {
		
		// 계산기 프로그램
		// 메뉴
		// 1. 더하기
		// 2. 빼기
		// 3. 곱하기
		// 4. 나누기
		// 99. 종료
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		while(true) {
			System.out.println("계산기 프로그램");
			System.out.println("메뉴");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("99. 종료");
			System.out.print("원하는 메뉴를 선택하세요:>>> ");
			int iKeyValue = sc.nextInt();
			
			if(iKeyValue == 99)
			{
				break;
			}
			
			if( (iKeyValue != 1) && (iKeyValue != 2) )
			{
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
				System.out.print("원하는 메뉴를 다시 선택하세요:>>> ");
			}
			
			if(iKeyValue == 1) {
				System.out.print("첫번째 숫자:>>>");
				int firstValue = sc2.nextInt();
				System.out.print("두번째 숫자:>>>");
				int secondValue = sc2.nextInt();
				System.out.println("더하기 결과:" + (firstValue + secondValue));
			} else if(iKeyValue == 2) {
				System.out.print("첫번째 숫자:>>>");
				int firstValue = sc2.nextInt();
				System.out.print("두번째 숫자:>>>");
				int secondValue = sc2.nextInt();
				System.out.println("빼기 결과:" + (firstValue - secondValue));
			}
			
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		}
		
		System.out.println("프로그램 실행을 종료합니다.");
		// 원하는 메뉴를 선택하세요:>>>_
		// 선택된 기능으로 이동
		// 첫번쨰 숫자를 입력하세요.
		// 두번쨰 숫자를 입력하세요.
		// 결과 출력
		// 메뉴로 이동
		// 메뉴
		// 1. 더하기
		// 2. 빼기
		// 3. 곱하기
		// 4. 나누기

	}

}
