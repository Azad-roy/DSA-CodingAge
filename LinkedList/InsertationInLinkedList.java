import java.util.Scanner;

public class InsertationInLinkedList {
    int data;
    InsertationInLinkedList next;

    public InsertationInLinkedList(int data) {
        this.data = data;
        next = null;
    }

    public static void display(InsertationInLinkedList head) {
        InsertationInLinkedList temp = head;

        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
    }

    public static InsertationInLinkedList insertDataAtHead(InsertationInLinkedList head, int newData) {
        if (head == null) {
            System.out.println("Linked is empty!!");
            return null;
        }

        InsertationInLinkedList newNode = new InsertationInLinkedList(newData);
        newNode.next = head;
        return newNode;
    }

    // public static void insertDataAtEnd(InsertationInLinkedList head, int
    // newData){
    // InsertationInLinkedList newNode = new InsertationInLinkedList(newData);

    // if(head == null){
    // System.out.println("Linked is empty!!");
    // return;
    // }

    // InsertationInLinkedList temp= head;

    // while(temp.next != null){
    // temp = temp.next;
    // }

    // temp.next=newNode;
    // }

    // Both are same Tail Insersation are same⤴️⤵️

    public static InsertationInLinkedList insertDataAtEnd(InsertationInLinkedList tail, int newData) {
        InsertationInLinkedList newNode = new InsertationInLinkedList(newData);

        if (tail == null) {
            System.out.println("Linked is empty!!");
            return null;
        }

        tail.next = newNode;
        return newNode;
    }

    public static InsertationInLinkedList insertDataAtkthPosition(InsertationInLinkedList head, int newData, int k) {
        InsertationInLinkedList temp = head;

        InsertationInLinkedList newNode = new InsertationInLinkedList(newData);
        for (int i = 1; i < k - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range.");
            return null;
        }

        if(k == 1){
            newNode.next = head;
            return newNode;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return temp;
    }

    public static InsertationInLinkedList deleteAtHead(InsertationInLinkedList head) {
        if (head == null) {
            System.out.println("List is empty!!");
            return null;
        }

        return head.next;
    }

    public static void deleteAtTail(InsertationInLinkedList head) {
        InsertationInLinkedList temp = head;

        if (temp == null) {
            System.out.println("LinkedList is empty!!");
            return;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public static InsertationInLinkedList deleteAtkthPosition(InsertationInLinkedList head, int k) {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return null;
        }

        InsertationInLinkedList temp = head;

        for (int i = 1; i < k - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Incorrect position, please enter correct position, for deletion!!");
            return head;
        }

        if(k == 1){
            return head.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of LinkedList: ");
        int size = sc.nextInt();

        System.out.print("Enter data 1: ");
        InsertationInLinkedList head = new InsertationInLinkedList(sc.nextInt());

        InsertationInLinkedList temp = head;

        for (int i = 2; i <= size; i++) {
            System.out.print("Enter data " + i + ": ");
            temp.next = new InsertationInLinkedList(sc.nextInt());
            temp = temp.next;
        }

        System.out.println("Original LinkedList!!");
        display(head);

        // System.out.println();
        //
        // System.out.println("Insert data at head");
        //
        // head = insertDataAtHead(head,78);
        // display(head);
        //
        //
        System.out.println();
        //

        // System.out.println("Insert data at tail");
        //
        // insertDataAtEnd(head, 100); 
        // both are same only methods are change ⤵️⤴️
        // temp = insertDataAtEnd(temp, 147);
        // display(head);

        
        System.out.println();
        
        System.out.println("Inser data at kth position");
        head = insertDataAtkthPosition(head,5600,1);
        display(head);

        // System.out.println();
        //
        // System.out.println("Delete data at head");
        //
        // head=deleteAtHead(head);
        // System.out.println();
        // display(head);
        //
        // System.out.println();
        //
        // System.out.println("Delete data at Tail");
        // deleteAtTail(head);
        // System.out.println();
        // display(head);

        System.out.println();

        System.out.println("Delete data at kth position");
        head = deleteAtkthPosition(head, 1);
        display(head);
    }
}