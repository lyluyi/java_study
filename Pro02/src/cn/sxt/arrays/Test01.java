package cn.sxt.arrays;

public class Test01 {
	public static void main(String[] args) {
		int[] arr01 = new int[10];
		String[] arr02 = new String[5];
		
		
		for (int i=0; i < arr01.length; i++) {
				arr01[i] = 10*i;
				System.out.println(arr01[i]);
		}
		
		User[] arr03 = new User[3];
		arr03[0] = new User(1, "aaa");
		arr03[1] = new User(2, "bbb");
		arr03[2] = new User(3, "ccc");
		
		for (int i = 0; i < arr03.length; i++) {
			 System.out.println(arr03[i].getName());
		}
		
	}
}

class User {
	public User(int id, String name) { // 生成构造器方法
			super();
			this.id = id;
			this.name = name;
	}

	private int id;
	private String name;
	
  public int getId() {
  		return id;
  }
  
  public void setId(int id) {
  		this.id = id;
  }
  
  public String getName() {
  		return name;
  }
  
  public void setName(String name) {
  		this.name = name;
  }
  
}
