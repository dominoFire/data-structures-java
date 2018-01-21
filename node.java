class Node<T>
{
    public Node<T> next;
    public T value;

    public Node(T value, Node<T> next)
    {
        this.value = value;
        this.next = next;
    }

    public static <E> boolean hasCycle(Node<E> head)
    {
        Node<E> slow = head, fast = head;

        do {
            if(slow != null) {
                slow = slow.next;
            }
            if(fast != null) {
                fast = fast.next;
                if(fast != null) {
                    fast = fast.next;
                }
            }
        } while(slow != null && fast != null && slow != fast);

        return fast != null && slow == fast;
    }
}


class NodeExample
{
    public static void main(String[] args) 
    {
        Node<Integer> n1 = new Node<>(1, null);
        Node<Integer> n2 = new Node<>(2, n1);
        Node<Integer> n3 = new Node<>(3, n2);
        Node<Integer> n4 = new Node<>(4, n3);
        Node<Integer> n5 = new Node<>(5, n4);

        System.out.println(Node.hasCycle(n5));

        n1.next = n3;
        
        System.out.println(Node.hasCycle(n5));
    }
}
