package day12;

class DBconnect_02{
	private static DBconnect_02 dbCon;
	private static int cnt = 0;
	public DBconnect_02() {
		cnt++;
	}
	public int getCnt() {
		return cnt;
	}
	public void controlDB(){
		System.out.println("db를 사용합니다.");
	}
	public static DBconnect_02 getInstace() {
		if(dbCon == null) {
			dbCon = new DBconnect_02();
		}
		return dbCon;
	}
}
public class Test21 {

	public static void main(String[] args) {
		
		DBconnect_02 dc = DBconnect_02.getInstace();
		for(int i = 0; i < 1000; i++) {
			DBconnect_02.getInstace();
		}
		System.out.print(dc.getCnt() + "명 ");
		dc.controlDB();
		System.out.println(dc.getCnt()+"명 연결되었습니다.");

	}

}
