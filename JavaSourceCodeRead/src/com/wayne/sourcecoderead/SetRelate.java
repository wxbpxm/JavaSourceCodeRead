package com.wayne.sourcecoderead;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetRelate {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();

		hashSet.add("111");
		hashSet.add("333");
		hashSet.add(new String("222"));
		hashSet.add(null); // 可以添加null值
		hashSet.add(new String("222"));
		System.err.println(hashSet);// 输出[null, 111, 222, 333] 说明是无序的，和放入的顺序不一致了, 并且说明222只保留了一份，达到的去重效用
		
		

		Iterator<String> it = hashSet.iterator();
		while (it.hasNext()) {
			System.err.println("current:" + it.next());
			it.remove();
			System.err.println("current set size:" + hashSet.size());
		}

		// 有序set
		SortedSet<String> sortedSet = new TreeSet<>();
		sortedSet.add("z");
		sortedSet.add("a");
		sortedSet.add("c");
		sortedSet.add("b");
		sortedSet.add("e");
		sortedSet.add("d");
		sortedSet.add("g");
		System.err.println(sortedSet);// [a, b, c, d, e, g, z] 已经是排好序的

		// first():返回此 set 中当前第一个（最低）元素。
		String fe = sortedSet.first();
		System.err.println("\n第一个元素：" + fe);

		// last():返回此 set 中当前最后一个（最高）元素。
		String le = sortedSet.last();
		System.err.println("最后一个元素：" + le);

		// headSet():返回此 set 的部分视图，其元素严格小于 toElement。
		System.err.print("集合中小于d(不包括)的元素：");
		SortedSet<String> headE = sortedSet.headSet("d");
		System.err.println(headE);
 
		// tailSet():返回此 set 的部分视图，其元素大于等于 fromElement。
		System.err.print("集合中大于d(包括)的元素：");
		SortedSet<String> tailE = sortedSet.tailSet("d");
		System.err.println(tailE);

		// subSet():返回此 set 的部分视图，其元素从 fromElement（包括）到 toElement（不包括）。
		System.err.print("集合中在d(包括)和g(不包括)之间的元素：");
		SortedSet<String> subE = sortedSet.subSet("d", "g");
		System.err.println(subE);
		
		//LinkedHashSet具有HashSet的查询速度，且内部使用链表维护元素的顺序（保持有序，和ArrayList类似）
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("111");
		linkedHashSet.add("222");
		linkedHashSet.add("333");
		
		System.err.println("linked Hash Set elements:");
		for(String tmp : linkedHashSet) {
			System.err.println(tmp);
		}
		
	}

}
