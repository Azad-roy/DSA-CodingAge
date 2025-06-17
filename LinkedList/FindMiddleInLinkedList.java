import java.util.Scanner;

public class FindMiddleInLinkedList {
    int data;
    FindMiddleInLinkedList next;

    public FindMiddleInLinkedList(int data){
        this.data = data;
        this.next = null;
    }

    public static void display(FindMiddleInLinkedList head){
        if(head == null){
            System.out.println("LinkedList is empty!!");
            return;
        }

        FindMiddleInLinkedList temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the LinkedList: ");
        int size = sc.nextInt();

        System.out.println("Enter data 1: ");
        FindMiddleInLinkedList head = new FindMiddleInLinkedList(sc.nextInt());

        FindMiddleInLinkedList temp = head;

        for(int i = 2; i<=size; i++){
            System.out.println("Enter data " + i + ": ");
            temp.next = new FindMiddleInLinkedList(sc.nextInt());
            temp = temp.next;
        }

        display(head);
    }
}
