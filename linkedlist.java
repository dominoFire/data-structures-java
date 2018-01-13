/**
 * One way LinkedList
 */
class LinkedList<T>
{
	public Node<T> head;

	public LinkedList()
	{
		this.head = null;
	}

	public void addHead(T value)
	{
		Node<T> new_node = new Node<>(value, this.head);
		this.head = new_node;
	}

	public void addTail(T value)
	{
		// get the ref. to last element
		Node<T> curr = this.head;
		while(curr.next != null) {
			curr = curr.next;
		}
		Node<T> new_node = new Node<>(value, null);
		curr.next = new_node;
	}

	public void delete(T value)
	{
		Node<T> curr = this.head;
		Node<T> prev = null;

		while(curr != null) {
			if(curr.value != null) {
				if(curr.value.equals(value))
					break;
			}
			else {
				if(value == null)
					break;
			}
			
			prev = curr;
			curr = curr.next;
		}

		if(curr != null) {
			if(prev == null) {
				this.head = curr.next;
			} 
			else {
				prev.next = curr.next;	
			}
		}
	}

	public boolean isEmpty()
	{
		return head == null;
	}

	public void printList()
	{
		System.out.println("Lista");
		Node<T> curr = this.head;
		while(curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
	}
}

class LinkedListExample
{
	public static void main(String... args)
	{
		LinkedList<Integer> list = new LinkedList<>();

		list.addHead(1);
		list.addHead(2);
		list.addHead(3);
		list.addTail(4);
		list.addTail(null);
		list.printList();

		list.delete(3);
		list.printList();

		list.delete(1);
		list.printList();

		list.delete(null);
		list.printList();
	}
}
