class Node<T>
{
	public Node<T> next;
	public T value;

	public Node(T value, Node<T> next)
	{
		this.value = value;
		this.next = next;
	}
}
