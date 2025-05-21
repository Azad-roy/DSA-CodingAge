import java.util.Scanner;

public class Queues {
    int size;
    int[] arr;

    public Queues(int size) {
        this.size = size;
        arr = new int[size];
    }

    int start = -1;
    int end = -1;
    int noe = 0;

    public void push(int elem) {
        if (noe == size) {
            System.out.println("Queues is full");
            return;
        }

        if (noe == 0) {
            start = 0;
            end = 0;
            arr[end] = elem;
            noe++;
            System.out.println("Number of element: " + noe);
        } else {
            end = (end + 1) % size;
            arr[end] = elem;
            noe++;
            System.out.println("Number of element: " + noe);
        }

    }

    // public int pop() {
    // if (start == -1) {
    // System.out.println("Stack is empty");
    // return 0; // esko false krna h, or neche me condition lga kr esko haldle krna
    // h.
    // }

    // int popedElem = arr[start];
    // start++;
    // end--;
    // noe--;
    // return popedElem;
    // }

    public int pop() {
        if (noe == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int poppedElem = arr[start];
        start = (start + 1) % size;
        noe--;

        return poppedElem;
    }

    public int capacity() {
        return noe;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the queues: ");
        int size = sc.nextInt();

        Queues q = new Queues(size);

        System.out.println("Pop element: " + q.pop());
        q.push(78);
        q.push(7);
        q.push(8);
        q.push(878);
        q.push(800);

        System.out.println("Pop element: " + q.pop());
        System.out.println("Pop element: " + q.pop());

        q.push(0);
        System.out.println("Pop element: " + q.pop());
        System.out.println("Pop element: " + q.pop());
        q.push(10);
        System.out.println("Pop element: " + q.pop());
        System.out.println("Pop element: " + q.pop());
        System.out.println("Size: " + q.capacity());
        q.push(1010);
        System.out.println("Pop element: " + q.pop());

    }
}
