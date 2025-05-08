public class Stack{
    int top = -1;
    int[] arr = new int[10];

    public void push(int n) {
        if (this.top == 10 - 1) {
            System.out.println("Stack is full");
        } else {
            this.top++;
            arr[top] = n;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty!!");
            return;
        }
        this.top--;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!!");
            return -1;
        }
        return arr[top];
    }

    public int size() {
        return (top == -1) ? 0 : top + 1;
    }

    public void reverse() {
        int start = 0;
        int end = top;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Print reversed stack
        System.out.println("Reversed stack elements:");
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(45);
        st.push(5);
        st.push(450);

        System.out.println("Size of the stack is: " + st.size());
        System.out.println("Top is: " + st.peek());
        st.pop();
        System.out.println("Size of the stack is: " + st.size());
        System.out.println("Top is: " + st.peek());
        st.push(170);
        st.push(10);
        st.push(120);
        System.out.println("Size of the stack is: " + st.size());
        System.out.println("Top is: " + st.peek());

        st.reverse();
    }
}
