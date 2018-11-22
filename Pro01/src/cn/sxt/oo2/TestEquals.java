package cn.sxt.oo2;

public class TestEquals {
	public static void main(String[] args) {
			Object obj;
			String str;
			
			User u1 = new User(1000, "aaa", "bbb");
			User u2 = new User(1000, "aaa", "bbb");
			
			System.out.println(u1 == u2);
			System.out.println(u1.equals(u2));
			
			String str1 = new String("qwe");
			String str2 = new String("qwe");
			System.out.println(str1 == str2);
			System.out.println(str1.equals(str2));  // ��� �˴�equals�����String.class�е�equals����  
			/*
			 * Object��������Java��ĸ��࣬���е�Java�඼Ҫ�̳�Object�࣬
			 *  ͨ��д�����ʱ����ʽ�����̳�Object�࣬����Ĭ�ϼ̳�Object�ࡣ
			 *  `
			 *  
			 * String��̳�Object���Ҳ�̳���equals��������String���equals������������д��
			 * 	�ı���equals�����ıȽ���ʽ����ʵ�ܶ�������̳�Object���Ҳ��equals������������д
			 * 
			 * */
	}
	
/*
 * 
 * public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
 * 
 * 
 * 
 * */	
}

class User {
	int id;
	String name;
	String pwd;
	
  public User(int id, String name, String pwd) { // alt+shiift+S  source  constructor flied
  		super();
  		this.id = id;
  		this.name = name;
  		this.pwd = pwd;
  }

@Override
public boolean equals(Object obj) { // alt+shiift+S  hasCode id �Զ�����
		if (this == obj)
				return true;
		if (obj == null)
				return false;
		if (getClass() != obj.getClass())
				return false;
		User other = (User) obj;
		if (id != other.id) // �ж�ID �Ƿ��൱
				return false;
		return true;
}
  
  
}

