package day12;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		HashMap hm = new HashMap();
		String value, key;
		System.out.print("키 입력 : ");
		key = in.next();
		System.out.print("값 입력 : ");
		value = in.next();
		
		hm.put(key, value);
		System.out.println("실행 명령어 입력 : ");
		String ex = in.next();
		if(hm.containsKey(ex)) {
			String s = (String)hm.get(ex);
			ProcessBuilder oProcess = new ProcessBuilder(s);
			oProcess.start();
		}else {
			System.out.println("그런 명령어는 없습니다!");
		}

	}

}
