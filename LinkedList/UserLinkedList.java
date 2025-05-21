import java.util.Scanner;

public class UserLinkedList {

    int data;
    UserLinkedList next;

    public UserLinkedList(int data) {
        this.data = data;
        this.next = null;
    }

    public static void print(UserLinkedList head) {
        UserLinkedList temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void count(UserLinkedList head) {
        int count = 0;
        UserLinkedList temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Count is: " + count);
    }

    public static void findEven(UserLinkedList head) {
        UserLinkedList temp = head;
        int sum = 0;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                sum += temp.data;
            }
            temp = temp.next;
        }
        System.out.println("Sum of even number is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of LinkedList: ");
        int size = sc.nextInt();

        System.out.print("Enter LinkedList data 1: ");
        UserLinkedList head = new UserLinkedList(sc.nextInt());
        UserLinkedList temp = head;

        for (int i = 2; i <= size; i++) {
            System.out.print("Enter LinkedList data " + i + ": ");
            temp.next = new UserLinkedList(sc.nextInt());

            temp = temp.next;
        }
        print(head);
        count(head);
        findEven(head);

        // Converting Array to LinkedList
        int[] arr = new int[size];

        System.out.println("Enter the element at index 1: ");
        UserLinkedList head2 = new UserLinkedList(sc.nextInt());
        UserLinkedList arrayTemp = head2;

        for (int i = 0; i < size - 1; i++) {
            System.out.println("Enter element at index " + (i + 2) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            arrayTemp.next = new UserLinkedList(arr[i]);
            arrayTemp = arrayTemp.next;
        }
        
        print(head2);
        count(head2);
        findEven(head2);
    }
}
