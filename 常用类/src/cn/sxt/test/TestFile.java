package cn.sxt.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

// ����file��Ļ�������

public class TestFile {
		public static void main(String[] args) throws IOException {
				File f = new File("d:/a.txt");
				System.out.println(f);
				f.renameTo(new File("d:/aa.txt")); // �޸��ļ�����
				System.out.println(System.getProperty("user.dir"));
				
				File f2 = new File("gg.txt");
//				f2.createNewFile(); // �½��ļ�  ����·����ǰ���� �ڵ�ǰ��Ŀ�ռ����½�
				
				System.out.println("File�Ƿ���ڣ�"+f2.exists());
        System.out.println("File�Ƿ���Ŀ¼��"+f2.isDirectory());
        System.out.println("File�Ƿ����ļ���"+f2.isFile());
        System.out.println("File����޸�ʱ�䣺"+new Date(f2.lastModified()));
        System.out.println("File�Ĵ�С��"+f2.length());
        System.out.println("File���ļ�����"+f2.getName());
        System.out.println("File��Ŀ¼·����"+f2.getPath());
        
        File f3 = new File("d:/��Ӱ/����/��½");
//        boolean flag = f3.mkdir(); // ��Ŀ¼����һ���ṹ������ �򲻻ᴴ��Ϊfalse
        boolean flag = f3.mkdirs(); // ��������  ���ᴴ��
        
		}

}
