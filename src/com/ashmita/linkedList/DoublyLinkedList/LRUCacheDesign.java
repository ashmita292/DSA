package com.ashmita.linkedList.DoublyLinkedList;
/**
 * 
 * Time Complexity : get(key) –> O(1) and put(key, value) –> O(1)
 * Auxiliary Space : O(capacity)
 * 
 */
import java.util.HashMap;
import java.util.Map;

class Node1{
	int key;
	int value;
	Node1 prev;
	Node1 next;
	Node1(int key , int value){
		this.key = key;
		this.value = value;
		this.next = null;
		this.prev = null;
	}
}

class LRUCache{
	private int capacity;
	private Map<Integer, Node1> cacheMap;
	private Node1 head;
	private Node1 tail;
	
	LRUCache(int capacity){
		this.capacity = capacity;
		this.cacheMap = new HashMap<>();
		this.head = new Node1(-1,-1);
		this.tail = new Node1(-1,-1);
		this.head.next  = this.tail;
		this.tail.prev = this.head;
	}
	
	int get(int key) {
		if(!cacheMap.containsKey(key)) {
			return -1;
		}
		Node1 node =cacheMap.get(key);
		remove(node);
		add(node);
		return node.value;
	}
	
	void put(int key, int value) {
		if(cacheMap.containsKey(key)) {
			Node1 oldNode = cacheMap.get(key);
			remove(oldNode);
		}
		Node1 node = new Node1(key, value);
		cacheMap.put(key, node);
		add(node);
		
		if(cacheMap.size()> capacity) {
			Node1 nodeToDelete = this.tail.prev;
			remove(nodeToDelete);
			cacheMap.remove(nodeToDelete.key);
		}
	}

	private void remove(Node1 node) {
		Node1 prevNode = node.prev;
		Node1 nextNode = node.next;
		prevNode.next =nextNode;
		nextNode.prev = prevNode;
	}
	
	private void add(Node1 node) {
		Node1 nextNode = head.next;
		head.next = node;
		node.prev = head;
		node.next = nextNode;
		nextNode.prev = node;
	}
	
}

public class LRUCacheDesign {

	public static void main(String[] args) {
			LRUCache cache= new LRUCache(2);
			cache.put(1, 1);
	        cache.put(2, 2);
	        System.out.println(cache.get(1));
	        cache.put(3, 3);
	        System.out.println(cache.get(2));
	        cache.put(4, 4);
	        System.out.println(cache.get(1));
	        System.out.println(cache.get(3));
	        System.out.println(cache.get(4));
	}

}
