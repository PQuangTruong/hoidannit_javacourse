package javacourse_hoidanit;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input width: ");
		int w = scanner.nextInt();
		System.out.println("Input length: ");
		int l = scanner.nextInt();
		int c = (w + l) * 2;
		int s = w * l;
		int min = Math.min(w, l);
		System.out.println("Chu vi HCN = " + c);
		System.out.println("Dien tich HCN = " + s);
		System.out.println("Canh nho nhat HCN = " + min);
		scanner.close();
	}
}
