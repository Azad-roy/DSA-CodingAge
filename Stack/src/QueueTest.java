import java.util.Scanner;

public class QueueTest {
    int[] arr;
    int size;


    public QueueTest(int size){
        arr = new int[this.size = size];
    }

    int start = -1;
    int end = -1;
    int noe = 0;

    public void push(int n){
        if(noe == size){
            System.out.println("Queue is full, don't push further!!");
            return;
        }

        if(noe == 0){
            start = 0;
            end = 0;

            arr[end] = n;
            noe++;
        }else{
            end = (end +1) % size;
            arr[end] = n;
            noe++;
        }

    }

    public void pop(){
        if(noe == 0){
            System.out.println("Queue is empty, and you can't pop!!");
            return;
        }

        int poppedElem = arr[start];
        start = (start +1) % size;
        noe--;

        System.out.println("Popped element is: "+poppedElem);
    }

    public void capacity(){
        System.out.println("Size of queue is: "+noe);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the queue: ");
        int size = sc.nextInt();

        QueueTest q = new QueueTest(size);

        q.push(0);
        q.push(8262);
        q.push(522);
        q.push(78);
        
        q.pop();
        q.pop();
        
        q.push(111);
        q.push(222);
        
        q.pop();
        q.pop();
        q.pop();
    }
}
