import java.util.Scanner;

public class StackTest {
    int[] arr;
    int size;

    public StackTest(int size){
        arr = new int[this.size =size];
    }

    int top = -1;

    public void push(int n){
        if(size == top){
            System.out.println("Stack is full!!");
            return;
        }

        top++;

        arr[top] = n;
    }

    public void pop(){
        if(top == -1){
            System.out.println("Stack is already empty, stopped doing pop");
            return;
        }

        int poppedElem = arr[top];

        top--;

        System.out.println("Popped element is: "+poppedElem);
    }

    public void size(){
        System.out.println("Size of the stack is: "+ (top+1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the stack: ");
        StackTest obj = new StackTest(sc.nextInt());

        obj.push(78);
        obj.push(92);
        obj.push(28);
        obj.push(45);

        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.size();
    }
}
