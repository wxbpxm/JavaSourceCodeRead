package com.wayne.sourcecoderead;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRelate {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("111");
		list.add("112");
		list.add("113");
		
		//contains
		boolean contain = list.contains("1122");
		System.out.println(contain);
		
		//List to Array call toArray
		Object[] ary = list.toArray();
		System.out.println("ary:"+ Arrays.toString(ary)); //这里利用Arrays.toString把一个array直接输入成字符串
		
		//Array to list call toArray
		List<Object> convertedList = Arrays.asList(ary);
		System.out.println("convertedList:"+convertedList);
		
		//判断是否相当 equals
		boolean equals = convertedList.equals(list);
		System.out.println("equals:" + equals);
		
		System.out.println("hashCode:"+list.hashCode());
	}

}
