package javacourse_hoidanit;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input num: ");
		int a = scanner.nextInt();
		int v = (int) Math.pow(a, 3);
		System.out.println("The tich khoi lap phuong = " + v);
		scanner.close();
	}
}
