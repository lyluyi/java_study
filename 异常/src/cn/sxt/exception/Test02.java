package cn.sxt.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		try {
				FileReader reader = new FileReader("D:\\a.txt");
				// 类似于这种处理 编译的阶段一般都需要异常处理机制
				
				// 这里读取 又是怎么回事！
				char c1 = (char)reader.read();
				System.out.println(c1);
		} catch (FileNotFoundException e) { // 异常处理 一般是子类异常在前  一般都是子类在前
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (IOException e) { // 父类
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}
