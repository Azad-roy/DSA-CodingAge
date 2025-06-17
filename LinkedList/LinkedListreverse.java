import java.util.Scanner;

public class LinkedListreverse {
    int data;
    LinkedListreverse next;
    LinkedListreverse prev;

    public LinkedListreverse(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public LinkedListreverse reverse(LinkedListreverse head) {
        LinkedListreverse temp = head;

        while (temp != null) {
            LinkedListreverse front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static void print(LinkedListreverse head) {
        LinkedListreverse temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the LinkedList: ");
        int size = sc.nextInt();

        System.out.println("Enter data 1: ");
        LinkedListreverse head = new LinkedListreverse(sc.nextInt());

        LinkedListreverse temp = head;

        for (int i = 2; i <= size; i++) {
            System.out.println("Enter data " + i + ": ");
            temp.next = new LinkedListreverse(sc.nextInt());
            temp = temp.next;
        }

        LinkedListreverse rev = head.reverse(head);

        print(rev);
    }
}
