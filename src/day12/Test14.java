package day12;

import java.util.Scanner;

class Constructor_05{
	private int age;
	public Constructor_05(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
}
public class Test14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int age = input.nextInt();
		Constructor_05 con = new Constructor_05(age);
		System.out.println("����� ���̴� " + con.getAge() + " �̱���");

	}

}
