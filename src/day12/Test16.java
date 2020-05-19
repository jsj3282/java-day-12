package day12;

class Constructor_07{
	private String version;
	public Constructor_07(String version) {
		this.version = version;
		System.out.println("windows7 입니다.");
	}
	public String getVersion() {
		return version;
	}
}
public class Test16 {

	public static void main(String[] args) {
		
		Constructor_07 con = new Constructor_07("Server Pack 1");
		System.out.println("버전 : " + con.getVersion());

	}

}
