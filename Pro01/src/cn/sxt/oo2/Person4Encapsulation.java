package cn.sxt.oo2;

// ��װ ʹ��ϸ��

public class Person4Encapsulation {
	private int id;
	private String name;
	private int age;
	private boolean man;
	
	public void setName(String name) { // void ����Ҫ����ֵ
		this.name  = name;
	}
	
	public String getName () { // source ����ѡ setter getter���� �༭���Զ����� boolean����Ϊ isMan
		return this.name;
	}
	
  public boolean isMan() {
  		return man;
  }
  
  public void setMan(boolean man) {
  		this.man = man;
  }

public void setAge(int age) {
		if (age>=1&&age<=30) {
			this.age = age;
		} else {
			System.out.println("��������������");
		}
	}
}
