import java.util.Scanner;

public class CircularDoublyLinkedList {
    int data;
    CircularDoublyLinkedList next;
    CircularDoublyLinkedList prev;

    public CircularDoublyLinkedList(int data){
        this.data=data;
        next = null;
        prev = null;
    }

    public static void print(CircularDoublyLinkedList head, CircularDoublyLinkedList tail){
        CircularDoublyLinkedList headTemp = head;
        CircularDoublyLinkedList tailTemp = tail;

        System.out.println("Forward Direction:-");
        int i=0;
        while(i<10 && headTemp != null){
            System.out.print(headTemp.data+" ");
            headTemp = headTemp.next;
            i++;
        }
        System.out.println();

        System.out.println("Reversed Direction:-");
        int j=0;
        while(j<10 && tailTemp != null){
            System.out.print(tailTemp.data+" ");
            tailTemp = tailTemp.prev;
            j++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the LinkedList: ");
        int size = sc.nextInt();

        System.out.println("Enter data 1: ");
        CircularDoublyLinkedList head = new CircularDoublyLinkedList(sc.nextInt());

        CircularDoublyLinkedList temp = head;

        for(int i=2; i<=size; i++){
            System.out.println("Enter data "+i+": ");
            temp.next = new CircularDoublyLinkedList(sc.nextInt());
            temp.next.prev = temp;
            temp = temp.next;
        }

        temp.next = head;
        head.prev = temp;

        print(head,temp);

        // CircularDoublyLinkedList circular = temp;

        // for(int i=0;i<size;i++){
        //     System.out.print(circular.data+" ");
        //     circular = circular.next;
        // }
        
        // int i=0;
        // while(i < 10){
        //     System.out.print(circular.data+" ");
        //     circular = circular.prev;
        //     i++;
        // }

    }
}
