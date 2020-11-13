package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num01 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num02 = sc.nextInt();
		
		int division_01 = num01/num02;
		int division_02 = num02/num01;
		
		int remainder_01 = num01%num02;
		int remainder_02 = num02%num01;

		
		if(num01>=num02) {
			System.out.println("몫: "+division_01);
			System.out.println("나머지: "+remainder_01);
		}else {
			System.out.println("몫: "+division_02);
			System.out.print("나머지: "+remainder_02);
		}
		
		sc.close();
	

	}

}
