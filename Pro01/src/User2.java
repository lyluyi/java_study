// 测试static

public class User2 {
	int id;
	String name;
	String pwd;
	static String company = "aabbcc"; // 静态变量 从属于类
	
	public User2(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public void login() {
		System.out.println("登录：" + name);
	}
	
	public static void printCompany() { // 静态方法 从属于类
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		User2 u = new User2(101, "ccc");
		User2.printCompany();
		User2.company = "dsadsa";
		User2.printCompany();
	}
}
