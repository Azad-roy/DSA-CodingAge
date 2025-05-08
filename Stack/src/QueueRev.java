class Queue {
    int[] q;
    int start, end, size;

    Queue(int capacity) {
        q = new int[capacity];
        start = 0;
        end = 0;
        size = 0;
    }

    void push(int x) {
        if (size == q.length) {
            System.out.println("Queue is full");
            return;
        }
        q[end] = x;
        end = (end + 1) % q.length;
        size++;
    }

    void print() {
        for (int i = start; i < start + size; i++) {
            System.out.print(q[i % q.length] + " ");
        }
        System.out.println();
    }
}