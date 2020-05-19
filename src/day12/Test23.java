package day12;

class Calc_01{
	public void display() {
		System.out.println("나는 계산기야");
	}
}
class Computer_01 extends Calc_01{
	public void print() {
		display();
		System.out.println("나는 컴퓨터야");
	}
}
public class Test23 {

	public static void main(String[] args) {
		
		Computer_01 com = new Computer_01();
		com.print();

	}

}
