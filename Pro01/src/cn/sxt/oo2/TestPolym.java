package cn.sxt.oo2;

public class TestPolym {
	public static void main(String args[]) {
		Animal a = new Animal();
		animalCry(a);
		
		Animal d = new Dog(); // �Զ�����ת�� ����ת����
//		d.seeDoor(); // ��ʱ d ΪDog��ʵ�� ��������Animal�� ��� �޷�ʹ������Dog�ķ���
		animalCry(d);
		
		Dog d2 = (Dog)(d); // ǿ������ת��
		d2.seeDoor();
		
		Animal c = new Cat();
		
//		Dog d3 = (Dog)(c); // CΪcat��ʵ�� ��������Animal�� 
//		d3.seeDoor(); // �༭������ͨ�� 
										// �������лᱨ�� cn.sxt.oo2.Cat cannot be cast to cn.sxt.oo2.Dog
	}	
	
	static void animalCry(Animal a) { // ��Animal a��ʵ�������ࣩ��ʵ�� ���Ա�֤��������Ҳ���Ե��� 
		a.shout();											// ͨ����������ָ������
	}
	
//static void animalCry(Dog d) { // ��Dog d��ʵ�������ң���ʵ�� ��ô�����������޷����� 
//a.shout();                     // �Ӷ�Ҳ�޷�ʵ�ֶ�̬ �����ٽ��������������д
//}

	
//static void animalCry(Cat c) { // 
//a.shout();
//}

	
	
	
}

class Animal {
	public void shout() {
		System.out.println("����һ��");
	}
	
	
}

class Dog extends Animal { 
	public void shout() { // ��д���෽��
		System.out.println("����");
	}
	
	public void seeDoor() {
			System.out.println("����");
	}
}

class Cat extends Animal {
	public void shout() {
		System.out.println("è��");
	}
}