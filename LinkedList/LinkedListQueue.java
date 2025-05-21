public class LinkedListQueue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node start = null;
    Node end = null;
    int noe = 0;

    public void push(int elem) {
        Node newNode = new Node(elem);

        if (end == null) {
            start = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            end = newNode;
        }

        noe++;
        // System.out.println("Number of elements: " + noe);
    }

    public int pop() {
        if (start == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int popped = start.data;
        start = start.next;
        if (start == null) {
            end = null;
        }
        noe--;
        return popped;
    }

    public int capacity() {
        return noe;
    }

    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();

        System.out.println("Pop element: " + q.pop());
        q.push(78);
        q.push(7);
        q.push(8);

        System.out.println("Pop element: " + q.pop());
        System.out.println("Pop element: " + q.pop());

        q.push(0);
        System.out.println("Pop element: " + q.pop());
        System.out.println("Pop element: " + q.pop());
        q.push(10);
        // System.out.println("Pop element: " + q.pop());
        // System.out.println("Pop element: " + q.pop());
        // System.out.println("noe: " + q.capacity());
        // q.push(1010);
        // System.out.println("Pop element: " + q.pop());
    }
}
