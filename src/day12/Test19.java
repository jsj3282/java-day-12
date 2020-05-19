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
		System.out.println("db를 사용합니다.");
	}
}
public class Test19 {

	public static void main(String[] args) {
		
		DBconnect human_1 = new DBconnect();
		human_1.controlDB();
		System.out.println(human_1.getCnt()+"명 연결 되었습니다.");

	}

}
