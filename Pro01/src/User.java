// ������������ �� ������������һ���� û��ʲô����

public class User {
	int id;
	String name;
	String pwd;
	
	public User() {
		
	}
	
	public User(int id, String name) {
		this.id = id; // this ��ʾ�����õĶ��� this.id ʹ�õĳ�Ա����  id�� �ֲ����� ���β�
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

