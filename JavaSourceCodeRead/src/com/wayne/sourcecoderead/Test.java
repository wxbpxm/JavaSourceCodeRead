package com.wayne.sourcecoderead;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		Map<String, String> tmpMap = new HashMap<>();
		
		tmpMap.put("11", "11");
		tmpMap.put("12", "12");
		tmpMap.put("13", "13");
		tmpMap.put(null, "aaa");//是可以放入key为null的值的。
		tmpMap.put(null, "bbb");
		
//		for(Entry<String, String> entry : tmpMap.entrySet()) {
//			System.out.println(entry.getKey() + ":" + entry.getValue());
//			tmpMap.remove(entry.getKey());
//		}
		
		Iterator<Entry<String, String>> it = tmpMap.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, String> entry = it.next();
			System.err.println(entry.getKey() + ":" + entry.getValue());
			it.remove();
			System.out.println("size:" + tmpMap.size());
		}
		
		
	}

}
