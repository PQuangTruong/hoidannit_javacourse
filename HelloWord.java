package javacourse_hoidanit;

import java.util.Scanner;

public class HelloWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Input your name: ");
		String Name = scanner.nextLine();
		System.out.printf("Input your age: ");
		int age = scanner.nextInt();
		System.out.println("My name is: " + Name + "\nMy age is: " + age);
		scanner.close();
	}
}
