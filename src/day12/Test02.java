package day12;

import java.text.SimpleDateFormat;

public class Test02 {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		System.out.println(time);
		SimpleDateFormat simpl = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		
		String s = simpl.format(time);
		System.out.println(s);

	}

}
