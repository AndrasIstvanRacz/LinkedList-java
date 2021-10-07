package linkedList;

public class main {
	
	public static void main(String[] args) {

		LinkedList<Object> linkedList = new LinkedList<>();

		linkedList.add(1);
		linkedList.add( "cica");
		linkedList.add(null);
		linkedList.add("kutya");
		linkedList.add("balna");
		linkedList.add("eger");
		linkedList.insert(1, 6);
		linkedList.insert(6,0);
		linkedList.remove(3);

		System.out.println("LinkedList: " + linkedList);
		System.out.println("LinkedList index 0: " + linkedList.get(0));
		System.out.println("LinkedList size: " + linkedList.size());
		

	}

}
