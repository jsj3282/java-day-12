package day12;

class DBconnect{
	private static int cnt = 0;
	public DBconnect() {
		cnt++;
	}
	public int getCnt() {
		return cnt;
	}
	public void controlDB() {
		System.out.println("db�� ����մϴ�.");
	}
}
public class Test19 {

	public static void main(String[] args) {
		
		DBconnect human_1 = new DBconnect();
		human_1.controlDB();
		System.out.println(human_1.getCnt()+"�� ���� �Ǿ����ϴ�.");

	}

}
