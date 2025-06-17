public class CreateTree {
    int data;
    CreateTree left;
    CreateTree right;

    public CreateTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static void preOrder(CreateTree node) {

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(CreateTree node) {

        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void postOrder(CreateTree node) {

        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        CreateTree root = new CreateTree(1);

        CreateTree temp = root;

        temp.left = new CreateTree(2);
        temp.right = new CreateTree(3);

        temp.left.left = new CreateTree(4);
        temp.left.right = new CreateTree(5);

        temp.right.left = new CreateTree(6);
        temp.right.right = new CreateTree(7);

        preOrder(temp);
        System.out.println();

        inOrder(temp);
        System.out.println();

        postOrder(temp);
    }
}