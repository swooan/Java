package org.comstudy21.day18_1;

class LinkedList {
	class Node {
		int num;
		Node Next = null;
	}
	
	Node start = null, last, cur;
	
	public void add(int num) {
		Node newNode = new Node();
		newNode.num = num;
		if(start == null) {
			start = newNode;
			last = start;
			return;
		}
		last.Next = newNode;
		last = newNode;
	}
	
	public void showList() {
		cur = start;
		while(cur != null) {
			System.out.print(cur.num + " ");
			cur=cur.Next;
		}
	}
	
	public int find(int num) {
		int result = -1;
		
		cur = start;
		while(cur != null) {
			if(cur.num == num) {
				return num;
			}
			
			cur=cur.Next;
		}
		
		return result;
	}
}

public class Day18Ex01_LinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.showList();
		
		int i = list.find(300);
		if(i != -1) {
			System.out.println("\n리스트에 존재합니다.");
		}
		else {
			System.out.println("\n찾을 수 없습니다.");
		}
	}

}
