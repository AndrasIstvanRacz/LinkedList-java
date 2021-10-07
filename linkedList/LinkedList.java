package linkedList;

public class LinkedList<T> {

	private int counter;
	Node<T> head;

	public void add(T data) {

		if (head == null) {
			head = new Node<T>(data);
		}

		Node<T> newNode = new Node<T>(data);
		Node<T> current = head;

		if (current != null) {

			while (current.getNext() != null) {
				current = current.getNext();
			}

			current.setNext(newNode);
		}
		incrementCounter();
	}

	public void insert(T data, int index) {
		
		if (counter >= index) {
			
			Node<T> newNode = new Node<T>(data);
			Node<T> current = head;

			if (current != null) {
				
				for (int i = 0; i < index; i++) {
					current = current.getNext();
				}

				newNode.setNext(current.getNext());

				current.setNext(newNode);

				incrementCounter();

			}
		} else {
			System.err.println("Index out of range!");
		}
	}

	public T get(int index)
	{

		if (index < 0) {
			return null;
		}
		if (head != null) {
			Node<T> current = null;
			current = head.getNext();
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return null;

				current = current.getNext();
			}
			return current.getData();
		} else {
			return null;
		}
	}

	public boolean remove(int index) {
		
		if (index < 0 || index > size() - 1) {
			System.err.println("Index out of range!");
			return false;
		}
		if (head != null) {
			Node<T> current = head;
			for (int i = 0; i < index; i++) {
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());

			decrementCounter();
			return true;

		} else {
			System.err.println("Index out of range!");
			return false;
		}
	}

	public int size() {
		return getCounter();
	}

	private int getCounter() {
		return counter;
	}

	private void incrementCounter() {
		counter++;
	}

	private void decrementCounter() {
		counter--;
	}

	public String toString() {
		String output = "";

		if (head != null) {
			Node<T> current = head.getNext();
			while (current != null) {
				if (current.getData() == null) {
					output += "null ";
				} else {
					output += current.getData().toString() + " ";
				}
				current = current.getNext();
			}
		}
		return output;
	}

	@SuppressWarnings("hiding")
	private class Node<T> {
		T data;

		Node<T> next;

		Node(T dataValue) {
			data = dataValue;
			next = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T dataValue) {
			data = dataValue;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> nextValue) {
			next = nextValue;
		}
	}
}
