package com.java.oopcollection;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class LaunchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad = new ArrayDeque(); // Use Dynamic array
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.addFirst(100);
		ad.addLast(200);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		System.out.println(ad);

		PriorityQueue pq = new PriorityQueue(); // Min Heap data structure
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.offer(999));
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.retainAll(List.of(75, 150)));
		System.out.println(pq);
		pq.clear();
		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

		PriorityQueue pq2 = new PriorityQueue();
		pq.add("a");
		pq.add("z");
		pq.add("f");
		pq.add("e");
		System.out.println(pq2);

		TreeSet ts = new TreeSet(); // (Sorted) Red - black balance binary tree algorithm
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
		System.out.println(ts.ceiling(75));
		System.out.println(ts.floor(70));
		System.out.println(ts.higher(75));
		System.out.println(ts.lower(75));

		System.out.println(ts.last());
		System.out.println(ts.first());
		System.out.println(ts.contains(75));
		ts.remove(125);
		System.out.println(ts);
		System.out.println(ts.size());

		HashSet hs = new HashSet(); // Use hashing algo
		hs.add(100);
		hs.add(20);
		hs.add(30);
		hs.add(99);

	}

}
