package day18.view;

public abstract class DObject {
	public DObject next;
	public DObject() {
		next = null;
	}

	public abstract void draw(); 
}
