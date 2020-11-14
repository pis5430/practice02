package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자: ");
		
		int x = sc.nextInt();
		int x_00 =(x*x*x)-(9*x)+2; //x 세제곱을 써도 됨 세제곱 , Math.pow(3)=3의 제곱 , Math.pow(2. 53) 2의 53승?
		int x_01 =(7*x+2);
		
		
		if(x<=0) {
			System.out.print("계산결과는 " + (double)x_00 + "입니다.");
		}else {
			System.out.print("계산결과는 " + (double)x_01 + "입니다.");
		}
		
		sc.close();

	}

}
