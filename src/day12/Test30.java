package day12;

class Super_02{
	protected int num;
	protected int num1;
	public Super_02() {
		num = 100;
		num1 = 500;
	}
}
class child_02 extends Super_02{
	private int su;
	private int su1;
	public child_02() {
		su = 10;
		su1 = 20;
	}
	public void display() {
		System.out.println("num : " + num + " num1 : " + num1);
		System.out.println("su : " + su + " su1 : " + su1);
	}
}
public class Test30 {

	public static void main(String[] args) {
		
		child_02 ch = new child_02();
		ch.display();

	}

}
