
public class User4 {
	int id;
	String name;
	String pwd;
	
	public User4(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void TestParamTransfer(User4 u) {
		u.name = "bbb";
	}
	
	public static void main(String[] args) {
		User4 u1 = new User4(100, "aaa");
		u1.TestParamTransfer(u1);
		System.out.println(u1.name);
	}
	
}
