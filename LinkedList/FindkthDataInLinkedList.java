import java.util.Scanner;

public class FindkthDataInLinkedList {
    int data;
    FindkthDataInLinkedList next;

    public FindkthDataInLinkedList(int data) {
        this.data = data;
        next = null;
    }

    public static void print(FindkthDataInLinkedList head){
        FindkthDataInLinkedList temp = head;

        while (temp != null) {
            System.out.print(temp.data  + "->");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public static void findkthData(FindkthDataInLinkedList head ,int k){
        FindkthDataInLinkedList temp = head;

        int count = 0;
        boolean flag = false;

        while(temp != null){
            if(count == k){
                flag = true;
                break;
            }
            count++;
            temp = temp.next;
        }
        
        if(flag){
            System.out.println(temp.data + " is at index " + k);
        }else{
            System.out.println("Please enter valid index number!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the LinkedList: ");
        int size = sc.nextInt();

        System.out.println("Enter data 1: ");
        FindkthDataInLinkedList head = new FindkthDataInLinkedList(sc.nextInt());
        FindkthDataInLinkedList temp = head;

        for(int i = 2; i <= size; i++){
            System.out.println("Enter data "+ i + ": ");
            temp.next = new FindkthDataInLinkedList(sc.nextInt());
            temp = temp.next;
        }

        System.out.println("Enter the index number to get the data: ");
        int kth = sc.nextInt();

        print(head);

        findkthData(head, kth);

    }
}
