package day12;

class DBconnect_01{
	
	private static int cnt = 0;
	public DBconnect_01() {
		cnt++;
	}
	public int getCnt() {
		return cnt;
	}
	public void controlDB() {
		System.out.println("db�� ����մϴ�.");
	}
}
public class Test20 {

	public static void main(String[] args) {
		
		DBconnect_01 dc = new DBconnect_01();
		for(int i = 0; i < 1000; i++) {
			new DBconnect_01();
		}
		System.out.print(dc.getCnt() + "�� ");
		dc.controlDB();
		System.out.println(dc.getCnt()+"�� ���� �Ǿ����ϴ�.");
	}

}
