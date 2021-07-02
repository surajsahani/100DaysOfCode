class Node {
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}
public class BinaryTree {
    Node root;

    BinaryTree(int key){
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    // Tranverse Inorder
    public void tranverseInOrder(Node node){
        if (node !=null) {
            tranverseInOrder(node.left);
            System.out.println(" " + node.key);
            tranverseInOrder(node.right);
        }
    }

    // Traverse Postorder
    public void traversePostOrder(Node node) {
        if (node !=null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println(" "+ node.key);
        }
    }

    // Traverse Preorder
    public void traversePreOrder(Node node){
        if (node !=null) {
            System.out.println(" "+ node.key);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);

        System.out.println("Pre order Traversal: ");
        tree.traversePreOrder(tree.root);
        System.out.println("\nIn order Traversal: ");
        tree.tranverseInOrder(tree.root);
        System.out.println("\nPost order Traversal: ");
        tree.traversePostOrder(tree.root);
    }
}
