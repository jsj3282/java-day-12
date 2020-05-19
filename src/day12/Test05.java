package day12;

public class Test05 {

	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			try{
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
		System.out.println("¹Ýº¹¹® Å»Ãâ");

	}

}
