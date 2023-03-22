// A simple inorder traversal based Java program
// to find k-th smallest element in a BST.

import java.io.*;
// A BST node
class Node1 {
    int data;
    Node1 left, right;
    Node1(int x)
    {
        data = x;
        left = right = null;
    }
}

public class GFG {

    static int count = 0;
    // Recursive function to insert an key into BST
    public static Node1 insert(Node1 root, int x)
    {
        if (root == null)
            return new Node1(x);
        if (x < root.data)
            root.left = insert(root.left, x);
        else if (x > root.data)
            root.right = insert(root.right, x);
        return root;
    }

    // Function to find k'th smallest element in BST
    // Here count denotes the number of nodes processed so far
    public static Node1 kthSmallest(Node1 root, int k)
    {
        // base case
        if (root == null)
            return null;

        // search in left subtree
        Node1 left = kthSmallest(root.left, k);

        // if k'th smallest is found in left subtree, return it
        if (left != null)
            return left;

        // if current element is k'th smallest, return it

        count++;
        if (count == k)
            return root;

        // else search in right subtree
        return kthSmallest(root.right, k);
    }

    // Function to find k'th smallest element in BST
    public static void printKthSmallest(Node1 root, int k)
    {
        Node1 res = kthSmallest(root, k);
        if (res == null)
            System.out.println("There are less than k nodes in the BST");
        else
            System.out.println("K-th Smallest Element is " + res.data);
    }

    public static void main(String[] args)
    {
        Node1 root = null;
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 };
        for (int x : keys)
            root = insert(root, x);
        int k = 8;
        printKthSmallest(root, k);
    }
}

