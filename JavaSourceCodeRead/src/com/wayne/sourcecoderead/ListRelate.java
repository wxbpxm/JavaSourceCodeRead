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
		
		//根据下标位置设置元素 set
		list.set(1, "113");
		System.out.println(list);
		
		//根据元素内容查看在list中的位置(第一个实例或最后一个实例所在的位置分别用indexOf和lastIndexOf)
		System.out.println("index of 113："+list.indexOf("113"));
		System.out.println("last index of 113："+list.lastIndexOf("113"));
		
		//取子列表 subList
		List<String> subList = list.subList(1, 3);
		System.out.println(subList);
	 
	}

}
