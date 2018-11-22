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
			System.out.println(str1.equals(str2));  // 因此 此处equals会调用String.class中的equals方法  
			/*
			 * Object类是所有Java类的父类，所有的Java类都要继承Object类，
			 *  通常写程序的时候不显式声明继承Object类，而是默认继承Object类。
			 *  `
			 *  
			 * String类继承Object类后，也继承了equals方法，但String类对equals方法进行了重写，
			 * 	改变了equals方法的比较形式。其实很多其他类继承Object类后也对equals方法进行了重写
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
public boolean equals(Object obj) { // alt+shiift+S  hasCode id 自动生成
		if (this == obj)
				return true;
		if (obj == null)
				return false;
		if (getClass() != obj.getClass())
				return false;
		User other = (User) obj;
		if (id != other.id) // 判断ID 是否相当
				return false;
		return true;
}
  
  
}

