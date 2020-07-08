package day18.model;

import day18.view.DObject;

public class DLinkedList {

	DObject start, last, cur;
	
	public void append(DObject obj) {
		if(start == null) {
			start = obj;
			last = start;
			return;
		}
		last.next = obj;
		last = obj;
	}
	
	public void showList() {
		cur = start;
		while(cur != null) {
			cur.draw();
			cur = cur.next;
		}
	}
	
	public DObject remove() {
		DObject tmp;
		if(start == null) {
			return null;
		}
		if(start == last) {
			tmp = start;
			start = last = null;
			return tmp;
		}
		
		cur = start;
		while(cur.next.next != null) {
			cur = cur.next;
		}
		tmp = last;
		last = cur;
		last.next = null;
		
		return tmp;
	}
	
}
