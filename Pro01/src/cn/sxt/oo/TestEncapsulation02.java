package cn.sxt.oo;

// ���Է�װ02 

import cn.sxt.oo2.Human;


public class TestEncapsulation02 {
	public static void main(String[] args) {
		Human h = new Human();
//		h.height = 170;  // ��ʱ��ͬ������ protected ���ε��� �޷�������
			
	}
}

class Girl extends Human { 
	void sayGood() {
		System.out.println(heigth); // ��ͬ������ �̳��˸���� protected���������ÿ��Ա�����
	}
}