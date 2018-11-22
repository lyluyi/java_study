package cn.sxt.mycollection;

// �Զ���ʵ��ArrayList ���ײ�ԭ��  
// ���ӷ���
// ������������

public class SxtArrayList03<E> { // ���ӷ���
	
	private Object[] elementData;
	private int size; // ����ĳ���
	
	private static final int DEFALT_CAPACITY = 10; // Ĭ�ϳ���10
	
	public SxtArrayList03() { // ����������� ������Ĭ�ϳ���
		elementData = new Object[DEFALT_CAPACITY];
	}
	
	public SxtArrayList03(int capacity) { // ��д���� �����Զ��峤��
		elementData = new Object[capacity];
	}
	
	public void add(E element) {
		
		// ʲôʱ������
		if (size == elementData.length) { // �ж��Ƿ���Ҫ����
				// ��ô����
				Object[] newArray = new Object[elementData.length + (elementData.length >> 1)]; // ����һλ ��ԭ���ȵ�һ��
				System.arraycopy(elementData, 0, newArray, 0, elementData.length);
				elementData = newArray;
		}
			elementData[size++] = element; // ���Ԫ��
	}
	
	@Override
	public String toString() { //
		StringBuilder sb = new StringBuilder();
		
		// [a,b,c] ��ӡ��Ч��
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(elementData[i] + ",");
		}
		sb.setCharAt(sb.length()-1, ']'); // "]" ��˫���žʹ��� ˫������String���� sb ��StringBuilder���� ֻ�ܴ�char
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		SxtArrayList03 s1 = new SxtArrayList03(20); // ������20�ĳ���
		
		for (int i = 0; i < 40; i++) {
			s1.add("aaa" + i);
		}
		

		
		System.out.println(s1);  // ��ӡ�����Ľ�� cn.sxt.mycollection.SxtArrayList03@6d06d69c
		// ϣ�����ӻ�һ�� ������дtoString����

	}
}
