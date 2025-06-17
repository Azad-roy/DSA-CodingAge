// package Test;

import java.util.Scanner;

public class Stacks {
    int size;
    int[] arr;

    public Stacks(int size) {
        this.size = size;
        arr = new int[size];
    }

    int top = -1;

    public void push(int n) {
        if (top == size - 1) {
            System.out.println("Stack is full");
            return;
        }

        top++;
        arr[top] = n;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top--];
    }

    public void size() {
        System.out.println("Size of stack is : " + (top + 1));
    }

    public void reverDisplay() {
        for (int i = 0; i <= top; i++) {
            for (int j = i+1; j <= top; j++) {
                // int temp = 0;
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the stack: ");
        int size = sc.nextInt();
        Stacks stk = new Stacks(size);

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element at index " + (i + 1) + ": ");
            int in = sc.nextInt();
            stk.push(in);
        }

        System.out.println("Pop element: " + stk.pop());

        stk.size();

        System.out.println("Reverse:- ");
        stk.reverDisplay();
    }
}
