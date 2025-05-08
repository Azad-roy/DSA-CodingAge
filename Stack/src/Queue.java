import java.util.Scanner;

public class Queue {
    int size;
    int[] arr;

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
    }

    int start = -1;
    int end = -1;
    int noe = 0;

    public void push(int elem) {
        if (noe == size) {
            System.out.println("Queue is full");
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

    public int pop() {
        if (start == -1) {
            System.out.println("Stack is empty");
            return 0; // esko false krna h, or neche me condition lga kr esko haldle krna h.
        }

        int popedElem = arr[start];
        start++;
        end--;
        noe--;
        return popedElem;
    }

    public void print(){
        for(int elem: arr){
            System.out.print(elem+" ");
        }
    }

    public int capacity() {
        return noe;
    }

    // public void print(){
    //     for(int i=0;i<noe;i++){ // Added by ankit
    //         System.out.print(arr[(start+i)%size]+" ");
    //     }
    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the queue: ");
        int size = sc.nextInt();

        Queue q = new Queue(size);

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
        System.out.println("Size: " + q.capacity());

        // q.print();
    }
}
