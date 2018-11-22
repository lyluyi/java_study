package cn.sxt.mycollection;

// 自定义一个HashMap
// 增加get方法


public class SxtHashMap03 {
		Node2[]  table; // 位桶数组
		int size; // 存放的键值对的个数
		
		public SxtHashMap03() {
				table = new Node2[16]; //长度一般自定义为2的次幂
		}
		
		public Object get(Object key) {
				int hash = myHash(key.hashCode(), table.length);
				
				Object value = null;
				
				if (table[hash]!=null) {
						Node2 temp = table[hash];
						
						while (temp!=null) {
								if (temp.key.equals(key)) { //如果相等，则说明找到了键值对 返回对应的value
										value = temp.value;
										break;
								} else {
										temp = temp.next;
								}
						}
				}
				return value;
		}
		
		public void put(Object key, Object value) {
				Node2 newNode = new Node2();
				
				newNode.hash = myHash(key.hashCode(), table.length);
				
				newNode.key = key;
				newNode.value = value;
				newNode.next = null;
				
				Node2 temp = table[newNode.hash];
				
				Node2 iterLast = null; // 正在遍历的最后一个元素
				
				boolean keyRepeat = false;
				
				if (temp == null) {
						// 此处数组元素为空 则直接将新节点放入
						table[newNode.hash] = newNode;
						size++;
				}else {
						// 此处数组元素不为空 则遍历对应链表
						while (temp != null) {
								// 判断key如果重复 则覆盖
								if (temp.key.equals(key)) {
										
										System.out.println("key重复了！");
										keyRepeat = true;
										temp.value = value; // 只是覆盖了value即可 其它值（next，key，hash不变）
										
										break; // 并且结束整个循环
										
								} else {
										
										// key不重复
										iterLast = temp;
										temp = temp.next;
								}
						}
						if (!keyRepeat) { // 没有发生key重复的情况下  则添加到链表最后
								iterLast.next = newNode;
								size++;
						}
				}
		}
		
		@Override
		public String toString() {
				StringBuilder sb = new StringBuilder("{");
				for (int i = 0; i < table.length; i++) { // 遍历数组
						Node2 temp = table[i];
						
						while (temp!=null) { // 遍历链表
								sb.append(temp.key+ ":" + temp.value + ",");
								temp = temp.next;
						}
				}
				sb.setCharAt(sb.length()-1, '}');
				
				return sb.toString();
		}
		
		public static int myHash(int v, int length) {
//				System.out.println("hash in maHash:" + (v&(length - 1))); // 直接位运算 效率高
//				System.out.println("hash in maHash:" + (v%(length - 1))); // 取模运算 效率低
				
				return v&(length - 1);
		}
		
		public static void main(String[] args) {
				 SxtHashMap03 m = new SxtHashMap03();
				 m.put(10, "aa");
				 m.put(20, "bb");
				 m.put(30, "cc");
				 m.put(20, "ss");

				 m.put(53, "gg");
				 m.put(69, "hh");
				 m.put(85, "kk");
				 
				 for (int i = 10; i < 100; i++) {
						System.out.println(i + "-----" + myHash(i,16)); // 53. 69 85 的hash值相同 都为5
				}
				 
				 System.out.println(m);
				 System.out.println(m.get(10));
		}
}
