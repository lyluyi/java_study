// ����static

public class User2 {
	int id;
	String name;
	String pwd;
	static String company = "aabbcc"; // ��̬���� ��������
	
	public User2(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public void login() {
		System.out.println("��¼��" + name);
	}
	
	public static void printCompany() { // ��̬���� ��������
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		User2 u = new User2(101, "ccc");
		User2.printCompany();
		User2.company = "dsadsa";
		User2.printCompany();
	}
}
