package cn.sxt.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		try {
				FileReader reader = new FileReader("D:\\a.txt");
				// ���������ִ��� ����Ľ׶�һ�㶼��Ҫ�쳣�������
				
				// �����ȡ ������ô���£�
				char c1 = (char)reader.read();
				System.out.println(c1);
		} catch (FileNotFoundException e) { // �쳣���� һ���������쳣��ǰ  һ�㶼��������ǰ
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (IOException e) { // ����
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}
