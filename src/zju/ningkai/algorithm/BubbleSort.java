package zju.ningkai.algorithm;

/**
 * @what 冒泡排序   性能较差
 * @author ningkai
 *
 */
public class BubbleSort {
    public static int[] bubbleSort1(int[] a){
    	if (a == null || a.length == 0) {
			return null;
		}
    	int temp=0;
    	for(int i=0;i<a.length-1;i++){
    		for(int j=0;j<a.length-1-i;j++){
    			if(a[j]>a[j+1]){
    				temp=a[j];
    				a[j]=a[j+1];
    				a[j+1]=temp;
    			}
    		}
    		
    	}
    	return a;
    	
    }
	

}
