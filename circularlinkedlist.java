class CircularLinkedList<T>
{
	Node<T> head;

	public void insert(T value)
	{
		Node<T> curr = this.head;

		while(curr!=null && curr.next != this.head) {
			curr = curr.next;
		}

		if(curr == null) {
			this.head = new Node<>(value, null);
			this.head.next = this.head;
		}
		else {
			Node<T> new_node = new Node<>(value, this.head);
			curr.next = new_node;
			this.head = new_node;
		}
	}

	public void print1Cycle() 
	{
		Node<T> curr = this.head;

		System.out.println("Lista Circular");
		do {
			if(curr != null) {
				System.out.println(curr.value);
				curr = curr.next;
			}
		} while(curr != this.head);
	}

	
}

class CircularLinkedListExample
{
	public static void main(String[] args) 
	{
		CircularLinkedList<Integer> list = new CircularLinkedList<>();
		list.print1Cycle();

		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.print1Cycle();

		list.insert(null);
		list.insert(30290390);
		list.print1Cycle();
	}
}
