public class MakingLinkedList {
    int data;
    MakingLinkedList next;

    public MakingLinkedList(int data){
        this.data=data;
        this.next=null;
    }

    public static void print(MakingLinkedList head){
//        MakingLinkedList temp=head;

        while(head!=null){
            System.out.print(head.data + "->");
            head=head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        System.out.println("Enter ");
        MakingLinkedList head = new MakingLinkedList(1);

        head.next = new MakingLinkedList(2);
        head.next.next = new MakingLinkedList(3);
        head.next.next = new MakingLinkedList(3);

        print(head);
    }
}
