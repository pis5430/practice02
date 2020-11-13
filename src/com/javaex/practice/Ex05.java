package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("키와 몸무게를 입력해주세요.");
		
		System.out.print("키: ");
		int cm = sc.nextInt();
		
		System.out.print("몸무게: ");
		int kg = sc.nextInt();
		
		double average = (cm-100)*0.9;
		
		if(kg==average) {
			System.out.print("표준체중");
		}else if(kg>average){
			System.out.print("과제중");
		}else {
			System.out.print("저체중");
		}
		
		System.out.println(" 입니다.");
		System.out.println("표준체중: " + average);
		
		
		sc.close();

	}

}
