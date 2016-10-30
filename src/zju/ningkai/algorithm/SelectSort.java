package zju.ningkai.algorithm;

/**
 * @what 简单选择排序
 * @author ningkai
 * @since 2016-10-30
 */
public class SelectSort {

	public static int[] selectSort(int[] a){
		if(a==null||a.length==0){
			return null;
		}
		int position=0;
		for(int i=0;i<a.length;i++){
			int j=i+1;
			position=i;
			int temp=a[i];
			for(;j<a.length;j++){
				if(a[j]<temp){
					temp=a[j];
					position=j;
				}
			}
			a[position]=a[i];
			a[i]=temp;
		}
		return a;
	}
	

}
