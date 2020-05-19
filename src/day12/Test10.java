package day12;

class Constructor_01{
	public Constructor_01(int num) {
		System.out.println(num + "생성자 호출");
	}
}
public class Test10 {

	public static void main(String[] args) {
		
		Constructor_01 con = new Constructor_01(123);

	}

}
