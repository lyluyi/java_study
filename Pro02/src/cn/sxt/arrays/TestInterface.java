package cn.sxt.arrays;

// ���Խӿ� Interface

public class TestInterface {
	public static void main(String[] args) {
		System.out.println("aa");
		
		volant v = new Angel();
		v.fly();
	
	}
}

/*
 * ���нӿ�
 */

interface volant {
	int FLY_HEIGHT = 1000;
 	void fly();
}

// Honest�ӿ�

interface Honest {
	void helpOther();
}

class Angel implements volant,Honest { // ʵ�������ʵ�ֶ�����ӿ�
	
	@Override
	
	public void helpOther() {
		System.out.println("helpOther");
	}

  @Override
  public void fly() {
  		// TODO Auto-generated method stub
  		System.out.println("fly");
  }
  
}
