package tdd_nadal;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
	
	private List<T> values;
	private int index = 0;
	private int maxSize;

	public Stack(int i) {
		this.maxSize = maxSize;
		values = new ArrayList<T>();
	}
	
	public T top() {
		return values.get(index-1);
	}
	
	public void push(T value) throws StackFullException {
		if(this.size() == maxSize) {
			throw new StackFullException();
		}
			values.add(value);
			index++;
	
	}
	
	public int size() {
		return values.size();
	}
	
	public boolean isEmpty() {
		return false;
	}

	public T pop() {
		T value = this.top();
		values.remove(value);
		return value;
	}

}
