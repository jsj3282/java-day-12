package day12;

import java.text.SimpleDateFormat;

public class Test02 {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		System.out.println(time);
		SimpleDateFormat simpl = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		
		String s = simpl.format(time);
		System.out.println(s);

	}

}
