package com.wayne.sourcecoderead;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapRelate {

	public static void main(String[] args) {
		Map<String, String> tmpMap = new HashMap<>();
		
		tmpMap.put("asdf", "aaa");
		tmpMap.put("bsd", "bbb");
		tmpMap.put("sadf", "ccc");
		tmpMap.put("sdf", "ddd");
		tmpMap.put(null, "eee");//是可以放入key为null的值的。
		
		//通过entrySet遍历
		System.err.println("****************通过entrySet遍历******************************");
		for(Entry<String, String> entry : tmpMap.entrySet()) {
			System.err.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.err.println("****************通过keySet遍历******************************");
		//通过keySet遍历
		for(String key : tmpMap.keySet()) {
			System.err.println(key + ":" + tmpMap.get(key));
		}
		
		System.err.println(tmpMap.containsKey("111")); //判断是否包含111的key
		
		System.err.println(tmpMap.containsValue("eee"));//判断是否包含eee的value
		
		//通过迭代器遍历，并可以实现动态删除
		System.err.println("****************通过迭代器遍历并动态删除元素******************************");
		Iterator<Entry<String, String>> it = tmpMap.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, String> entry = it.next();
			System.err.println(entry.getKey() + ":" + entry.getValue());
			it.remove();
			System.err.println("size:" + tmpMap.size());
		}

		
		/*********************************************************/
		
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("asdf", "aaa");
		linkedHashMap.put("bsd", "bbb");
		linkedHashMap.put("sadf", "ccc");
		linkedHashMap.put("sdf", "ddd");
		linkedHashMap.put(null, "eee");//是可以放入key为null的值的。
		
		System.err.println("****************遍历LinkedHashMap, 会发现和放入是顺序相同 ******************************");
		for(String key : linkedHashMap.keySet()) {
			System.err.println(key +":" + linkedHashMap.get(key));
		}
		
		/*********************************************************/
		
		Map<String, String> treeMap = new TreeMap<>();
		
		treeMap.put("asdf", "aaa");
		treeMap.put("sadf", "ccc");
		treeMap.put("bsd", "bbb");
		treeMap.put("sdf", "ddd");
//		treeMap.put(null, "eee");//注意这里是不可以放入key为null的值的。因为TreeMap为了保持有序，放入的时候会进行对象的比较，里面不允许key为空
		
		System.err.println("****************遍历treeMap, 会发现是排过序的 ******************************");
		for(String key : treeMap.keySet()) {
			System.err.println(key +":" + treeMap.get(key));
		}
		
	}

}
