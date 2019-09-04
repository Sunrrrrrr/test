package paixu;

public class InsertSort {

	public static void show() {
		System.out.println("do something");

	}

	public int[] sort(int[] arr) throws Exception {
		// 对 arr 进行拷贝，不改变参数内容

		// 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
		for (int i = 1; i < arr.length; i++) {

			// 记录要插入的数据
			int tmp = arr[i];

			// 从已经排序的序列最右边的开始比较，找到比其小的数
			int j = i;
			while (j > 0 && tmp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}

			// 存在比其小的数，插入
			if (j != i) {
				arr[j] = tmp;
			}

		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		InsertSort insertSort = new InsertSort();

		int[] a = { 2, 5, 77, 3, 66 };

		try {
			insertSort.sort(a);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}
	}
}