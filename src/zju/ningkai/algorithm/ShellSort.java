package zju.ningkai.algorithm;

/**
 * @what 希尔排序实现
 * @author ningkai
 * @since 2016-10-30
 */
public class ShellSort {

	public static int[] shellSort(int[] a) {
		if (a == null || a.length == 0) {
			return null;
		}
		int j = 0;
		int temp = 0;
		for (int increment = a.length / 2; increment > 0; increment /= 2) {
			for (int i = increment; i < a.length; i++) {
				temp = a[i];
				for (j = i; j >= increment; j -= increment) {
					if (temp < a[j - increment]) {
						a[j] = a[j - increment];
					} else {
						break;
					}
				}
				a[j] = temp;
			}
		}
		return a;
	}

}
