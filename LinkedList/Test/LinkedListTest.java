// package Test;
import java.util.Scanner;

public class LinkedListTest {
    int data;
    LinkedListTest next;

    public LinkedListTest(int data){
        this.data = data;
        LinkedListTest next = null;
    }

    public static void print(LinkedListTest head){
        LinkedListTest temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the LinkedList: ");
        int size = sc.nextInt();

        System.out.println("Enter data 1: ");
        L head = new LinkedListTest(sc.nextInt());

        LinkedListTest temp = head;

        for(int i = 2; i<=size; i++){
            System.out.println("Enter data "+i+": ");
            temp.next = new LinkedListTest(sc.nextInt());
            temp = temp.next;
        }

        print(head);
    }
}
