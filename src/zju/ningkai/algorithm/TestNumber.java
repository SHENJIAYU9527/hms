package zju.ningkai.algorithm;
/**
 * @what 从1-5五个数字中选择不同的三个组成百位数，满足个位数加上百位数等于十位数，输出所有满足条件的百位数
 * @author ningkai
 * @since 2016-10-25
 */
public class TestNumber {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				for (int k = 1; k < 6; k++) {
					if (!(k == j || j == i || i == k)) {
						if (j == (i + k)) {
							System.out.println(i + "" + j + "" + k);
						}
					}
				}
			}
		}

	}

}
