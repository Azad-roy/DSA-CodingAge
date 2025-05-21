import java.util.Scanner;

public class DoublyLinkedList2 {
    int data;
    DoublyLinkedList2 next;
    DoublyLinkedList2 prev;

    public DoublyLinkedList2(int data) {
        this.data = data;
        next = null;
        prev = null;
    }

    public static void print(DoublyLinkedList2 head, DoublyLinkedList2 tail) {
        DoublyLinkedList2 temp = head;
        DoublyLinkedList2 temp2 = tail;

        System.out.println("Printing forward:-");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();

        System.out.println("Printing reversed:-");
        while (temp2 != null) {
            System.out.print(temp2.data + " ");
            temp2 = temp2.prev;
        }
    }

    public static DoublyLinkedList2 insertAtHead(DoublyLinkedList2 head, int newData) {
        if (head == null) {
            System.out.println("LinkedList is empty!!");
            return null;
        }

        DoublyLinkedList2 temp = head;

        DoublyLinkedList2 newNode = new DoublyLinkedList2(newData);

        newNode.next = temp;
        temp.prev = newNode;

        return newNode;
    }

    public static DoublyLinkedList2 insertAtTail(DoublyLinkedList2 tail, int newData) {
        if (tail == null) {
            System.out.println("LinkedList is empty!!");
            return null;
        }

        // DoublyLinkedList2 temp = tail;

        DoublyLinkedList2 newNode = new DoublyLinkedList2(newData);

        // while(temp.next != null){
        // temp = temp.next;
        // }

        newNode.prev = tail;
        tail.next = newNode;
        return newNode;
    }

    public static DoublyLinkedList2 insertAtkthPosition(DoublyLinkedList2 head, int k, int newData) {
        if (head == null) {
            System.out.println("LinkedList is empty!!");
            return null;
        }

        DoublyLinkedList2 newNode = new DoublyLinkedList2(newData);

        if (k == 1) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }

        DoublyLinkedList2 temp = head;

        for (int i = 1; i < k - 1 && temp != null; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

        return head;
    }

    public static DoublyLinkedList2 deleteAtHead(DoublyLinkedList2 head) {
        if (head == null) {
            System.out.println("LinkedList is empty!!");
            return null;
        }

        head.next.prev = null;
        return head.next;
    }

    public static DoublyLinkedList2 deleteAtTail(DoublyLinkedList2 tail) {
        if (tail == null) {
            System.out.println("LinkedList is empty!!");
            return null;
        }

        tail.prev.next = null;
        return tail.prev;
    }

    public static DoublyLinkedList2 deleteAtkthPosition(DoublyLinkedList2 head, int k){

        if(head == null){
            System.out.println("LinkedList is empty!!");
            return null;
        }

        DoublyLinkedList2 temp = head;

        for(int i=1; i<k-1 && head.next != null;i++){
            temp = temp.next;
        }

        try{
            if(k == 1){
                head.next.prev = null;
                return head.next;
            }
        }catch(Exception e){
            System.out.println("Exceptation: "+e.getMessage());
        }

        temp.next.prev = temp;
        temp.next.next.prev = temp;
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the LinkedList: ");
        int size = sc.nextInt();

        // System.out.println("Enter LinkedList data 1: ");
        // DoublyLinkedList2 head = new DoublyLinkedList2(sc.nextInt());

        // DoublyLinkedList2 temp = head;

        // for (int i = 2; i <= size; i++) {
        //     System.out.println("Enter LinkedList data " + i + ": ");
        //     temp.next = new DoublyLinkedList2(sc.nextInt());
        //     temp.next.prev = temp;
        //     temp = temp.next;
        // }

        // print(head, temp);

        // System.out.println();

        // System.out.println("Insert at head:-");
        // head = insertAtHead(head, 23);
        // print(head, temp);

        // System.out.println();

        // System.out.println("Insert at tail:-");
        // temp = insertAtTail(temp, 71);
        // print(head, temp);

        // System.out.println();

        // System.out.println("Insert at kth position:-");
        // head = insertAtkthPosition(head, 2, 154);
        // print(head, temp);

        // System.out.println();

        // System.out.println("Delete at Head:-");
        // head = deleteAtHead(head);
        // print(head, temp);

        // System.out.println();

        // System.out.println("Delete at Tail:-");
        // temp = deleteAtTail(temp);
        // print(head, temp);

        // System.out.println();

        // System.out.println("Delete at kth position:-");
        // head = deleteAtkthPosition(head, 1);
        // print(head, temp);

        System.out.println();

        System.out.println("Enter element 1 in LinkedList: ");
        
        DoublyLinkedList2 head2 = new DoublyLinkedList2(sc.nextInt());
        DoublyLinkedList2 temp2 = head2;

        int[] arr = new int[size];

        for(int i=0;i<size-1;i++){
            System.out.println("Enter element at index "+(i+2)+": ");
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<size-1; i++){
            temp2.next = new DoublyLinkedList2(arr[i]);
            temp2.next.prev = temp2;
            temp2 = temp2.next;
        }

        print(head2, temp2);

        System.out.println();
        head2 = insertAtHead(head2, 15);
        print(head2, temp2);
        
        sc.close();
    }
}
