package cn.sxt.test;

// 测试枚举

public class TestEnum {
	public static void main(String[] args) {
		
			System.out.println(Season.SPRING);
			
			Season a = Season.AUTUMU;
			switch (a) {
		case SPRING:
				System.out.println("春");
				break;
		case SUMMER:
				System.out.println("夏");
				break;
		case AUTUMU:
				System.out.println("秋");
				break;
		case WINTER:
				System.out.println("冬");
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
	星期一,星期二,星期三,星期四,星期五,星期六,星期天
}