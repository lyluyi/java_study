package cn.sxt.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

// 测试file类的基本内容

public class TestFile {
		public static void main(String[] args) throws IOException {
				File f = new File("d:/a.txt");
				System.out.println(f);
				f.renameTo(new File("d:/aa.txt")); // 修改文件命名
				System.out.println(System.getProperty("user.dir"));
				
				File f2 = new File("gg.txt");
//				f2.createNewFile(); // 新建文件  不加路径的前期下 在当前项目空间下新建
				
				System.out.println("File是否存在："+f2.exists());
        System.out.println("File是否是目录："+f2.isDirectory());
        System.out.println("File是否是文件："+f2.isFile());
        System.out.println("File最后修改时间："+new Date(f2.lastModified()));
        System.out.println("File的大小："+f2.length());
        System.out.println("File的文件名："+f2.getName());
        System.out.println("File的目录路径："+f2.getPath());
        
        File f3 = new File("d:/电影/华语/大陆");
//        boolean flag = f3.mkdir(); // 若目录中有一个结构不存在 则不会创建为false
        boolean flag = f3.mkdirs(); // 无论有无  都会创建
        
		}

}
