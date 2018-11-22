// 构造器的重载 跟 方法的重载是一样的 没有什么区别

public class User {
	int id;
	String name;
	String pwd;
	
	public User() {
		
	}
	
	public User(int id, String name) {
		this.id = id; // this 表示创建好的对象 this.id 使用的成员变量  id是 局部变量 即形参
		this.name = name;
	}
	
	public User(int id, String name, String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	public static void main() {
		User u1 = new User();
		User u2 = new User(101, "aaa");
		User u3 = new User(111, "bbb");
	}
}

