import java.util.Arrays;

/**
 * find max depth of the tree
 */
    class Node
    {
        int value;
        Node left, right;

        Node(int val)
        {
            value = val;
            left = right = null;
        }
    }

    public class BinaryTree
    {
        Node root;
        int maxDepth(Node root)
        {
            // Root being null means tree doesn't exist.
            if (root == null)
                return 0;

            // Get the depth of the left and right subtree
            // using recursion.
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            // Choose the larger one and add the root to it.
            if (leftDepth > rightDepth)
                return (leftDepth + 1);
            else
                return (rightDepth + 1);
        }

        // Driver code
        public static void main(String[] args)
        {
            System.out.println(args[0] + "  "+args[1]);
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.right.left = new Node(5);
            tree.root.right.right = new Node(6);
            tree.root.right.right.left = new Node(8);
            tree.root.right.left.right = new Node(7);
            System.out.println("Max depth: " + tree.maxDepth(tree.root));
        }
    }

