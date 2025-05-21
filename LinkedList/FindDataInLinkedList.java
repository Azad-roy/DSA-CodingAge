import java.util.Scanner;

public class FindDataInLinkedList {
    int data;
    FindDataInLinkedList next;

    public FindDataInLinkedList(int data) {
        this.data = data;
        next = null;
    }

    public static void print(FindDataInLinkedList head){
        FindDataInLinkedList temp = head;

        while (temp != null) {
            System.out.print(temp.data  + "->");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public static void findkthData(FindDataInLinkedList head ,int data){
        FindDataInLinkedList temp = head;
        int count = 0;
        boolean flag = false;
        while(temp != null){
            if(temp.data == data){
                flag = true;
                break;
            }
            count++;
            temp = temp.next;
        }
        
        if(flag){
            System.out.println(data+" was found is at index " + count);
        }else{
            System.out.println(data+" is not in LinkedList");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the LinkedList: ");
        int size = sc.nextInt();

        System.out.println("Enter data 1: ");
        FindDataInLinkedList head = new FindDataInLinkedList(sc.nextInt());
        FindDataInLinkedList temp = head;

        for(int i = 2; i <= size; i++){
            System.out.println("Enter data "+ i + ": ");
            temp.next = new FindDataInLinkedList(sc.nextInt());
            temp = temp.next;
        }

        System.out.println("Enter the foundable data: ");
        int data = sc.nextInt();

        print(head);

        findkthData(head, data);

    }
}
