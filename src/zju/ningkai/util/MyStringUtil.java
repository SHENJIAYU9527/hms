package zju.ningkai.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyStringUtil {
	public static String[] toStringArray(List list){
		List <Object[]> row = new ArrayList<Object[]>();
		String [] s = new String [list.size()];
		 Iterator<Object[]> it = list.iterator();
		int i = 0;
		while(it.hasNext()){
			 row.add(((Object[])it.next()));  
	            s[i]=(String)row.get(i)[0]; 
	            i++;  
		}
		return s;
	}

}
