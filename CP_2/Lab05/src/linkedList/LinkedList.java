package linkedList;

import arrayList.Iterator;
import arrayList.List;

public class LinkedList<T> implements List<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	private Node<T> node(int index) {
			Node<T> x = head;

			for(int i = 0; i < index; i++)
					x = x.next;

			return x;
	}

	@Override
	public int size() {
			return size;
	}

	@Override
	public boolean isEmpty() {
			return size == 0;
	}

	@Override
	public boolean add(int index, T element) {
			if(index < 0 || index > size)
					throw new IndexOutOfBoundsException();
			if(index == 0)
					addFirst(element);
			else {
					Node<T> temp1 = node(index - 1);
					Node<T> temp2 = temp1.next;

					Node<T> newNode = new Node<>(element);

					temp1.next = newNode;
					newNode.next = temp2;
					size++;

					if(newNode.next == null)
							tail = newNode;
			}
			return true;
	}

	@Override
	public boolean addFirst(T element) {
			Node<T> newNode = new Node<>(element);

			newNode.next = head;
			head = newNode;
			size++;

			if(head.next == null)
					tail = head;

			return true;
	}

	@Override
	public boolean addLast(T element) {
			if(isEmpty())
					addFirst(element);
			else {
					Node<T> newNode = new Node<>(element);
					tail.next = newNode;
					tail = newNode;
					size++;
			}
			return true;
	}

	@Override
	public T removeFirst() {
			Node<T> temp = head;
			head = temp.next;
			T returnData = temp.data;
			temp = null;
			size--;
			return returnData;
	}

	@Override
	public T removeLast() {
			return remove(size - 1);
	}

	@Override
	public T remove(int index) {
			if(index < 0 || index >= size)
					throw new IndexOutOfBoundsException();
			if(index == 0)
					return removeFirst();

			Node<T> temp = node(index - 1);
			Node<T> nodeToDelete = temp.next;
			temp.next = temp.next.next;
			T returnData = nodeToDelete.data;
			if(nodeToDelete == tail)
					tail = temp;
			nodeToDelete = null;
			size--;
			return returnData;
	}

	@Override
	public T get(int index) {
			if(index < 0 || index >= size)
					throw new IndexOutOfBoundsException();
			return node(index).data;
	}

	@Override
	public int indexOf(T element) {
			Node<T> p = head;
			int index = 0;
			while(p != null) {
					if(p.data == element)
							return index;
					p = p.next;
					index++;
			}
			return -1;
	}

	@Override
	public T set(int index, T element) {
			if(index > size)
					return null;
			else {
					Node<T> p = head;
					for(int i = 0; i < index; i++)
							p = p.next;
					T temp = p.data;
					p.data = element;
					return temp;
			}
	}

	@Override
	public String toString() {
			if(head == null)
					return "[]";
			Node<T> temp = head;
			StringBuilder str = new StringBuilder("[");
			while(temp.next != null) {
					str.append(temp.data + ", ");
					temp = temp.next;
			}

			str.append(temp.data);
			return new String(str + "]");
	}

	private class Node<E> {

			private E data;
			private Node<E> next;

			public Node(E input){
					this.data = input;
					this.next = null;
			}

			@Override
			public String toString() {
					return String.valueOf(this.data);
			}
	}

	@Override
	public Iterator<T> iterator() {
		return new ListIterator();
	}
	
	public class ListIterator implements Iterator<T> {

		private Node<T> p;
		
		private ListIterator() {
			p = head;
		}
		
		@Override
		public boolean hasNext() {
			return p.next != null;
		}

		@Override
		public T next() {
			p = p.next;
			return p.data;
		}
	}
}
