// 构造器

class Point { // 一个二维的点类
	double x, y; // x, y 成员变量
	public Point(double _x, double _y) { // 构造器的方法名 必须和 类名一致
		x = _x; // _x 局部变量
		y = _y;
	}
	public double getDistance(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y+p.y));
	}
}


	public class TestConstructor {
		public static void main(String[] args) {
			Point p = new Point(3.0, 4.0); // 先生成一个坐标点的类 将参数值赋值给double x y
			Point origin = new Point(0.0, 0.0); // 再生成一个中心点的类
			System.out.println(p.getDistance(origin)); // 然后调用方法
		}
	}

