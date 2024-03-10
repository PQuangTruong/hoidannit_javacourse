package javacourse_hoidanit;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your name: ");
		String name = scanner.nextLine();
		System.out.println("Input your point: ");
		String point = scanner.nextLine();
		System.out.println("Your name is: " + name + ",\nPoint = " + point);
		scanner.close();
	}
}
