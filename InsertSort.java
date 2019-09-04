package paixu;

public class InsertSort {

	public static void show() {
		System.out.println("do something");

	}

	public int[] sort(int[] arr) throws Exception {
		// �� arr ���п��������ı��������

		// ���±�Ϊ1��Ԫ�ؿ�ʼѡ����ʵ�λ�ò��룬��Ϊ�±�Ϊ0��ֻ��һ��Ԫ�أ�Ĭ���������
		for (int i = 1; i < arr.length; i++) {

			// ��¼Ҫ���������
			int tmp = arr[i];

			// ���Ѿ�������������ұߵĿ�ʼ�Ƚϣ��ҵ�����С����
			int j = i;
			while (j > 0 && tmp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}

			// ���ڱ���С����������
			if (j != i) {
				arr[j] = tmp;
			}

		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		InsertSort insertSort = new InsertSort();

		int[] a = { 2, 5, 77, 3, 66 };

		try {
			insertSort.sort(a);
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}
	}
}