package day12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test04 {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat simpl = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		String s = simpl.format(date);
		System.out.println("date : " + s);

	}

}
