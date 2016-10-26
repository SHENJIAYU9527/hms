package zju.ningkai.algorithm;

/**
 * @what 插入排序，输入一个数组，输出排序后的数组
 * @author ningkai @2016-10-26
 */
public class InsertionSort {

	public static int[] insertSort(int[] array) {

		if (array == null || array.length == 0) {
			return null;
		}
		for (int i = 1; i < array.length; i++) {
			int currentValue = array[i];
			int position = i;
			for (int j = i - 1; j >= 0; j--) {
				if (array[j] > currentValue) {
					array[j + 1] = array[j];
					position -= 1;
				} else {
					break;
				}
			}

			array[position] = currentValue;
		}
		return array;

	}

	public static int[] insertSortByDesc(int[] array) {

		if (array == null || array.length == 0) {
			return null;
		}
		for (int i = array.length-2; i>=0; i--) {
			int currentValue = array[i];
			int position = i;
			for (int j = i + 1; j <array.length; j++) {
				if (array[j] > currentValue) {
					array[j - 1] = array[j];
					position += 1;
				} else {
					break;
				}
			}

			array[position] = currentValue;
		}
		return array;

	}

	public static void printArray(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		int[] array = { 3, -1, 0, -8, -1, 1 };

		insertSortByDesc(array);
		printArray(array);

	}

}
