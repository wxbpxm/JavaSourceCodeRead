package com.wayne.sourcecoderead;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapRelate {

	public static void main(String[] args) {
		
		//HashMap不支持线程同步，即任一时刻可以有多个线程同时写HashMap，可能会导致数据的不一致性。如果需要同步，可以用Collections的synchronizedMap方法使HashMap具有同步的能力。
		Map<String, String> tmpMap = new HashMap<>();
		
		tmpMap.put("asdf", "aaa");
		tmpMap.put("bsd", "bbb");
		tmpMap.put("sadf", "ccc");
		tmpMap.put("sdf", "ddd");
		tmpMap.put(null, "eee");//是可以放入key为null的值的。
		tmpMap.put("ggg", null);//是可以放入value为null的值的。
		
		
		//通过entrySet遍历
		System.err.println("****************通过entrySet遍历HashMap******************************");
		for(Entry<String, String> entry : tmpMap.entrySet()) {
			System.err.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.err.println("****************通过keySet遍历HashMap******************************");
		//通过keySet遍历
		for(String key : tmpMap.keySet()) {
			System.err.println(key + ":" + tmpMap.get(key));
		}
		
		System.err.println(tmpMap.containsKey("111")); //判断是否包含111的key
		
		System.err.println(tmpMap.containsValue("eee"));//判断是否包含eee的value
		
		//通过迭代器遍历，并可以实现动态删除
		System.err.println("****************通过迭代器遍历并动态删除元素HashMap******************************");
		Iterator<Entry<String, String>> it = tmpMap.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, String> entry = it.next();
			System.err.println(entry.getKey() + ":" + entry.getValue());
			it.remove();
			System.err.println("size:" + tmpMap.size());
		}
		
		
		Map<String, String>  tmpTable = new Hashtable<>();
		tmpTable.put("asdf", "aaa");
		tmpTable.put("bsd", "bbb");
		tmpTable.put("sadf", "ccc");
		tmpTable.put("sdf", "ddd");
//		tmpTable.put(null, "eee");//Hashtable是不可以放入key为null的值的。
//		tmpTable.put("ggg", null);//Hashtable是不可以放入value为null的值的。
		System.err.println("****************通过keyset遍历Hashtable******************************");
		for(String key : tmpTable.keySet()) {
			System.err.println(key + ":" + tmpTable.get(key));
		}
		
		/*********************************************************/
		
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("asdf", "aaa");
		linkedHashMap.put("bsd", "bbb");
		linkedHashMap.put("sadf", "ccc");
		linkedHashMap.put("sdf", "ddd");
		linkedHashMap.put(null, "eee");//是可以放入key为null的值的。
		linkedHashMap.put("ggg", null);//是可以放入value为null的值的。
		
		System.err.println("****************遍历LinkedHashMap, 会发现和放入是顺序相同 ******************************");
		for(String key : linkedHashMap.keySet()) {
			System.err.println(key +":" + linkedHashMap.get(key));
		}
		
		/*********************************************************/
		
		TreeMap<String, String> treeMap = new TreeMap<>();
		
		treeMap.put("asdf", "aaa");
		treeMap.put("sadf", "ccc");
		treeMap.put("bsd", "bbb");
		treeMap.put("sdf", "ddd");
		treeMap.put("ggg", null);//是可以放入value为null的值的。
//		treeMap.put(null, "eee");//注意这里是不可以放入key为null的值的。因为TreeMap为了保持有序，放入的时候会进行对象的比较，里面不允许key为空
		
		System.err.println("****************遍历treeMap, 会发现是排过序的 ******************************");
		for(String key : treeMap.keySet()) {
			System.err.println(key +":" + treeMap.get(key));
		}
		System.err.println("****************把treeMap的subMap取出遍历 ******************************");
		Map<String, String> subMap = treeMap.subMap("asdf", "sdf");
		for(String key : subMap.keySet()) {
			System.out.println(key + ":" + subMap.get(key));
		}
	}

}
