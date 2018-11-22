// ������

class Point { // һ����ά�ĵ���
	double x, y; // x, y ��Ա����
	public Point(double _x, double _y) { // �������ķ����� ����� ����һ��
		x = _x; // _x �ֲ�����
		y = _y;
	}
	public double getDistance(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y+p.y));
	}
}


	public class TestConstructor {
		public static void main(String[] args) {
			Point p = new Point(3.0, 4.0); // ������һ���������� ������ֵ��ֵ��double x y
			Point origin = new Point(0.0, 0.0); // ������һ�����ĵ����
			System.out.println(p.getDistance(origin)); // Ȼ����÷���
		}
	}

