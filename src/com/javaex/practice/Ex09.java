package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num01 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num02 = sc.nextInt();
		
		if(num01<num02) {  //숫자1이 작은수인경우
			if((num02%num01)==0) { //숫자1이 약수인경우
				System.out.println(num01+" 은(는) " + num02 +"의 약수입니다.");
			}else{
				System.out.println(num01+" 은(는) " + num02 +"의 약수가 아닙니다.");
			}

		}else { //숫자2이 작은수인경우
			if((num01%num02)==0) { //숫자2이 약수인경우
				System.out.println(num02+" 은(는) " + num01 +"의 약수입니다.");
			}else{
				System.out.println(num02+" 은(는) " + num01 +"의 약수가 아닙니다.");
			}
			
		}
		
		
		sc.close();

	}

}
