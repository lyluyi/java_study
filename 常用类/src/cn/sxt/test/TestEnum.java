package cn.sxt.test;

// ����ö��

public class TestEnum {
	public static void main(String[] args) {
		
			System.out.println(Season.SPRING);
			
			Season a = Season.AUTUMU;
			switch (a) {
		case SPRING:
				System.out.println("��");
				break;
		case SUMMER:
				System.out.println("��");
				break;
		case AUTUMU:
				System.out.println("��");
				break;
		case WINTER:
				System.out.println("��");
				break;
		default:
				break;
		}
	}
}

enum Season {
	SPRING, SUMMER, AUTUMU, WINTER
}

enum Week {
	����һ,���ڶ�,������,������,������,������,������
}