package day12;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		HashMap hm = new HashMap();
		String value, key;
		System.out.print("Ű �Է� : ");
		key = in.next();
		System.out.print("�� �Է� : ");
		value = in.next();
		
		hm.put(key, value);
		System.out.println("���� ��ɾ� �Է� : ");
		String ex = in.next();
		if(hm.containsKey(ex)) {
			String s = (String)hm.get(ex);
			ProcessBuilder oProcess = new ProcessBuilder(s);
			oProcess.start();
		}else {
			System.out.println("�׷� ��ɾ�� �����ϴ�!");
		}

	}

}
