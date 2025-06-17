import java.util.Scanner;

public class Paliindrome_Using_LinkedList_and_Stack {

    int data;
    Paliindrome_Using_LinkedList_and_Stack next;

    public Paliindrome_Using_LinkedList_and_Stack(int data){
        this.data = data;
        this.next = null; // fix the constructor
    }

    public static void print(Paliindrome_Using_LinkedList_and_Stack head){
        Paliindrome_Using_LinkedList_and_Stack temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static boolean isPalindrome(Paliindrome_Using_LinkedList_and_Stack head, int size) {
        // Step 1: Push all data to a stack
        Stack stack = new Stack(size);
        Paliindrome_Using_LinkedList_and_Stack temp = head;

        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        // Step 2: Compare with linked list nodes
        temp = head;
        while(temp != null){
            int poppedData = stack.pop();
            if(poppedData != temp.data){
                return false;
            }
            temp = temp.next;
        }

        return true;
    }

    // Stack class as per your logic
    static class Stack {
        int[] arr;
        int size;
        int top = -1;

        public Stack(int size){
            arr = new int[this.size = size];
        }

        public void push(int n){
            if(top == size - 1){
                System.out.println("Stack is full!");
                return;
            }
            arr[++top] = n;
        }

        public int pop(){
            if(top == -1){
                System.out.println("Stack is empty!");
                return -1;  // assuming -1 won't be used in data
            }
            return arr[top--];
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the linked list: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size!");
            return;
        }

        System.out.print("Enter data 1: ");
        Paliindrome_Using_LinkedList_and_Stack head = new Paliindrome_Using_LinkedList_and_Stack(sc.nextInt());
        Paliindrome_Using_LinkedList_and_Stack temp = head;

        for(int i = 2; i <= size; i++){
            System.out.print("Enter data " + i + ": ");
            temp.next = new Paliindrome_Using_LinkedList_and_Stack(sc.nextInt());
            temp = temp.next;
        }

        System.out.print("Linked List: ");
        print(head);

        if (isPalindrome(head,size)) {
            System.out.println("✅ The linked list is a PALINDROME.");
        } else {
            System.out.println("❌ The linked list is NOT a palindrome.");
        }
    }

}
