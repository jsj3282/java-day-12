package day12;

class Constructor_03{
	public Constructor_03(int num) {
		System.out.println(num + " ������");
	}
	public Constructor_03() {
		System.out.println("�Ű����� ���� ������");
	}
	public Constructor_03(String n) {
		System.out.println(n+" ������ ȣ��");
	}
}
public class Test13 {

	public static void main(String[] args) {
		
		Constructor_03 con = new Constructor_03(123);
		Constructor_03 con2 = new Constructor_03();
		Constructor_03 con3 = new Constructor_03("�����ε�");

	}

}
