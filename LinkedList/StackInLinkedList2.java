public class StackInLinkedList2 {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node top = null;
    int count = 0;

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        count++;
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack LinkedList is empty!!, Not pop further");
            return;
        }

        top = top.next;
        count--;
    }

    public void peek(){
        if(top == null){
            System.out.println("Stack LinkedList top is empty!!");
            return;
        }

        System.out.println("Top data is: "+top.data);
    }
    
    public void size(){
        if(top == null){
            System.out.println("Stack LinkedList size is Empty");
            return;
        }

        System.out.println("Size: "+count);
    }

    public void print(){
        Node temp = top;

        if(temp == null){
            System.out.println("Stack LinkedList is empty!!");
            return;
        }

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        StackInLinkedList2 obj = new StackInLinkedList2();

        obj.push(74);
        obj.push(96);
        obj.push(14);
        obj.push(56);
        obj.push(56);
        obj.push(56);
        obj.push(56);
        obj.push(56);

        obj.size();
        
        obj.pop();
        obj.pop();
        obj.pop();
        // obj.pop();
        // obj.pop();
        // obj.pop();

        obj.peek();
        
        obj.size();

        obj.push(789);
        
        obj.size();
        obj.peek();

        obj.print();
    }
}