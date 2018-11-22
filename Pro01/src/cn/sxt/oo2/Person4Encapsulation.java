package cn.sxt.oo2;

// 封装 使用细节

public class Person4Encapsulation {
	private int id;
	private String name;
	private int age;
	private boolean man;
	
	public void setName(String name) { // void 不需要返回值
		this.name  = name;
	}
	
	public String getName () { // source 里面选 setter getter方法 编辑器自动生成 boolean类型为 isMan
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
			System.out.println("请输入正常年龄");
		}
	}
}
