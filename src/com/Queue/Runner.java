package com.Queue;

import java.util.PriorityQueue;

//lets study the queue
//the first element added is known as the head and the last
//element is known as the tail
//process of addding an element is enqueue and process of deleting is known as
//deques
//priority queue is the implementation class of the queue interface
public class Runner {
	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.add(10);
		p.add(10.2);
		p.add("jusbin");
		p.add("jusbin");
		p.add(null);
		p.add(true);
		System.out.println(p);
		
	}
}
