package cn.sxt.mycollection;

import javax.management.RuntimeErrorException;

// 自定义一个链表
//  还需要一个节点对象 Node 
// 添加get方法

public class SxtLinkedList02 {
	
		private Node first;
		private Node last;
		
		private int size;
		
		// [a,b,c,d,e] index=2 first.next.next 两次
		public Object get(int index) {
			
			if (index < 0 || index > size -1) {
					throw new RuntimeErrorException(null, "索引数字不合法：" + index);
			}
				
			
			Node temp = null;
			
			if (index < (size >> 1)) { // 右移一位 相当于 size/2
					
				temp = first;
				for (int i = 0; i < index; i++) {
						temp = temp.next; // 小于size的一半 从前往后找
				}
			} else {
					
				temp = last;
				for (int i = size - 1;i > index - 1; i--) {
						temp = temp.previous;
				}
			}	
			return temp.element;
			
		}
		
		public static void name() {
				
		}
		
		// 开始为[]
		public void add(Object obj) {
			Node node = new Node(obj);
			
			if (first == null) { // 第一个节点为null时
				
//				node.previous = null;
//				node.next = null;
					
				first = node; // 将node给头节点
				last = node; // node也作尾节点
			} else {
				node.previous = last;
				node.next = null;
				
				last.next = node;
				last = node;
			}
			size++;
		}
		
		@Override
		public String toString() { 
			// [a,b,c] first = a, last = c
				StringBuilder sb = new StringBuilder("[");
				Node temp = first;
				while(temp != null) {
					sb.append(temp.element + ",");
					System.out.println(temp.element);
					temp = temp.next;
				}
				sb.setCharAt(sb.length()-1, ']');
			return sb.toString();
		}
		
		public static void main(String[] args) {
				SxtLinkedList02 list = new SxtLinkedList02();
				
				list.add("a");
				list.add("b");
				list.add("c");
				list.add("e");
				list.add("f");
				list.add("g");
				
				System.out.println(list);

				System.out.println(list.get(5));
		}
		
}
