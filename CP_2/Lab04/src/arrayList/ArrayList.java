package arrayList;

public class ArrayList<E> implements List<E> {
	
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] elementData;
	private int size = 0;
	
	private void resize() {
		Object[] copiedData = new Object[elementData.length * 2];
		System.arraycopy(elementData, 0, copiedData, 0, elementData.length);
		
		elementData = copiedData;
	}
	
	public ArrayList() {
		
		this.elementData = new Object[DEFAULT_CAPACITY];
	}
	
	public ArrayList(int size) {
		
		this.elementData = new Object[size];
	}

	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder("[");
		for(int i = 0; i < this.size - 1; i++) {
			str.append(this.elementData[i]);
			str.append(", ");
		}
		
		str.append(this.elementData[this.size - 1]);
		str.append("]");
		
		return new String(str);
	}
	
	@Override
	public boolean add(int index, E element) {
		if(index > this.size)
			throw new IndexOutOfBoundsException();
		
		if(this.size == this.elementData.length)
			resize();
		
		for(int i = this.size++ - 1; i >= index; i--) {
			this.elementData[i+1] = this.elementData[i];
		}
		
		this.elementData[index] = element;
		
		return true;
	}

	@Override
	public boolean addFirst(E element) {
		
		return this.add(0, element);
	}

	@Override
	public boolean addLast(E element) {
		if(this.size == this.elementData.length)
			resize();
		
		this.elementData[this.size++] = element;
		
		return true;
	}

	@Override
	public E remove(int index) {
		if(index > this.size - 1)
			throw new IndexOutOfBoundsException();
		
		Object obj = this.elementData[index];
		
		for(int i = index + 1; i < this.size; i++) {
			this.elementData[i - 1] = this.elementData[i];
		}
		
		elementData[size--] = null;
		
		return (E)obj;
	}

	@Override
	public E removeFirst() {
		
		return this.remove(0);
	}

	@Override
	public E removeLast() {
		
		return this.remove(size - 1);
	}

	@Override
	public E get(int index) {
		if(index > this.size - 1)
			throw new IndexOutOfBoundsException();
		
		return (E)this.elementData[index];
	}
	
	@Override
	public E set(int index, E element) {
		if(index > this.size)
			throw new IndexOutOfBoundsException();
		
		E old = (E) this.elementData[index];
		this.elementData[index] = element;
		
		return old;
	}

	@Override
	public int indexOf(E element) {
		for(int i = 0; i < size; i++) {
			if(element.equals(this.elementData[i]))
				return i;
		}
		
		return -1;
	}

	@Override
	public int size() {
		
		return this.size;
	}

	@Override
	public boolean isEmpty() {

		return this.size == 0;
	}
	
	public Iterator<E> iterator(){
		
		return new ListIterator();
	}
	
	public class ListIterator implements Iterator<E> {

		private int nextIndex;
		
		private ListIterator() {
			this.nextIndex = 0;
		}
		
		@Override
		public boolean hasNext() {
			
			return nextIndex < size();
		}

		@Override
		public E next() {
			
			return (E)elementData[nextIndex++];
		}
		
	}
}
