package day12;

class Constructor_06{
	private String version;
	public Constructor_06() {
		System.out.println("windows7 입니다.");
	}
	public String getVersion() {
		return version;
	}
	public void SetVersion(String version) {
		this.version = version;
	}
}
public class Test15 {

	public static void main(String[] args) {
		
		Constructor_06 con = new Constructor_06();
		con.SetVersion("Server Pack 1");
		System.out.println("버전 : " + con.getVersion());

	}

}
