package pq;

import java.util.LinkedList;
import java.util.List;

public class UnorderedList<T extends Comparable<T>> implements PriorityQueue<T> {

	public LinkedList<T> list;
	int size = 0;
	public UnorderedList() {
		list = new LinkedList<T>();
	}
	
	@Override
	public boolean isEmpty() {
		if (size == 0){
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void insert(T thing) {
		list.addLast(thing);
		size++;
	}

	@Override
	public T extractMin() {

		T min = list.get(0);
		int minIndex = 0;
		for (int i = 0; i< size; i++){
			T current = list.get(i);
			if (current.compareTo(min) < 0) {
				min = current;
				minIndex = i;
			}

		}
		list.remove(minIndex);
		size--;
		return min;
	}

}
