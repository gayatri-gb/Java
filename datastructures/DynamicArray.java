package datastructures;

import java.util.Arrays;

public class DynamicArray<T>{
	Object[] array;
	int size;

	public DynamicArray() {
		size=0;
		array= new Object[1];
		
	}
	public T get(int index) {
		return (T)array[index];
		
	}
	
	public void add(Object value) {
		ensureCapacity(size+1);
		array[size++] = value;
	}
	
	
	public int getSize() {
		return array.length;
	}

	public void ensureCapacity(int minCapacity) {
		int oldCapacity=getSize();
		if(minCapacity>oldCapacity) {
			int newCapacity = oldCapacity*2;
			array= Arrays.copyOf(array, newCapacity);
			if(minCapacity> newCapacity) {
				newCapacity=minCapacity;
			}
			
		}
	}

	@Override
	public String toString() {
		return "DynamicArray [array=" + Arrays.toString(array) + "]";
	}
	public static void main(String[] args) {
		DynamicArray<Integer> list=new DynamicArray<Integer>();
		list.add(4);
		list.add(5);
		list.add(4);
		System.out.println(list.getSize());
		System.out.println(list);

	}

}
