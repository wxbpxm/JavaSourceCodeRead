/**
 * 在Java多线程应用中，队列的使用率很高，多数生产消费模型的首选数据结构就是队列。Java提供的线程安全的Queue可以分为阻塞队列和非阻塞队列，
 * 其中阻塞队列的典型例子是BlockingQueue，非阻塞队列的典型例子是ConcurrentLinkedQueue，在实际应用中要根据实际需要选用阻塞队列或者非阻塞队列。
 */
package com.wayne.sourcecoderead;

import java.util.ArrayDeque;

public class QueueRelate {

	public static void main(String[] args) {
		ArrayDeque<String>  queue = new ArrayDeque<>();
		
		queue.add("d");// 添加元素到队列中，相当于进入队尾排队。
		queue.add("f");// 添加元素到队列中，相当于进入队尾排队。
		queue.add("a");// 添加元素到队列中，相当于进入队尾排队。
		queue.add("z");// 添加元素到队列中，相当于进入队尾排队。
		queue.offer("g");// 添加元素到队列中，相当于进入队尾排队。
		queue.offer("h");// 添加元素到队列中，相当于进入队尾排队。
//		queue.offer(null);//这里是不能往队列里放null值的（会报空指针异常），因为peek和poll方法是通过返回null来判断队列是否是空队列的。
		/** 上面add, offer两个方法，从doc说明上来看，两者的基本上没什么区别。之所以定义了这两个方法是因为Deque继承了Collection,
		 *  Queue两个接口，而这两个接口中都定义了增加元素的方法声明。他们本身的目的是一样的，只是在队列里头，添加元素肯定只是限于在队列的头或者尾添加。
		 *  而offer作为一个更加适用于队列场景中的方法，也有存在的意义。他们的实现基本上一样，只是名字不同罢了。 */
		
		//集合方式遍历，元素不会被移除 
		 System.out.println("------集合方式遍历，元素不会被移除 -----"); 
		for(String tmp : queue) {
			System.out.println(tmp);
		}
		 System.out.println("-------队列方式遍历，元素逐个被移除 -----"); 
	    //队列方式遍历，元素逐个被移除 
        while (queue.peek() != null) { 
            System.out.println(queue.poll()); 
        } 
		
		
		
		
		
	}

}
