class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}



public class TreeExample {

    static void display(TreeNode treeNode){

        System.out.println(treeNode.data);
        if (treeNode.left!=null)
            display(treeNode.left);
        if (treeNode.right!=null)
            display(treeNode.right);
        return;

    }
    public static void main(String[] args) {
        // create root node
        TreeNode rootNode = new TreeNode(1);

        // create child nodes
        TreeNode leftChildNode = new TreeNode(2);
        TreeNode rightChildNode = new TreeNode(3);

        // link child nodes to root node
        rootNode.left = leftChildNode;
        rootNode.right = rightChildNode;
        rootNode.right.right=new TreeNode(4);
        rootNode.right.right.right=new TreeNode(5);
        rootNode.right.right.right.right=new TreeNode(6);
        rootNode.right.right.right.left=new TreeNode(7);
        rootNode.right.right.right.right.right=new TreeNode(8);

        display(rootNode);
    }
}
