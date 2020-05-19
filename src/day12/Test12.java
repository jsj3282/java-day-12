package day12;

class Constructor_02{
	public Constructor_02(int num) {
		System.out.println(num +"持失切");
	}
	public Constructor_02() {}	//default 持失切
}
public class Test12 {

	public static void main(String[] args) {
		
		Constructor_02 con = new Constructor_02(123);
		Constructor_02 con2 = new Constructor_02();

	}

}
