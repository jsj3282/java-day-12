package day12;

class Constructor_07{
	private String version;
	public Constructor_07(String version) {
		this.version = version;
		System.out.println("windows7 �Դϴ�.");
	}
	public String getVersion() {
		return version;
	}
}
public class Test16 {

	public static void main(String[] args) {
		
		Constructor_07 con = new Constructor_07("Server Pack 1");
		System.out.println("���� : " + con.getVersion());

	}

}
