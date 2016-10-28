package zju.ningkai.algorithm;

import java.util.Arrays;

public class StringAPI {

	public static void main(String[] args) {
		String str="Hello World,我是杜宁凯！";
		String str2=str.substring(2);
		String str3=str.substring(2,6);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str.length());
		char[] char_str=str.toCharArray(); //字符串转换成数组
		System.out.println(char_str[15]);
		System.out.println(char_str.length);
		Arrays.sort(char_str);
		System.out.println(char_str[15]);
		System.out.println(Arrays.toString(char_str)); //数组转换成字符串
		int number=6;
		String number2str=String.valueOf(number); //int to String
		System.out.println(number2str);
		int str2number=Integer.valueOf(number2str);//String to int
		System.out.println(str2number);

	}
	

}
