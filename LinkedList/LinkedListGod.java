import java.util.Scanner;

public class LinkedListGod {
    int data;
    LinkedListGod next=null;

    public LinkedListGod(int data){
        this.data=data;
    }

    public void LinkedListData(LinkedListGod head){
        LinkedListGod temp = head;

        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");

//        for( ; temp.next != null; temp = temp.next){
//            System.out.print(temp.data+"->");
//        }
//        System.out.println("NULL");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the LinkedList: ");
        int size = sc.nextInt();

        System.out.println("Enter first LinkedList data: ");
        LinkedListGod head = new LinkedListGod(sc.nextInt());

        for(int i=1;i<size;i++){
            System.out.println("Enter LinkedList data "+(i+1)+": ");
            head.next = new LinkedListGod(sc.nextInt());
        }

        head.LinkedListData(head);

    }
}
