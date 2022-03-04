package org.opentutorials.javaPractice.compare;

import java.util.Scanner;
public class scanner{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();//숫자
		String str = sc.next();//문자
		System.out.println(i * 1000);
		System.out.println(str);
		sc.close();
	}

}
